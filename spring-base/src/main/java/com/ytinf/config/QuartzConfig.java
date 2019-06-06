package com.ytinf.config;

import com.ytinf.task.MyTask;
import org.quartz.JobDataMap;
import org.quartz.SimpleTrigger;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.*;

//@Configuration  // 该类为一个程序配置的Bean
public class QuartzConfig {
    // 1、此时的定时任务没有特定的父类继承，所以需要进行配置处理
    //@Bean("factoryBean")
    public MethodInvokingJobDetailFactoryBean getMethodTaskFactory() {
        MethodInvokingJobDetailFactoryBean methodFactoryBean = new MethodInvokingJobDetailFactoryBean() ;
        methodFactoryBean.setTargetObject(new MyTask());
        methodFactoryBean.setTargetMethod("runJob"); // 设置定时任务执行的方法
        return methodFactoryBean ;
    }
    // 2、配置一个Cron定时调度Bean
    //@Bean
    public CronTriggerFactoryBean getCronTriggerFactoryBean(
            @Autowired
            MethodInvokingJobDetailFactoryBean factoryBean
    ) {
        CronTriggerFactoryBean triggerFactoryBean = new CronTriggerFactoryBean() ;
        triggerFactoryBean.setJobDetail(factoryBean.getObject());  // 任务的执行详情
        triggerFactoryBean.setCronExpression("* * * * * ?");    // 每秒触发一次
        return triggerFactoryBean ;
    }

    // 3、设置一个任务的调度器，所有的调度器依靠TriggerFactoryBean创建
    //@Bean
    public SchedulerFactoryBean getSchedulerFactoryBean(
            @Autowired
            CronTriggerFactoryBean triggerFactoryBean
    ) {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean() ;
        schedulerFactoryBean.setTriggers(triggerFactoryBean.getObject());   // 设置要执行的调度器
        return schedulerFactoryBean ;
    }
}
