package com.chancetop.qa.core;

import cn.hutool.json.JSONUtil;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverProvider;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.LogEvent;
import com.codeborne.selenide.logevents.SelenideLog;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import io.qameta.allure.AllureResultsWriter;
import io.qameta.allure.Step;
import io.qameta.allure.aspects.AttachmentsAspects;
import io.qameta.allure.aspects.StepsAspects;
import io.qameta.allure.model.StepResult;
import io.qameta.allure.model.TestResult;
import io.qameta.allure.model.TestResultContainer;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import io.qameta.allure.test.AllureResults;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.test.RunUtils.runWithinTestContext;

/**
 * @author: zw.wen
 */
public class SeleniumTest {
    Logger logger = LoggerFactory.getLogger(SeleniumTest.class);

    @Test
    public void testSelenoid() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "96.0");
        Map<String, Object> selenoidCap = new HashMap<>(16);
        selenoidCap.put("enableVNC", true);
        selenoidCap.put("enableVideo", true);
        capabilities.setCapability("selenoid:options", selenoidCap);
        RemoteWebDriver driver = new RemoteWebDriver(
                URI.create("http://127.0.0.1:4444/wd/hub").toURL(),
                capabilities
        );

        driver.manage().window().setSize(new Dimension(1360,800));
        driver.get("https://portal.foodtruck-qa.com/");
    }

    @Test
    public void testSelenide() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "96.0");
        Map<String, Object> selenoidCap = new HashMap<>(16);
        selenoidCap.put("enableVNC", true);
        selenoidCap.put("enableVideo", true);
        capabilities.setCapability("selenoid:options", selenoidCap);
        RemoteWebDriver driver = new RemoteWebDriver(
                URI.create("http://127.0.0.1:4444/wd/hub").toURL(),
                capabilities
        );

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
                .includeSelenideSteps(true)
                .enableLogs(LogType.BROWSER, Level.ALL));

        WebDriverRunner.setWebDriver(driver);
        open("https://www.baidu.com");

        $(By.xpath("//*[@id=\"s-top-left\"]/a[1]")).click();

    }
    private static StepResult extractStepFromResults(AllureResults results) {
        return results
                .getTestResults().iterator().next()
                .getSteps().iterator().next();
    }

}
