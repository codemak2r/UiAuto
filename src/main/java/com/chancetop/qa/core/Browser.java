package com.chancetop.qa.core;

import com.chancetop.qa.model.TBrowser;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.Waiter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.support.ui.Wait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: zw.wen
 */
public class Browser {
    Logger logger  = LoggerFactory.getLogger(Browser.class);

    private WebDriver webDriver ;
    private Map<String, String> parameters = new HashMap<>(16);
    private Map<String, String> windowHanles = new HashMap<>(16);


    public Browser(TBrowser tBrowser){
        String url = tBrowser.getRemoteUrl();
        String browserName = tBrowser.getBrowserName();
        String browserVersion = tBrowser.getBrowserVersion();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("browserVersion", browserVersion);
        Map<String, Object> selenoidCap = new HashMap<>(16);
        selenoidCap.put("enableVNC", true);
        selenoidCap.put("enableVideo", true);
        capabilities.setCapability("selenoid:options", selenoidCap);

        try {
            this.webDriver = new RemoteWebDriver(new URL(url), capabilities);
            //WebDriverRunner.setWebDriver(webDriver);
            webDriver.manage().window().setSize(new Dimension(1360,768));
        } catch (MalformedURLException e) {
            logger.error(e.getMessage());
        }
    }

    public WebElement findElement(String selector, String element){
        By by = this.getByObj(selector,element);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement htmlElement = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
        return htmlElement;
    }

    public By getByObj(String selector, String element){
        By by = null;
        try {
            Method m = By.class.getDeclaredMethod(selector, String.class);
            by = (By) m.invoke(null, element);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return by;
    }

    public void click(String selector, String element) {
         this.findElement(selector,element).click();
    }

    public void selectByText(String selector, String element, String value) {
        value = this.parse(value);
        Select select = new Select(this.findElement(selector,element));
        select.selectByValue(value);
    }

    public void selectByIndex(String selector, String element, int i) {
        Select select = new Select(this.findElement(selector,element));
        select.selectByIndex(i);
    }

    public void executeJavascript(String selector, String element,  String code){
        JavascriptExecutor js = (JavascriptExecutor)this.webDriver;
        js.executeScript(code, this.findElement(selector, element));
    }

    public void switchNextWindow(){
        String originalWindow = this.webDriver.getWindowHandle();
        this.windowHanles.put("originalWindow", originalWindow );
        for (String windowHandle : webDriver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                webDriver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void input(String selector, String element, String value){
        // 解析参数
        value = this.parse(value);
        this.findElement(selector, element).sendKeys(value);
    }

    public void switchPreWindow(){
        String pre = this.windowHanles.get("originalWindow");
        this.webDriver.switchTo().window(pre);
    }

    public void close(){
        this.webDriver.close();
    }

    public void quit(){
        this.webDriver.quit();
    }

    public void moveToElement(WebElement webElement){
        Actions actions = new Actions(this.webDriver);
        actions.moveToElement(webElement);
    }

    public void storeTitle(){
        String title = this.webDriver.getTitle();
        this.parameters.put("title", title);
    }

    public void storeCurrentUrl(){
        String url = this.webDriver.getCurrentUrl();
        this.parameters.put("currentUrl", url);
    }

    public String parse(String value){
        if(value.startsWith("$")){
            String key = value.replaceAll("\\$\\{|\\}", "");
            return parameters.get(key);
        }
        return value;
    }

    public void sleep(String seconds){
        this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.getLong(seconds)));
    }



}
