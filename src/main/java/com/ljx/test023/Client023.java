package com.ljx.test023;

/**
 * @Created by taylor on 2016/11/8.
 * @DESC 不要让类型随意转换。
 */
public class Client023 {
    // 光速是 30w公里每秒；
    public static final int LIGHT_SPEED = 30*10000*1000;
    /*
    太阳和地球的距离竟然是负的，诡异。dis2不是已经考虑到int类型可能越界的问题，并使用了long型吗，为什么还会出现负值呢？ 那是因为Java是先运算然后再进行类型转换的，具体地说就是因为disc2的三个运算参数都是int类型，三者相乘的结果虽然也是int类型，但是已经超过了int的最大值，所以其值就是负值了（为什么是负值？因为过界了就会从头开始），再转换成long型，结果还是负值。
     */
    public static void main(String[] args) {
        System.out.println("题目1：月亮光照射到地球需要1秒，计算月亮和地球的距离。"); 
        long dis1=LIGHT_SPEED*1; 
        System.out.println("月亮与地球的距离是："+dis1+"米"); 
        System.out.println("--------------------------------------------"); 
        System.out.println("题目2：太阳光照射到地球上需要8分钟，计算太阳到地球的距离。"); 
        //可能要超出整数范围，使用long型 
        long dis2=LIGHT_SPEED*60L*8; 
        // 最好这样：long dis2 = 1L*LIGHT_SPEED*60L*8l
        System.out.println("太阳与地球的距离是："+dis2+"米");
    }
}
