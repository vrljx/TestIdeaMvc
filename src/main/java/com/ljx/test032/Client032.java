package com.ljx.test032;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC    静态变量一定要先声明，后赋值
 *  静态变量是类加载时被分配到数据区（Data Area）的，他在内存中，只有一个拷贝，不会被分配多次，其后所有赋值操作都是 值的改变，地址不变。先声明，后赋值。
静态变量是在类加载时，首先被加载的，JVM会去寻找所有的静态声明，然后分配空间，没有赋值此时，之后，会根据类中的静态赋值，静态代码块先后顺序来执行。
哪段静态代码在最后，则有值的决定权。
再次重申，变量要先声明后使用。 
 */
public class Client032 {
    public static int i = 1;
    static {
        i = 200;
    }
    // 如果static{}和定义反过来，则不行
    public static void main(String[] args) {
        System.out.println(i);
    }
}
