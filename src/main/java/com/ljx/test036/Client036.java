package com.ljx.test036;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC    使用构造代码块精炼程序
 * 1、普通代码块，方法。
 * 2、静态代码块，static{}
 * 3、同步代码块，synchronized
 * 4、构造代码块，直接{}
 */
public class Client036 {
    int a = 0;      //      3
    public static int b = 0;        // 1
    {
        a = 1;      //  4
    }
    static {
        b = 2;          // 2
    }
    public static void main(String[] args) {
        Client036 c = new Client036();
        System.out.println("a = "+ c.a);
        System.out.println("b = "+ b);
    }
}
