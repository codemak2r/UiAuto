package com.chancetop.qa.service.impl;

import cn.hutool.json.JSONUtil;
import com.chancetop.qa.common.enums.BrowserOperationEnums;
import com.chancetop.qa.core.Browser;
import com.chancetop.qa.examples.TBrowserExample;
import com.chancetop.qa.examples.TCaseBrowserExample;
import com.chancetop.qa.examples.TCaseExample;
import com.chancetop.qa.examples.TCaseStepExample;
import com.chancetop.qa.mappers.*;
import com.chancetop.qa.model.TBrowser;
import com.chancetop.qa.model.TCase;
import com.chancetop.qa.model.TCaseParam;
import com.chancetop.qa.model.TCaseStep;
import com.chancetop.qa.service.UiService;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

/**
 * @author: zw.wen
 */
@Service
public class UiServiceImpl implements UiService {
    Logger logger = LoggerFactory.getLogger(UiServiceImpl.class);

    @Autowired
    TBrowserMapper browserMapper;

    @Autowired
    TCaseStepMapper caseStepMapper;

    @Autowired
    TCaseParamMapper caseParamMapper;

    @Autowired
    TCaseBrowserMapper caseBrowserMapper;

    @Autowired
    TCaseBrowserMapper tCaseBrowserMapper;

    @Autowired
    TCaseMapper caseMapper;

    @Override
    public void execute(Long caseId) {
        TCase tCase = caseMapper.selectByPrimaryKey(caseId);
        Long browserId = tCase.getTBrowserId();
        TBrowser tBrowser = browserMapper.selectByPrimaryKey(browserId);
        Browser browser = new Browser(tBrowser);
        List<TCaseStep> tCaseSteps =caseStepMapper.selectByExample(TCaseStepExample.newAndCreateCriteria().andTCaseIdEqualTo(caseId).example());
        for (TCaseStep step : tCaseSteps) {
            try {
                this.run(browser, step);
            } catch (Exception e) {
                logger.error(e.getMessage());
            }finally {
                //browser.quit();
            }
        }
    }

    public void executeFlow(Browser browser, String caseName) {
        TCase tCase = caseMapper.selectByExample(TCaseExample.newAndCreateCriteria()
                                                                .andNameEqualTo(caseName)
                                                                .example())
                                                                .get(0);

        List<TCaseStep> tCaseSteps =caseStepMapper.selectByExample(TCaseStepExample
                                                    .newAndCreateCriteria()
                                                    .andTCaseIdEqualTo(tCase.getId())
                                                    .example());
        for (TCaseStep step : tCaseSteps) {
            try {
                this.run(browser, step);
            } catch (Exception e) {
                logger.error(e.getMessage());
            }finally {
                //browser.quit();
            }
        }
    }

    private void run(Browser browser, TCaseStep caseStep) throws Exception {
        String action = caseStep.getAction();
        String selector = caseStep.getSelector();
        String element = caseStep.getElement();
        String value = caseStep.getValue();
        String desc = caseStep.getDesc();
        logger.info(desc);
        switch (action) {
            case "open":
                open(value);
                break;
            case "click":
                browser.click(selector,element);
                break;
            case "selectByText":
                browser.selectByText(selector, element, value);
                break;
            case "input":
                browser.input(selector, element, value);
                break;
            case "moveToElement":
                browser.moveToElement(browser.findElement(selector, element));
                break;
            case "switchNextWindow":
                browser.switchNextWindow();
                break;
            case "switchPreWindow":
                browser.switchPreWindow();
                break;
            case "executeJavaScript":
                browser.executeJavascript(selector, element, value);
                break;
            case "close":
                browser.close();
                break;
            case "quit":
                browser.quit();
                break;
            case "runFlow":
                this.executeFlow(browser, value);
                break;
            case "sleep":
                browser.sleep(value);
            default:
                throw new Exception("No such method");
        }
    }
}
