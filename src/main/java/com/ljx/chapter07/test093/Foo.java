package com.ljx.chapter07.test093;

import java.util.List;

/**
 * @Created by taylor on 2016/11/25.
 * @DESC
 */
public class Foo {
    public void arrayMethod(Integer[] arr){
        
    }
    // 重载
    public void arrayMethod(String[] arr){
        
    }
    
    // 报错原因，编译后会擦除泛型，也就是变成了 List<E> list    ，俩方法重复了
    /*
    List<String> 编译后变成了 LIst
    List<String>[] 变成了List[]
    List<? Extends E> 变成了 List<E>
    List<? extends Serializable> 变成了 List<Serializable>
     */
//    public void listMethod(List<Integer> list){
//        
//    }
    public void listMethod(List<String> list){
        
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
