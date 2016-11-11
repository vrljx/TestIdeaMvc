package com.ljx.chapter03.test042;

/**
 * @Created by taylor on 2016/11/11.
 * @DESC    工具类不可实例化
 * 工具类的方法和属性都是静态的，不需要生成实例即可访问，而且JDK也做了很好的处理，由于不希望被初始化，于是就设置构造函数为private访问权限，表示除了类本身外，谁都不能产生一个实例
 */
public class Client042 {
    public static void main(String[] args) {
        System.out.println(Math.abs(1));
    }
}
