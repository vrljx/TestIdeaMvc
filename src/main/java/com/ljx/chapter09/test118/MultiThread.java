package com.ljx.chapter09.test118;

/**
 * @Created by taylor on 2016/11/30.
 * @DESC    不推荐重写start方法
 */
public class MultiThread extends Thread{
//    @Override
//    public synchronized void start(){
//        // 调用线程体
//        run();
//    }
    @Override
    public synchronized void run(){
        System.out.println("multiThread 的 run");
    }
    /*
    相信读者都能看出这是一个错误的多线程应用，
    main方法根本就没有启动一个子线程，整个应用程序中只有一个主线程在运行，并不会创建任何其他的线程。
    对此，有很简单的解决办法，只要删除MultiThread类中的start方法即可。
     */
    public static void main(String[] args) {
        MultiThread mt = new MultiThread();
        mt.start();
        /*
        这里的关键是本地方法start0，它实现了启动线程、申请栈内存、运行run方法、修改线程状态等职责，
        线程管理和栈内存管理都是由JVM负责的，
        如果覆盖了start方法，也就是撤消了线程管理和栈内存管理的能力，这样如何启动一个线程呢？
        事实上，不需要关注线程和栈内存的管理，只需要编码者实现多线程的逻辑即可（即run方法体），
        这也是JVM比较聪明的地方，简化多线程应用。
         */
    }
    
}
