package com.task.scheduler.demo;

import com.task.scheduler.demo.entity.TestEvent;
import com.task.scheduler.demo.services.TaskSchedulerServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

@RestController

public class ApiController {

    @Resource
    TaskSchedulerServices taskSchedulerServices;

    @RequestMapping(value = "/start" ,method = RequestMethod.POST, consumes = "application/json")
public TestEvent intiatetest(@RequestBody  TestEvent testEvent){

       taskSchedulerServices.inserttask(testEvent);
        return testEvent ;
        }

    @RequestMapping(value = "/poll" ,method = RequestMethod.PUT, consumes = "application/json")
    public String updateteststatus(@RequestBody  TestEvent testEvent){

        taskSchedulerServices.updatetaskstatus(testEvent);

        return "updated" ;
    }
    @RequestMapping(value = "/stopcapture" ,method = RequestMethod.PUT, consumes = "application/json")
    public String Stoptask(@RequestBody  TestEvent testEvent){

        taskSchedulerServices.stoptask(testEvent);

        return "." +
                "" ;
    }



}
