package com.ljx.chapter07.test093;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created by taylor on 2016/11/25.
 * @DESC    Java的泛型是类型擦除的。Generic
 *  加强了参数类型的安全性，减少了转换。
 *  java的泛型在编译期有效，编译后会删除。
 */
public class Client093 {
    /**
     * 2个方法内容 一个是编译前，一个是编译后
     * Java编译后的字节码中已经没有泛型的任何信息了，也就是说一个泛型类和一个普通类在经过编译后都指向了同一字节码
     * 
     */
    public static void beforeDo(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        Integer a = list.get(0);
    }
    public static void afterDo(){
        List list = new ArrayList();
        list.add(11);
        int a = (Integer) list.get(0);
    }
}
