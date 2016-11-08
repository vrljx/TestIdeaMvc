package com.ljx.test019;

import java.util.List;

/**
 * @Created by taylor on 2016/11/8.
 * @DESC    断言 的使用
 * 在防御式编程中经常会用断言，Assertion，对参数和环境做出判断，避免程序因为不当的输入或者错误的环境而产生逻辑异常，在Java中断言的关键字是Assert。

Asert<布尔表达式>，assert<布尔表达式>：<错误信息>

2个特性：
1、assert默认是不启用的，需要加上关键字。
2、当表达式为 false的时候，会抛出AssertionError的错误，是继承Error的，这是一个错误，不可修复。

assert不等价于if else，以下2种情况不可使用：
1、在对外公开的方法中不可使用。如下encode方法
2、在执行逻辑代码的情况下不可使用，如doSomething方法。

在何时使用？按照正常执行逻辑不可能到达的代码区域可以防止断言Assert，如下面3种情况：
1、在私有方法里放assert作为输入参数的校验。
因为私有方法使用者是自己，作者用来预防自己犯错
2、流程控制中，不可能达到的区域。
类似于junit的fail方法，其意义就是：程序到了这里就是错的。如下面doSomethingFail。
3、建立程序探针。
比如：程序中有2个参数有一个关系，a1 = a2*2。 则可以在程序中到处设置，断言这2者的关系是否依然保持，若没有，则说明程序出现了问题。
 */
public class Client019 {
    
    // 不可使用1，对外公开的方法不可用
    public static String encode(String var){
        assert var != null : "加密的字符串是null";
        System.out.println(var);
        return var;
    }
    
    // 不可使用2，逻辑代码下，因为开发时可以开启断言，但正式上是不开启的（提高性能）
    public  static  void doSomeThing(List list , Object object){
        assert list.remove(object) : "删除失败";
        System.out.println("asd");
    }
    
    // 可以使用2，放置到正常逻辑不可达到的地方。
    public static  void  doSomeThingFail(){
        int i = 8;
        while (i >= 8){
            System.out.println(i);
            i++;
        }
        assert false : "怎么可能呢";
    }
    public static void main(String[] args) {
        encode("asd");
        doSomeThingFail();
    }
}
