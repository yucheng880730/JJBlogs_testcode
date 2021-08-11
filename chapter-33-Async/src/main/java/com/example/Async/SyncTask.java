package com.example.Async;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SyncTask {

    public static Random random = new Random();

    public void doTaskOne() throws Exception {
        System.out.println("開始做同步任務一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = System.currentTimeMillis();
        System.out.println("完成同步任務一，耗時:" + (end - start) + "毫秒");
    }

    public void doTaskTwo() throws Exception {
        System.out.println("開始做同步任務一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = System.currentTimeMillis();
        System.out.println("完成同步任務一，耗時:" + (end - start) + "毫秒");
    }

    public void doTaskThree() throws Exception {
        System.out.println("開始做同步任務一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = System.currentTimeMillis();
        System.out.println("完成同步任務一，耗時:" + (end - start) + "毫秒");
    }
}
