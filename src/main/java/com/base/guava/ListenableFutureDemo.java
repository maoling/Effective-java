package com.base.guava;
import java.util.concurrent.Callable;

import java.util.concurrent.ExecutionException;

import java.util.concurrent.Executors;

import java.util.concurrent.TimeUnit;

 

import com.google.common.util.concurrent.FutureCallback;

import com.google.common.util.concurrent.Futures;

import com.google.common.util.concurrent.ListenableFuture;

import com.google.common.util.concurrent.ListeningExecutorService;

import com.google.common.util.concurrent.MoreExecutors;

import com.google.common.util.concurrent.RateLimiter;

/**
 * http://blog.csdn.net/jiesa/article/details/50412027
 * @author maoling
 *
 */

public class ListenableFutureDemo {

    public static void main(String[] args) {
        //testRateLimiter();
        testListenableFuture();
    }
    
    /**
     * RateLimiter类似于JDK的信号量Semphore，他用来限制对资源并发访问的线程数
     */
    public static void testRateLimiter() {

        ListeningExecutorService executorService = MoreExecutors
                .listeningDecorator(Executors.newCachedThreadPool()); 
        RateLimiter limiter = RateLimiter.create(5.0); // 每秒不超过4个任务被提交

        for (int i = 0; i < 10; i++) {
            limiter.acquire(); // 请求RateLimiter, 超过permits会被阻塞
            final ListenableFuture<Integer> listenableFuture = executorService

                    .submit(new Task("is "+ i));
        }
    }

    public static void testListenableFuture() {
    	
        ListeningExecutorService executorService = MoreExecutors

                .listeningDecorator(Executors.newCachedThreadPool());

        final ListenableFuture<Integer> listenableFuture = executorService
                .submit(new Task("testListenableFuture"));

        //同步获取调用结果
        try {
            System.out.println(listenableFuture.get());
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        } catch (ExecutionException e1) {
            e1.printStackTrace();
        }
        
        //第一种方式
        /**
         * 
        ListenableFuture顾名思义就是可以监听的Future，它是对Java原生Future的扩展增强。我们知道Future表示一个异步计算任务，当任务完成时可以得到计算结果。
                        如果我们希望一旦计算完成就拿到结果展示给用户或者做另外的计算，就必须使用另一个线程不断的查询计算状态。这样做，代码复杂，而且效率低下。使用ListenableFuture Guava帮我们检测Future是否完成了，
                        如果完成就自动调用回调函数，这样可以减少并发程序的复杂度。      
         */
        listenableFuture.addListener(new Runnable() {

            @Override

            public void run() {

                try {

                    System.out.println("get listenable future's result "

                            + listenableFuture.get());

                } catch (InterruptedException e) {

                    e.printStackTrace();

                } catch (ExecutionException e) {

                    e.printStackTrace();

                }

            }

        }, executorService);

 
        /*
        //第二种方式

        Futures.addCallback(listenableFuture, new FutureCallback<Integer>() {

            @Override

            public void onSuccess(Integer result) {

                System.out

                        .println("get listenable future's result with callback "

                                + result);

            }

 

            @Override

            public void onFailure(Throwable t) {

                t.printStackTrace();

            }

        });*/

        
    }

}

 

class Task implements Callable<Integer> {

    String str;

    public Task(String str){

        this.str = str;

    }

    @Override

    public Integer call() throws Exception {

        System.out.println("call execute.." + str);

        TimeUnit.SECONDS.sleep(1);

        return 7;

    }

}