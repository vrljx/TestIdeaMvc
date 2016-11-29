package com.ljx.chapter07.test104;
class Utils {
    static {
        System.out.println("初始化静态代码块");
    }
}
/**
 * @Created by taylor on 2016/11/29.
 * @DESC    使用forName动态加载类文件。
 * Dynamic loading
 * 动态加载类文件的意义：
 *      初始化类的static变量和代码块，可以注册，初始化环境等。如Utils.class
 */
public class Client104 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Utils");
    }
}

/*
需要说明的是，forName只是把一个类加载到内存中，
并不保证由此产生一个实例对象，
也不会执行任何方法，
之所以会初始化static代码，那是由类加载机制所决定的，而不是forName方法决定的。
也就是说，如果没有static属性或static代码块，forName就只是加载类，没有任何的执行行为。 

注意　forName只是加载类，并不执行任何代码。
 */
