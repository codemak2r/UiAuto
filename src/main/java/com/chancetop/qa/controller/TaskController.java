package com.chancetop.qa.controller;

import com.chancetop.qa.config.AsyncTaskManager;
import com.chancetop.qa.service.UiService;
import com.chancetop.qa.vo.TaskInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zw.wen
 */
@RestController
@RequestMapping("/api/v1")
public class TaskController {
    @Autowired
    AsyncTaskManager asyncTaskManager;

    @Autowired
    UiService uiService;

    @PostMapping("/startTask")
    public Map startAsyncTask(){
        Map<String, TaskInfo> result = new HashMap<>(16);

        TaskInfo taskInfo = asyncTaskManager.submit(() -> {
            uiService.execute(1L);
        });

        result.put("data", taskInfo);
        return result;
    }

    @GetMapping("/task/status")
    public Map getTaksStatus(String taskId) {
        Map<String, TaskInfo> result = new HashMap<>(16);
        TaskInfo taskInfo = asyncTaskManager.getTaskInfo(taskId);
        result.put("data", taskInfo);
        return result;
    }

}
