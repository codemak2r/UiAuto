package com.chancetop.qa.common.enums;

import lombok.Getter;

/**
 * @author: zw.wen
 */
@Getter
public enum TaskStatusEnum {
    FAILED(-1, "任务执行失败"),
    STARTED(0, "任务已经启动"),
    RUNNING(1, "任务正在运行"),
    SUCCESS(2, "任务执行成功");

    private int state;
    private String stateInfo;

    TaskStatusEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

}
