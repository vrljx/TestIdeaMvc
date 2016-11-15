package com.ljx.chapter04.test055;

/**
 * @Created by taylor on 2016/11/15.
 * @DESC    注意字符串的位置
 * Java 对加号的处理，只要遇到String 就变成字符串加，如果是对象，则先toString再加。
 * 注意　在“+”表达式中，String字符串具有最高优先级。
 */
public class Client055 {
    public static void main(String[] args) {
        String a = 1+2+"asd";
        String b = "asd"+1+2;
        String c = "asd" + (1+2);
        String d = "asd" + new Client055();
        System.out.println(a + "||"+ b+"||"+c + "||" + d);
    }
    
    @Override
    public String toString(){
        return "ert";
    }
}
