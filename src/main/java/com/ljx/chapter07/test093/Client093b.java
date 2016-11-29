package com.ljx.chapter07.test093;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Created by taylor on 2016/11/25.
 * @DESC 明白了Java的泛型是类型擦除的，我们就可以解释类似如下的问题了：
 * （1）泛型的class对象是相同的
 * （2）泛型数组初始化时不能声明泛型类型
 * （3）instanceof不允许存在泛型参数
 */
public class Client093b {
    public static void main(String[] args) {
        compareToList();
    }
    // 1泛型的class对象是相同的 
    public static void compareToList(){
        List<Integer> list  = new ArrayList<Integer>();
        List<String> list2 = new ArrayList<String>();
        List<Boolean> list3 = new LinkedList<Boolean>();
        System.out.println(list.getClass() == list2.getClass());    // 因为擦除了泛型，所以都是Arraylist类型，一样
        System.out.println(list.getClass() == list3.getClass());
        System.out.println(list3.getClass());
    }
    // 2）泛型数组初始化时不能声明泛型类型 
    public static void testInit(){
//        List<String>[] arr = new List<String>[];
    }
    
    // （3）instanceof不允许存在泛型参数
    public static void noInstanceOf(){
        List<String> list  = new ArrayList<String>();
//        System.out.println(list instanceof List<String>);     // 出错
    }
}
