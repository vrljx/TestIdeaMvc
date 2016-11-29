package com.ljx.chapter07.test095;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Created by taylor on 2016/11/28.
 * @DESC    强制声明泛型的实际类型
 */
public class ArrayUtils {
    /*
    Arrays工具类有一个方法asList可以把一个变长参数或数组转变为列表，但是它有一个缺点：它所生成的List长度是不可改变的，而这在我们的项目开发中有时会很不方便。如果你期望生成的列表长度是可变，那就需要自己来写一个数组的工具类了
     */
    public static <T>List<T> asList(T...t){
        List<T> list = new ArrayList<T>();
        Collections.addAll(list,t);
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"a","b"};
        List<String> strList = asList(arr);
        System.out.println(strList.size());
        System.out.println(strList.get(0));
        System.out.println("————————");
        List list1 = asList();
        System.out.println(list1.size());
        System.out.println("————————");
        List list2 = asList(1,2,3,"aa");
        System.out.println(list2.size()+"|| "+ list2.get(0)+" || "+list2.get(3));
        System.out.println("————————");
        
        List<Integer> list3 = ArrayUtils.<Integer>asList();
    }
}
