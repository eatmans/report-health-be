package com.eatmans.report.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ExecuteJob {
    private static final Logger logger = LoggerFactory.getLogger(ExecuteJob.class);

    /**
     * 方法名在quartz定义
     */
    public void execute() {
        System.out.println("定时任务执行了。。。。。");

    }
}