package com.ljx.chapter09.test126;

/**
 * @Created by taylor on 2016/11/30.
 * @DESC    选择不同的线程池工作
 */
public class Client126 {
    /*
    ThreadPoolExecutor  最基本的构造函数分两步，
        1、检验输入条件
        2、检验运行条件
        
        参数解析：
        1、corePoolSize，最小线程数，线程池启动后，最少会保留这个数量的线程，不是一次性的，慢慢增加到
        2、maximumPoolSize，最大线程个数。如果超出，则RejectExecutionHandler拒绝策略处理。
        3、keepAliveTime。线程最大生命周期。超时时间。只对大于corePoolSize的线程，等待状态的有效。
        4、unit，时间单位，上面参数的单位。
        5、workQueue，任务队列，当线程已经都在使用了，又来了新的任务，则存入队列中等待。
        6、threadFactory， 线程工厂，定义如何启动一个线程，可以设置线程名称，并且可以确认是否是后台线程 FIXME
        7、handler，拒绝任务处理器。对于超出线程数量，队列个数的任务进行处理
     */
    /*
    线程池的管理方式：
        1、创建线程池
        2、任务进来，增加线程，任务增加，线程增加，直到增加corePoolSize(最小线程数)
        3、此时任务继续进来，则加入到workQueue中，此时线程池的大小为 corePoolSize，
        4、当workQueue满了，则增加线程个数，逐步增加到线程池的线程个数为 maximumPoolSize
        5、如果此时还有任务进来，（workQueue和线程池都已经满了），则交给Handler处理，是丢弃还是其他
        6、此时如果有线程等待时间超过了keepAliveTime，则该线程终止，线程个数降低，直到降低到corePoolSize个数。
     */
    
    /*
    
     */
}
