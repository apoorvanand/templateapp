package com.task.scheduler.demo.entity;

import com.task.scheduler.demo.LoggingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public class TestEvent {


    String taskid;
    String projectid;
    String testid;
    String status;
    String start_time;
    String next_poll_time;
    String end_time;
    Logger logger = LoggerFactory.getLogger(LoggingController.class);
    public String getTaskid() {
        if(taskid==null){
            UUID uuid = UUID.randomUUID();
            taskid = uuid.toString();
        }
        logger.info(taskid);
        return taskid;
    }

    public String getProjectid() {
        return projectid;
    }

    public String getTestid() {
        return testid;
    }

    public String getStatus() {
        return status;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getNext_poll_time() {
        return next_poll_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setNext_poll_time(String next_poll_time) {
        this.next_poll_time = next_poll_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }


}
