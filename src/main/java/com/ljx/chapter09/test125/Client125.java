package com.ljx.chapter09.test125;

import com.mysql.jdbc.TimeUtil;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @Created by taylor on 2016/11/30.
 * @DESC    优先选择线程池
 *  线程的5种状态，Thread.state.状态
 *      1、新建状态，new
 *      2、可运行庄坦，runnable
 *      3、阻塞状态，blocked
 *      4、等待状态，timed_waiting
 *      5、结束状态Terminated
 *      五种状态的顺序不可逆。
 */
public class Client125 {
    
    // 把一个接
    public static void convertTerminalToNew() throws Exception{
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("线程运行");
            }
        });
        // 运行线程
        t.start();
        // 查看线程状态。
        if(t.getState().equals(Thread.State.TERMINATED)){
            // 睡眠
            TimeUnit.MILLISECONDS.sleep(5000);
        }
        // 重新开启
        t.start();
    }
    public static void main(String[] args) throws Exception{
        // 方法会抛出，IllegalThreadStateException，不合法的状态，不能从结束状态转变成开始状态。
        convertTerminalToNew();

        
    }
}
