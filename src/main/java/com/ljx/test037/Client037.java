package com.ljx.test037;

import javax.sound.midi.Soundbank;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC 构造代码块很聪明
 */
public class Client037 {
    public static void main(String[] args) {

    }
}

class Base {
    private static int num = 0;

    // 构造代码块
    {
        num++;
    }

    // 构造函数
    public Base() {
        System.out.println("无参数 构造");
    }

    public Base(String str) {
        System.out.println("String 构造");
    }

    public Base(Boolean b) {
        this();
    }

    public Base(Integer in) {
        System.out.println("Integer 构造");
    }

    public static void main(String[] args) {
        new Base("a");
        new Base();
        new Base(true);
        new Base(10);
        System.out.println(num);
    }
}
