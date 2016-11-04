package com.ljx.test003;

/**
 * @Created by taylor on 2016/11/1.
 * @DESC 三元操作符的类型必须一致，否则会出现默认转换
 * 若两个操作数中有一个是数字S，另外一个是表达式，且其类型标示为T，那么，若数字S在T的范围内，则转换为T类型；若S超出了T类型的范围，则T转换为S类型（可以参考“建议22”，会对该问题进行展开描述）。
 */
public class Client3 {
    public static void main(String[] args) {
        int i = 90;
        String s = String.valueOf((i < 100 ? 90:100));
        String s1 = String.valueOf(i < 100? 90:100.0);
        System.out.println((s == s1) +" || s = "+s +" | s1 = "+s1);
    }
}
