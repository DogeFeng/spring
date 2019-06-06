package com.ytinf.config;

import com.ytinf.task.MyTask;
import org.quartz.JobDataMap;
import org.quartz.SimpleTrigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

@Configuration  // 该类为一个程序配置的Bean
public class QuartzConfig {
    // 1、配置任务的工厂类
    @Bean
    public JobDetailFactoryBean getJobDetailFactoryBean() { // 实现一个任务工厂类的创建
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean() ; // 创建了一个任务工厂类
        factoryBean.setJobClass(MyTask.class); // 设置本次要执行的任务
        JobDataMap jobDataMap = new JobDataMap() ;  // 进行任务的相关配置
        jobDataMap.put("timeout", 0);   // 不延迟操作，直接进行任务的启动
        factoryBean.setJobDataMap(jobDataMap);  // 设置任务的执行属性
        return factoryBean ;
    }
    // 2、配置一个Cron定时调度Bean
    @Bean
    public CronTriggerFactoryBean getCronTriggerFactoryBean(
            @Autowired
            JobDetailFactoryBean jobDetailFactoryBean
    ) {
        CronTriggerFactoryBean triggerFactoryBean = new CronTriggerFactoryBean() ;
        triggerFactoryBean.setJobDetail(jobDetailFactoryBean.getObject());  // 任务的执行详情
        triggerFactoryBean.setCronExpression("0 * * * * ?");    // 每分钟触发一次
        return triggerFactoryBean ;
    }

    // 3、设置一个任务的调度器，所有的调度器依靠TriggerFactoryBean创建
    @Bean
    public SchedulerFactoryBean getSchedulerFactoryBean(
            @Autowired
            CronTriggerFactoryBean triggerFactoryBean
    ) {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean() ;
        schedulerFactoryBean.setTriggers(triggerFactoryBean.getObject());   // 设置要执行的调度器
        return schedulerFactoryBean ;
    }
}
