package com.chancetop.qa.vo;

import com.chancetop.qa.common.enums.TaskStatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author: zw.wen
 */
@Setter
@Getter
public class TaskInfo {
    private String taskId;
    private TaskStatusEnum status;
    private Date startTime;
    private Date endTime;
    private String totalTime;
}

