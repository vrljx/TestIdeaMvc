package com.ljx.chapter09.test125;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Created by taylor on 2016/11/30.
 * @DESC
 */
public class TestThreadPool {
    // 一个线程的运行时间分为3个部分，t1,为运行启动时间，t2,为运行时间，t3为销毁时间。
    // 如果一个线程不能被重复利用，则每次都需要经历上面3个时间，从而浪费时间，增大响应时间。
    // 这时，用ThreadPool 就可以省去 t1和t3的时间，从而减小相应时间
    // ExecutorService 就是实现了线程池的执行器。 如下
    public static void TestThreadPool() {
        ExecutorService es = Executors.newFixedThreadPool(2);
        for (int i =0;i<5;i++){
            es.submit(new Runnable() {
                public void run() {
                    System.out.println("asdasd");
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        es.shutdown();
    }

    public static void main(String[] args) {
        TestThreadPool();
    }
    /**
     * 本次代码执行了4遍线程体，按照我们之前阐述的“一个线程不可能从结束状态转变为可运行状态”，那为什么此处的2个线程可以反复使用呢？
     * 这就是我们要搞清楚的重点。
     * 线程池的实现涉及了以下3个名次。
     *      1、工作线程Workers   只有2个状态，可运行状态，和 等待状态。workers实现了runnable
     *      2、任务接口Task：这是每个任务必须实现的接口，以供工作线程调度器调度，它主要规定了任务的入口、任务执行完的场景处理、任务的执行状态等。这里有两种类型的任务：具有返回值（或异常）的Callable接口任务和无返回值并兼容旧版本的Runnable接口任务
     *      3、任务队列Work queue：也叫做工作队列，用于存放等待处理的任务，一般是BlockingQueue的实现类，用来实现任务的排队处理。
     *      
     */
}
