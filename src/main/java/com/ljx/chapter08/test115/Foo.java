package com.ljx.chapter08.test115;

/**
 * @Created by taylor on 2016/11/29.
 * @DESC
 */
public class Foo {
    public static boolean m(){
        // 取得当前栈信息
        StackTraceElement[] stes = new Throwable().getStackTrace();
        // 检查是否有ml方法的调用
        for(StackTraceElement st: stes){
            if(st.getMethodName().equals("m1")){
                return true;
            }
        }
        return false;
        // 也可以抛出异常，禁止m2访问；throws new RuntimeException("m2不能访问");
    }
}

// 调用者
class Invoker{
    // 此方法应打印true
    public static void m1(){
        System.out.println(Foo.m());
    }
    // 此方法应打印false;
    public static void m2(){
        System.out.println(Foo.m());
    }

    public static void main(String[] args) {
        m1();
        m2();
    }
}
