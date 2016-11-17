package com.ljx.chapter05.test060;

import java.util.ArrayList;
import java.util.List;

/**
 * 第5章，数组和集合。
 *
 * @Created by taylor on 2016/11/15.
 * @DESC 数组性能最好
 * 基本类型是在栈内存中操作的，而对象则是在堆内存中操作的，
 * 栈内存的特点是速度快，容量小，
 * 堆内存的特点是速度慢，容量大（从性能上来讲，基本类型的处理占优势）。
 * 其次，在进行求和计算（或者其他遍历计算）时要做拆箱动作，因此无谓的性能消耗也就产生了。 
 * 在实际测试中发现：对基本类型进行求和计算时，数组的效率是集合的10倍。 
 * 注意　性能要求较高的场景中使用数组替代集合。
 */
public class Client060 {
    // 数组求和
    public static int getSumByIntArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count;
    }

    // list求和
    public static int getSumByIntList(List<Integer> list) {
        int count = 0;
        for(int a : list){
            count += a;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<Integer> list = new ArrayList<Integer>(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(getSumByIntArray(arr));
        System.out.println(getSumByIntList(list));
    }
}
