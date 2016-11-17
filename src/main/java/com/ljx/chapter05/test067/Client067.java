package com.ljx.chapter05.test067;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Created by taylor on 2016/11/15.
 * @DESC    不同列表选择不同的遍历方法。
 * 对于ArrayList，下标方式更快。
 * 对于LinkedList，foreach更快。
 */
public class Client067 {
    // ArrayList
    public static void averageForeachArrayList(List<Integer> list){
        long time1 = System.currentTimeMillis();
        int sum = 0;
        for(Integer i : list){
            sum += i;
        }
        System.out.println(sum/list.size());
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
    // ArrayList
    public static void averageIndexArrayList(List<Integer> list){
        long time1 = System.currentTimeMillis();
        int sum = 0;
        for(int k=0, size=list.size(); k< size; k++){
            sum += list.get(k);
        }
        System.out.println(sum/list.size());
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
    // LinkedList
    public static void averageIndexLinkedList(List<Integer> list){
        long time1 = System.currentTimeMillis();
        int sum = 0;
        for(int k=0, size=list.size(); k< size; k++){
            sum += list.get(k);
        }
        System.out.println(sum/list.size());
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
    
    public static void main(String[] args) {
        int totalNum = 80*10000;
        List<Integer> list1 = new ArrayList<Integer>(totalNum);
        int k = 1;
        for(;k<=totalNum;k++){
            list1.add(new Random().nextInt());
        }
        averageForeachArrayList(list1);
        averageIndexArrayList(list1);
    }
   
}
