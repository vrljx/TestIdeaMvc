package com.ljx.chapter09.test120;

import java.util.concurrent.TimeUnit;

/**
 * @Created by taylor on 2016/11/30.
 * @DESC    不使用Stop方法停止线程
 */
public class Client120 {
    
    /**
     * 在线程运行期间，想要停止的话，java提供了stop方法，但是不建议
     *      1、stop方法是过时的，deprecated
     *      2、stop方法会导致逻辑不完整。
     *          stop是一种恶意的中断线程，不管逻辑是否完成。
     */

    /**
     *          这是极度危险的，因为我们不知道子线程会在什么时候被终止，stop连基本的逻辑完整性都无法保证。而且此种操作也是非常隐蔽的，子线程执行到何处会被关闭很难定位，这为以后的维护带来了很多麻烦。
     * @throws InterruptedException
     */
    public static void testStop1() throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run(){
                try {
                    System.out.println("第一段逻辑");
                    TimeUnit.MICROSECONDS.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 由于stop的存在，这段逻辑可能执行不到
                System.out.println("第二段逻辑");
            }
        };
        t.start();
        TimeUnit.MICROSECONDS.sleep(100);
        t.stop();
    }

    /**
     * 为了避免共享资源抢占的问题，有锁的概念，而stop会带出更大的麻烦，
     * 他会丢弃所有所有的锁，使原子逻辑受损
     * @throws InterruptedException
     */
    public static void testStop2(){
        
    }
    public static void main(String[] args) throws InterruptedException {
        // stop方法导致逻辑不完整
        testStop1();
        
        // stop方法破坏了原子逻辑, 详见MultiThread类
        
    }
}
