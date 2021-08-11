package com.example.Async;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CompletableFuture;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAsync        // without this annotation can't work as async
public class ApplicationTest {

    // @Autowired
    // private SyncTask syncTask;

    // @Autowired
    // private AsyncTask asyncTask;

    @Autowired
    private CompleteAsyncTask completeAsyncTask;

    @Test
    public void testCompletable() throws Exception {

        // 任務開始時間
        long start = System.currentTimeMillis();

        CompletableFuture<String> one = completeAsyncTask.doTaskOne();
        CompletableFuture<String> two = completeAsyncTask.doTaskTwo();
        CompletableFuture<String> three = completeAsyncTask.doTaskThree();

        // 等待直到所有任務完成
        CompletableFuture.allOf(one, two, three).join();

        // 以下會等到任務都完成後才執行
        System.out.println("總共耗時: " + (System.currentTimeMillis() - start));

        // 將各個任務的執行結果印出
        System.out.println(one.get());
        System.out.println(two.get());
        System.out.println(three.get());
    }

    /*
    @Test
    public void test() throws Exception {
        syncTask.doTaskOne();
        syncTask.doTaskTwo();
        syncTask.doTaskThree();
    }

    */

    /*
    @Test
    public void testAsync() throws Exception {
        asyncTask.doTaskOne();
        asyncTask.doTaskTwo();
        asyncTask.doTaskThree();
    }

    */

}
