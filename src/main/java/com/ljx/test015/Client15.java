package com.ljx.test015;

/**
 * @Created by taylor on 2016/11/4.
 * @DESC    Break不能忘记
 */
public class Client15 {
    public static String toChinese(int n){
        String chineseNumber = "";
        switch (n){
            case 1:chineseNumber = "一";
                break;
            case 2:chineseNumber = "二";
                break;
        }
        return chineseNumber;
    }

    public static void main(String[] args) {
        System.out.println(toChinese(2));
    }
}
