package com.chancetop.qa.core.actions;

import cn.hutool.json.JSONUtil;
import com.chancetop.qa.core.Browser;
import com.chancetop.qa.model.TCaseStep;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: zw.wen
 */
public class ClickAction extends BaseAction {
    Logger logger = LoggerFactory.getLogger(ClickAction.class);
    @Override
    public void execute(TCaseStep caseStep){
//        String element = caseStep.getElement();
//        WebElement webElement = this.findElement(element);
//        webElement.click();
        logger.info(JSONUtil.toJsonPrettyStr(caseStep));
    }
}
