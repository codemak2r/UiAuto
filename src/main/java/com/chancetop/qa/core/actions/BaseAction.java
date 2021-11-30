package com.chancetop.qa.core.actions;

import com.chancetop.qa.core.Browser;
import com.chancetop.qa.model.TCaseStep;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zw.wen
 */
public abstract class BaseAction {
    private static Map<String, BaseAction> actions = new HashMap<>(16);

    static {
        actions.put("click", new ClickAction());
    }

    public WebElement findElement(String element){
        return null;
    }

    public static BaseAction getAction(String name) {
        return actions.get(name);
    }

    public abstract void execute(TCaseStep caseStep);

}
