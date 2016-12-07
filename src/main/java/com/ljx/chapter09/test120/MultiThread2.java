package com.ljx.chapter09.test120;

/**
 * @Created by taylor on 2016/12/7.
 * @DESC
 */
public class MultiThread2 implements Runnable{

    public void run() {
        while (true){
            System.out.println("啊实打实大时代");
        }
    }

    /**
    因为interrupt方法不能终止一个线程状态，
     它只会改变中断标志位（如果在t1.interrupt（）前后输出t1.isInterrupted（）则会发现分别输出了false和true），
     如果需要终止该线程，还需要自行进行判断，例如我们可以使用interrupt编写出更加简洁、安全的终止线程代码
     看MultiThread3
     */
    public static void main(String[] args) {
        MultiThread2 mt = new MultiThread2();
        Thread t = new Thread(mt);
        t.start();
        t.interrupt();
    }
}

