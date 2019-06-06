package com.ytinf.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask { // 实现定时任务处理
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS") ;
    @Override
    public void run() { // 任务线程
        System.out.println("【当前的日期时间】" + this.sdf.format(new Date()));
    }
}

public class JDKTimerTask {
    public static void main(String[] args) {
        Timer timer = new Timer() ;
        timer.schedule(new MyTask(), 0, 1000);
    }
}
