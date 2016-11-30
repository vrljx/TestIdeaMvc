package com.ljx.chapter09.test121;

import java.awt.*;

/**
 * @Created by taylor on 2016/11/30.
 * @DESC    线程的优先级（Priority）决定了线程获得CPU运行的机会，优先级越高获得的运行机会越大，优先级越低获得的机会越小。
 * Java的线程有10个级别
 * （准确地说是11个级别，级别为0的线程是JVM的，应用程序不能设置该级别），
 * 那是不是说级别是10的线程肯定比级别为9的线程先运行呢？我们来看如下一个多线程类：
 */
public class TestThread implements Runnable{
    public void start(int _priority){
        Thread tt = new Thread(this);
        if (_priority >0 && _priority <= 3){
            _priority = Thread.MIN_PRIORITY;
        }else if (_priority >3 && _priority <= 6){
            _priority = Thread.NORM_PRIORITY;
        }else{
            _priority = Thread.MAX_PRIORITY;
        }
        tt.setPriority(_priority);
        tt.start();
    }
    
    public void run(){
        for(int i=0;i<100000;i++){
            Math.hypot(Math.pow(394859604,i), Math.cos(i));
        }
        System.out.println("priority = "+ " : " + Thread.currentThread().getPriority());
    }
    /*
    注意　线程优先级推荐使用MIN_PRIORITY、NORM_PRIORITY、MAX_PRIORITY三个级别，不建议使用其他7个数字。
    于是在Thread类中设置了三个优先级，此意就是告诉开发者，建议使用优先级常量，而不是1到10随机的数字。常量代码如下： public class Thread implements Runnable{ //最低优先级 public final static int MIN_PRIORITY=1； //普通优先级，默认值 public final static int NORM_PRIORITY=5； //最高优先级 public final static int MAX_PRIORITY=10； }
     */
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            new TestThread().start(i%10+1);
        }
    }
}
