package com.ljx.chapter02.test027;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC    谨慎包装类型的比大小
 */
public class Client027 {
    public static void compareTwo(Integer a, Integer b){
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
    }

    /*
    在java中，== 是用来判断两个操作数 是否有相等的关系，如果是基本类型，则判断值是否相等，如果是对象则判断对象的引用是否相等，也就是地址，2个对象，当然引用 地址不一样。
     */
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 200;
        Integer c = 200;
        compareTwo(a,b);
        System.out.println("——————————");
        compareTwo(b,c);
        // 正确的
        System.out.println("——————————");
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println("——————————");
        System.out.println(compare(a,b));
        System.out.println(compare(b,c));
        System.out.println(compare(b,a));
    }
    /*
    模拟Integer里的比较大小
     */
    public static int compare(Integer a1,Integer b1){
        int a = a1.intValue();
        int b = b1.intValue();
        return (a < b )? -1 : (a == b ? 0 : 1);
    }
}
