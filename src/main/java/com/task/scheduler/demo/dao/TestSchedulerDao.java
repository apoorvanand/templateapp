package com.task.scheduler.demo.dao;

import com.task.scheduler.demo.entity.TestEvent;


public interface TestSchedulerDao {



    void insertest(TestEvent testEvent);
    void updatetaskstatus(TestEvent testEvent);


}
