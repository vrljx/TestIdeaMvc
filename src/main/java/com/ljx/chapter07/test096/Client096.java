package com.ljx.chapter07.test096;

import java.util.List;

/**
 * @Created by taylor on 2016/11/28.
 * @DESC    不同场景使用不同的泛型通配符。
 *  1、可以用？ 表示任意类
 *  2、可以extends 表示一个 类或接口的子类
 *  3、可以super 表示一个类或接口的父类。
 */
public class Client096 {
    // 1）泛型结构只参与 “读”操作，则限定上界，用extends 
    
    // 这个方法 用的是 ? super Student  传进来的可能是 student 也可能是student的父类，所以返回结果不对。
//    public static <Student> void read (List<? super Student> list){
//        for(Object obj : list){
//            
//        }
//    }
    // 这个方法用的 是  ? extends Student 传进来的是 Student 或者Student的子类，所以可以返回父类的集合。
    // ? extends Student 的意思是 上限是Student
    public static <Student> void read(List<? extends Student> list){
        
    }
    
    
    /*
    （2）泛型结构只参与“写”操作则限定下界（使用super关键字）先看如下代码是否可以编译
     
    public static <Student> void write(List<? extends Number> list){
        list.add(123);  // 不确定，Number下面有太多类型
        list.add(null); // 万用类型，可以表示所有类的实例对象。
        list.add(new Object()); // Object不是Number 的子类
    }
    */
    // 应该使用Super关键字。定义下界
    public static <Student> void write(List<? super Number> list){
        list.add(123L);
        list.add(123);
        list.add(123D);
        list.add(3.14);
    }
    
    
    /*
    对于是要限定上界还是限定下界，JDK的Collections.copy方法是一个非常好的例子，
    它实现了把源列表中的所有元素拷贝到目标列表中对应的索引位置上，代码如下：
     */
    public static <T> void copy(List<? super T> dest, List<? extends T> src){
            
    }
    /*
    源列表是用来提供数据的，所以src变量需要限定上界，带有extends关键字。
    目标列表是用来写入数据的，所以dest变量需要界定下界，带有super关键字。 
    如果一个泛型结构即用作“读”操作又用作“写”操作，那该如何进行限定呢？
    不限定，使用确定的泛型类型即可，如List＜E＞。
     */
}
