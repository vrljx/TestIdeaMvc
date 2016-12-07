package com.ljx.chapter09.test120;

import java.util.concurrent.TimeUnit;

/**
 * @Created by taylor on 2016/12/7.
 * @DESC
 */
public class MultiThread implements Runnable{

    public void run() {
        int a = 0;
        // 同步代码块
        synchronized (""){
            a++;
            try {
//                System.out.println("线程休眠1s");
//                TimeUnit.MILLISECONDS.sleep(100);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 自减
            a--;
            String thName = Thread.currentThread().getName();
            System.out.println("当前线程name = "+thName + " | "+a);
        }
    }

    // 现在stop方法不会引起这个问题了。
    public static void main(String[] args) {
        MultiThread mt = new MultiThread();
        Thread t = new Thread(mt);
        t.start();
//        for (int i =0;i<5;i++){
//            new Thread(mt).start();
//        }
        t.stop();
    }
}
