package com.ljx.chapter08.test113;

import java.io.FileNotFoundException;

/**
 * @Created by taylor on 2016/11/29.
 * @DESC    不要在finally块中处理返回值
 *  finally中的return 会覆盖try里的return
 */
public class Client113 {
    public static int do1(){
        try {
            return 0;
        }catch (Exception e){
            return -1;
        }finally {
            return 1;
        }
    }
    /*
    该方法的返回值永远是1，而不会是-1或0
    （为什么不会执行到“return 0”呢？原因是finally执行完毕后该方法已经有返回值了，后续代码就不会再执行了），
    这都是源于异常代码块的处理方式，在代码中加上try代码块就标志着运行时会有一个Throwable线程监视着该方法的运行，若出现异常，则交由异常逻辑处理。 我们知道方法是在栈内存中运行的，并且会按照“先进后出”的原则执行，main方法调用了doStuff方法，则main方法在下层，doStuff在上层，当doStuff方法执行完“return a”时，此方法的返回值已经确定是in类型1（a变量的值，注意基本类型都是值拷贝，而不是引用），此后finally代码块再修改a的值已经与doStuff返回者没有任何关系了，因此该方法永远都会返回1。
     */
    public static int do2(){
        int a = 0;
        try {
            return a;
        }catch (Exception e){
            return -1;
        }finally {
            a = 1;
        }
    }
    /*
    测试屏蔽异常：
    在抛出异常的finally里 return 则异常就捕捉不到了。
     */
    public static void doSomeThing(){
        try {
            throw new FileNotFoundException();
        }finally {
            return;
        }
    }
    /*
    finally 里不要加返回，是对异常进行异常处理的
     */
    public static void main(String[] args) {
        System.out.println(do1());
        System.out.println(do2());
        try {
            doSomeThing();
            System.out.println("aaabbb");
        }catch (Exception e){
            System.out.println("aaa");
            e.printStackTrace();
        }
    }
}
