package com.ljx.chapter04.test054;

/**
 * @Created by taylor on 2016/11/15.
 * @DESC    正确使用string StringBuilder 和 StringBuffer
 * CharSequence 有3个实现类。
 * 总结：
 * 1、在String值变化不大的时候，少量运算，可用String
 * 2、频繁运算拼接，并且运行在多线程里的时候 用StringBuffer,方法里都有synchronize
 * 3、频繁运算拼接，单线程环境，非多线程，要求效率，用StringBuilder
 */
public class Client054 {
    // String 是不可变的量。一旦新建，则值永远不变，++等操作之后，其实是生成了一个新的对象，除非操作之后和原值一样。
    public void testString(){
        String str = "123";
        String str2 = str.substring(1);
        String str3 = str.substring(0);
        System.out.println(str == str2);
        System.out.println(str == str3);
    }
    
    // StringBuffer 是一个可变的字符串，保存起来是一个char 类型的数组，
    public void testStringBuffer(){
        StringBuffer sb = new StringBuffer("123");
        sb.append("456");
        System.out.println(sb);
        //  差异：上面sb是同一个引用，下面a的指向变成了123456，而原来的123 还在那里不变，只是没有被引用。
        String a = "123";
        a = a+"456";
        
    }
    
    // StringBuilder 和Stringbuffer一样，区别就是 StringBuilder是线程不安全的，效率远高于StringBuffer。
    // StringBuilder 和StringBuffer都是数组扩容操作，String是new对象操作，。所以String类的操作远慢于StringBuffer和builder。
    public void testStringBuilder(){
        
    }
    
}
