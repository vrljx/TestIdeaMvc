package com.ljx.chapter02.test021;

import java.util.Scanner;

/**
 * 第二章，基本类型。byte，char，int，long，boolean，float，double，short
 * @Created by taylor on 2016/11/8.
 * @DESC 用偶判断，不用奇判断。
 */
public class Client021 {
    //模拟取余计算，dividend被除数，divisor除数 public static int remainder（int dividend, int divisor）{ return dividend-dividend/divisor*divisor； }
    // 模拟取余运算。
    public static int remainder(int a, int b){
        return a-a/b*b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()){
            int i = input.nextInt();
//            String str = i + (i%2==1?" 是 奇数": " 是 偶数");
//            String str = i + (i%2==0?" 是 奇数": " 是 偶数"); // 正确写法，判断偶数
            String str = i + (remainder(i,2)==1?" 奇数":" 偶数");
            System.out.println(str);
        }
    }
}
