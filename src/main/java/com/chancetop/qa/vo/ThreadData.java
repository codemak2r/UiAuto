package com.chancetop.qa.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: zw.wen
 */
@Getter
@Setter
public class ThreadData {
    /**
     *    "当前排队线程数"
     */
    private int queueSize;
    /**
     *    "当前活动线程数"
     */
    private int activeCount;
    /**
     *    "执行完线程数"
     */
    private Long completedThreadCount;
    /**
     *    "总线程数"
     */
    private Long taskCount;
    /**
     *    "初始线程数"
     */
    private int poolSize;
    /**
     *    "核心线程数"
     */
    private int poolCoreSize;
    /**
     *    "线程池是否终止"
     */
    private Boolean isTerminate;
    /**
     *    "线城池是否关闭"
     */
    private Boolean isShutdown;
    /**
     *    "线程空闲时间"
     */
    private Long keepAliceTime;
    /**
     *    "最大允许线程数"
     */
    private Long maximumPoolSize;
    /**
     *     "线程池中存在的最大线程数"
     */
    private Long largePoolSize;
}
