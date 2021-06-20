package com.task.scheduler.demo.services;

import com.task.scheduler.demo.dao.TestSchedulerDao;
import com.task.scheduler.demo.entity.TestEvent;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component

public class TaskSchedulerServicesImpl implements TaskSchedulerServices{

    @Resource
    TestSchedulerDao testschedular;
    @Override
    public void inserttask(TestEvent testEvent) {
testschedular.insertest(testEvent);
    }

    @Override
    public void updatetaskstatus(TestEvent testEvent) {
        testschedular.updatetaskstatus(testEvent);
    }
}
