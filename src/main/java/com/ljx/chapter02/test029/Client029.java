package com.ljx.chapter02.test029;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC    优先选择基本类型
 */
public class Client029 {
    public static void main(String[] args) {
        int i = 140;
        f(i);
        f(Integer.valueOf(i));
        /*
        这是因为自动装箱有一个重要的原则：基本类型可以先加宽，再转变成宽类型的包装类型，但不能直接转变成宽类型的包装类型。这句话比较拗口，简单地说就是，int可以加宽转变成long，然后再转变成Long对象，但不能直接转变成包装类型，注意这里指的都是自动转换，不是通过构造函数生成。为了解释这个原则，我们再来看一个例子：
         */
        long la = (long) i;
        fa(la);
        // 先转成integer ，再执行。
        Integer ii = Integer.valueOf(i);
        // f(ii) 依然会执行 第一个方法。因为，没有找到Integer参数的方法，自动转存int，int又变成long。
        f(ii);
    }
    // int 会自动转存long
    public static void f(long a) {
        System.out.println("1 = " + a);
    }
    // int不能直接转为包装类型
    public static void f(Long a) {
        System.out.println("2 = " + a);
    }
    // int必须先加长为long类型，才能转成Long
    public static void fa(Long b){
        System.out.println("3 = "+ b);
    }
    // 
//    public static void fi(Integer c){
//        System.out.println("4 = "+c);
//    }
}
