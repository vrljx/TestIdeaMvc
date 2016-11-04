package com.ljx.test008;

/**
 * @Created by taylor on 2016/11/4.
 * @DESC 不要让旧语法困扰你
 */
public class Client8 {

    public static void main(String[] args) {
        int n = 200;
        saveDefault:save(n);
    }
    
    public static void saveDefault(){
        System.out.println("aaa"); 
    }
    public  static void save(int n){
        System.out.println(n);
    }
}
