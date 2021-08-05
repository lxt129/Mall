package com.atguigu.gulimall.search.feign;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("start.........");
            Test();
            System.out.println("end.........");
        }
    }

    public static void Test(){


        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("任务1启动....");
            System.out.println("当前线程：" + Thread.currentThread().getId());
            return 10;
        }, executor);

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("任务2启动....");
            System.out.println("当前线程：" + Thread.currentThread().getId());
            return 10;
        }, executor);
    }
}
