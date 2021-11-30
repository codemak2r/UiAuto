package com.chancetop.qa.core;

import com.chancetop.qa.core.actions.BaseAction;
import com.chancetop.qa.core.actions.ClickAction;
import com.chancetop.qa.model.TCaseStep;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zw.wen
 */
public class Browser {
    Logger logger  = LoggerFactory.getLogger(Browser.class);

    private WebDriver webDriver ;
    private Map<String, String> parameters = new HashMap<>(16);

    public Browser(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
    }

    public void execute(TCaseStep caseStep) {
        String action = caseStep.getAction();
        BaseAction.getAction(action).execute(caseStep);
    }

}
