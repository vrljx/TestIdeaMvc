package com.ljx.chapter03.test035;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC    避免在构造函数中初始化其他类
 */
public class Client035 {
    // 构造函数是一个类的初始化方法，必须执行的方法，如果关联了其他类，则会很复杂，有想不到的问题
    public Client035(){
        
    }
    /*
    1、先创建父类的变量，执行父类构造函数
    2、父类构造函数，又执行了Other的构造函数
    3、
     */
    public static void main(String[] args) {
        Son s = new Son();
        s.doSomeThing();
    }
}

class Father{
    public Father(){
        new Other();
    }
}

class Son extends Father{
    public static void doSomeThing(){
        System.out.println("aaaaaa");
    }
}
class Other{
    public Other(){
        new Son();
    }
}