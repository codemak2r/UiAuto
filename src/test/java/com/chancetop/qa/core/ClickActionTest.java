package com.chancetop.qa.core;

import com.chancetop.qa.core.actions.ClickAction;
import com.chancetop.qa.model.TCaseStep;
import org.junit.jupiter.api.Test;

/**
 * @author: zw.wen
 */
public class ClickActionTest {
    @Test
    public void testClick(){
        Browser b = new Browser();
        TCaseStep caseStep = new TCaseStep();
        caseStep.setAction("click");
        caseStep.setElement("xpath=xxxx");
        caseStep.setSelector("xpath");
        b.execute(caseStep);
    }
}
