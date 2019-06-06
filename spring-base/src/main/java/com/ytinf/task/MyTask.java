package com.ytinf.task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTask {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS") ;
    public void runJob() {
        System.out.println("【当前的日期时间】" + this.sdf.format(new Date()));
    }
}
