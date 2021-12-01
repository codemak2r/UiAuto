package com.chancetop.qa.config;

import com.chancetop.qa.common.annotation.AsyncTaskConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: zw.wen
 */
@Component
public class AsyncTaskExecutor {
    private static Logger LOG = LoggerFactory.getLogger(AsyncTaskExecutor.class);

    @Async
    public void executor(AsyncTaskConstructor asyncTaskGenerator, String taskInfo) {
        LOG.info("AsyncTaskExecutor is executing async task:{}", taskInfo);
        asyncTaskGenerator.async();
    }}
