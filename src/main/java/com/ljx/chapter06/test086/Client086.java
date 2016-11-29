package com.ljx.chapter06.test086;

/**
 * @Created by taylor on 2016/11/25.
 * @DESC
 */
public class Client086 {
    
    public static void testSwitch(LogLevel ll){
        switch (ll){
            case DEBUG:
                System.out.println("debug的log");
                break;
            case WARN:
                break;
            case INFO:
                System.out.println("INFO 的log");
                break;
            case ERROR:
                break;
            default:
                System.out.println("抛出异常AssertionError");
        }
    }
    
    public static void main(String[] args) {
        LogLevel ll = LogLevel.DEBUG;
        testSwitch(ll);
    }
}
