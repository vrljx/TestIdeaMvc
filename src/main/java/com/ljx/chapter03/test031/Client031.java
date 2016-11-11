package com.ljx.chapter03.test031;

/**
 * 第三章：在面向对象编程里，OOP，类和对象是现实世界的描述工具，方法是行为和动作的展示，封装继承多态是多姿多彩的实现方式
 * @Created by taylor on 2016/11/9.
 * @DESC    接口中不要存在实现方法
 */
public class Client031 {
    public static void main(String[] args) {
        B.s.doSomeThing();
    }
    interface B{
        S s = new S() {
            public void doSomeThing() {
                System.out.println("asdasd");
            }
        };
    }
    interface S{
        public void doSomeThing();
    }
}
