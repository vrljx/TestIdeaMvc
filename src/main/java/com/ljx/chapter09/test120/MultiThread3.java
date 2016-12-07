package com.ljx.chapter09.test120;

/**
 * @Created by taylor on 2016/12/7.
 * @DESC    SafeStopThread
 */
public class MultiThread3 extends Thread{
/*    总之，如果期望终止一个正在运行的线程，则不能使用已经过时的stop方法，需要自行编码实现，如此即可保证原子逻辑不被破坏，代码逻辑不会出现异常。当然，如果我们使用的是线程池（比如ThreadPoolExecutor类），那么可以通过shutdown方法逐步关闭池中的线程，它采用的是比较温和、安全的关闭线程方法，完全不会产生类似stop方法的弊端。*/
    public void run(){
        while (! isInterrupted()){
            // DO
        }
    }
}
