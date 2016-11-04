package com.ljx.test010;
import static java.lang.Math.PI;
import static java.lang.Math.abs;
/**
 * @Created by taylor on 2016/11/4.
 * @DESC 不要在本类中覆盖静态导入的变量和方法
 * 就近原则,不会执行导入的静态类的同名方法了。
 */
public class Client10 {
    public static int abs(int abs){
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(abs(100));
    }
}
