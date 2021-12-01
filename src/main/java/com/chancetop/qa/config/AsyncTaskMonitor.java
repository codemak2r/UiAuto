package com.chancetop.qa.config;

import com.chancetop.qa.common.enums.TaskStatusEnum;
import com.chancetop.qa.vo.TaskInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author: zw.wen
 */
@Component
@Aspect
public class AsyncTaskMonitor {
    @Autowired
    AsyncTaskManager manager;
    private static Logger LOG = LoggerFactory.getLogger(AsyncTaskMonitor.class);

    @Around("execution(* com.chancetop.qa.config.AsyncTaskExecutor.*(..))")
    public void taskHandle(ProceedingJoinPoint pjp) {
        //获取taskId
        String taskId = pjp.getArgs()[1].toString();
        //获取任务信息
        TaskInfo taskInfo = manager.getTaskInfo(taskId);
        LOG.info("AsyncTaskMonitor is monitoring async task:{}", taskId);
        taskInfo.setStatus(TaskStatusEnum.RUNNING);
        manager.setTaskInfo(taskInfo);
        TaskStatusEnum status = null;
        try {
            pjp.proceed();
            status = TaskStatusEnum.SUCCESS;
        } catch (Throwable throwable) {
            status = TaskStatusEnum.FAILED;
            LOG.error("AsyncTaskMonitor:async task {} is failed.Error info:{}", taskId, throwable.getMessage());
        }
        taskInfo.setEndTime(new Date());
        taskInfo.setStatus(status);
        LocalDateTime start = taskInfo.getStartTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime end = taskInfo.getEndTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        taskInfo.setTotalTime(String.valueOf(Duration.between(start, end).toMillis()/1000) + " seconds");
        manager.setTaskInfo(taskInfo);
    }

}
