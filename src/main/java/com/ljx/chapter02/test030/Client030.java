package com.ljx.chapter02.test030;

import java.util.Random;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC    不要随便设置随机种子
 */
public class Client030 {
    public static void main(String[] args) {
        Random rm = new Random();
        System.out.println(rm.nextInt());
        // 种子不同，产生不同的随机数， 默认 无参数的 方法，用的是 System.nanoTime当种子，每个机器，不同硬件其，纳秒值是不一样的。
        // 种子相同，即使不同实例也会相同，在一台机器里。
        Random rm1 = new Random(1000);
        System.out.println(rm1.nextInt());
        /*
        顺便提一下，在Java中有两种方法可以获得不同的随机数：通过java.util.Random类获得随机数的原理和Math.random方法相同，Math.random（）方法也是通过生成一个Random类的实例，然后委托nextDouble（）方法的，两者是殊途同归，没有差别。
         */
    }
}
