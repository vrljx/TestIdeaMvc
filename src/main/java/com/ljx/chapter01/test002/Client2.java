package com.ljx.chapter01.test002;

import java.util.Random;

/**
 * @Created by taylor on 2016/10/31.
 * @DESC 
 */
public class Client2 {
    public static void main(String[] args)
    {
        System.out.println("常量会变哦：" + Const.RAND_CONST);
    }
} /*接口常量*/

interface Const { //这还是常量吗？
    public static final int RAND_CONST=new Random().nextInt();
}
