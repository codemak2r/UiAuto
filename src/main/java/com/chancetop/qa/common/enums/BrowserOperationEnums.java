package com.chancetop.qa.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: zw.wen
 */
@Getter
public enum BrowserOperationEnums {
    OPEN(1, "open"),
    CLICK(2, "click"),
    SELECT_BY_TEXT(3, "selectByText"),
    SELECT_BY_INDEX(4, "selectByIndex"),
    MOVE_TO_ELEMENT(5, "move_to_element"),
    SWITCH_NEXT_WINDOW(6, "switchNextWindow"),
    SWITCH_PRE_WINDOW(7, "switchPreWindow"),
    EXECUTE_JAVASCRIPT(8, "executeJavaScript"),
    CLOSE(9, "close"),
    QUIT(10, "quit"),
    RUN_FLOW(11, "runFlow");

    private int code;
    private String operationName;

    BrowserOperationEnums(int code, String operationName) {
        this.code = code;
        this.operationName = operationName;
    }
}
