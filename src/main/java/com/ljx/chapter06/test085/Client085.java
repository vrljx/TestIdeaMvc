package com.ljx.chapter06.test085;

import com.ljx.chapter06.test084.*;

import javax.swing.*;

/**
 * @Created by taylor on 2016/11/24.
 * @DESC    Switch 与枚举配合，需要判断null
 * switch枚举类的时候，先执行了 enum.values 所以先空指针
 */
public class Client085 {
    
    public static String switchEnum(Season s){
        switch (s){
            case Spring:
                return s.getDesc();
            case Summer:
                return s.getDesc()+"2";
            default:
                return "0";
        }
    }

    public static void main(String[] args) {
        switchEnum(null);
    }
}
