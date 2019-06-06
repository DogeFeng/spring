package com.ytinf.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class MyTaskSecond {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS") ;
    @Scheduled(cron = "* * * * * ?")
    public void runJob() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.err.println("【｛Second｝当前的日期时间】" + this.sdf.format(new Date()));
    }
}
