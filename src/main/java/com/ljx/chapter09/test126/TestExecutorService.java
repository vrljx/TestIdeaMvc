package com.ljx.chapter09.test126;

import java.util.concurrent.*;

/**
 * @Created by taylor on 2016/11/30.
 * @DESC    executors提供了几个创建线程池的方法。
 */
public class TestExecutorService {
    /*
    1、单线程池
    只存在一个线程，来的任务都会被存入到无界的阻塞队列里，逐个处理。

    public interface Future<V>Future 表示异步计算的结果。它提供了检查计算是否完成的方法，以等待计算的完成，并获取计算的结果。计算完成后只能使用 get 方法来获取结果，如有必要，计算完成前可以阻塞此方法。取消则由 cancel 方法来执行。还提供了其他方法，以确定任务是正常完成还是被取消了。一旦计算完成，就不能再取消计算。如果为了可取消性而使用 Future 但又不提供可用的结果，则可以声明 Future<?> 形式类型、并返回 null 作为底层任务的结果。 

public interface Callable<V>返回结果并且可能抛出异常的任务。实现者定义了一个不带任何参数的叫做 call 的方法。 
Callable 接口类似于 Runnable，两者都是为那些其实例可能被另一个线程执行的类设计的。但是 Runnable 不会返回结果，并且无法抛出经过检查的异常。 
     */
    public static void singlePool() throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String> future = es.submit(new Callable<String>() {
            public String call() throws Exception {
                return "name = "+Thread.currentThread().getName();
            }
        });
        System.out.println(future.get());
        es.shutdown();
    }
    /*
    2、newCachedThreadPool，缓冲功能的线程
    建立一个线程池，个数不超过int，
    有新增任务则：1、选择空闲线程，2、新建线程。 每当有线程1分钟处于等待状态，则终止。
     */
    
    /*
    3、newFixedThreadPool。固定线程数量的线程池
        在初始化时已经决定了线程的最大数量，corePoolSize和MaximumPoolSize是一样的，若任务添加的能力超出了线程处理能力，则建立阻塞队列容纳多余的任务，
     */
    
    /*
    以上3种是简化版的ThreadPoolExecutor
    ThreadPoolExecutor是旗舰版，功能全，适用面广
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        singlePool();
    }
}
