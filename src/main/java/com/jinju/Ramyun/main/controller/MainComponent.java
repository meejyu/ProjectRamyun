package com.jinju.Ramyun.main.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Component
public class MainComponent {

    //크론식 1초당 1번 실행
    @Scheduled(cron = "0/1 * * * * *")
    public void crawling() throws Exception {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("스케줄러 작동");
    }

}
