package com.task.scheduler.demo.services;

import com.task.scheduler.demo.entity.TestEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface TaskSchedulerServices {
    @Autowired
    void inserttask(TestEvent testEvent);
    void updatetaskstatus(TestEvent testEvent);
}
