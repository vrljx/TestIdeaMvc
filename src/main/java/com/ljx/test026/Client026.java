package com.ljx.test026;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC   t堤防包装类型的NUll值 
 * 1、包装类型，wrapper Types。是为了解决基本类型的实例化问题，以便让一个基本类型也能参与到面向对象的编程中。例如泛型
 */
public class Client026 {
    public static int sum(List<Integer> list){
        int count = 0;
        for(Integer i : list){
//     错误：       count += i;
            count += (null == i? 0:i);
        }
        return count;        
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(null);
        System.out.println(sum(list));
    }

}
