package com.task.scheduler.demo.dao;

import com.task.scheduler.demo.LoggingController;
import com.task.scheduler.demo.entity.TestEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TestScheduleImpl implements TestSchedulerDao {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @Autowired
    public TestScheduleImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public void insertest(TestEvent testEvent) {
        // added uuid generate function

        final String sql = "INSERT INTO public.tasks(taskid, projectid, testid, status, start_time, next_poll_time, end_time)VALUES(:taskid,:projectid ,:testid,:status,:start_time,:next_poll_time , :end_time)";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource().addValue("taskid", testEvent.getTaskid()).addValue("projectid",testEvent.getProjectid()).addValue("testid",testEvent.getTestid()).addValue("status",testEvent.getStatus()).addValue("start_time",testEvent.getStart_time()).addValue("end_time",testEvent.getEnd_time()).addValue("next_poll_time",testEvent.getNext_poll_time());

        template.update(sql,param, holder);

    }

    @Override
    public void updatetaskstatus(TestEvent testEvent) {
        final String sql="update public.tasks set next_poll_time =:next_poll_time ,status =:status where taskid=:taskid ";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param =new MapSqlParameterSource().addValue("status",testEvent.getStatus()).addValue("next_poll_time",testEvent.getNext_poll_time()).addValue("taskid",testEvent.getTaskid());
        template.update(sql,param,holder);


    }

    @Override
    public void stoptask(TestEvent testEvent) {
        final String sql="update public.tasks set next_poll_time =:next_poll_time ,end_time=:end_time,status =:status where taskid=:taskid ";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param =new MapSqlParameterSource().addValue("status","completed").addValue("next_poll_time",testEvent.getEnd_time()).addValue("taskid",testEvent.getTaskid()).addValue("end_time",testEvent.getEnd_time());
        template.update(sql,param,holder);

    }


}
