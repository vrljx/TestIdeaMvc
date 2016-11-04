package com.ljx.test009;
import static java.lang.Math.PI;
/**
 * @Created by taylor on 2016/11/4.
 * @DESC 对于静态导入，一定要遵循两个规则： 不使用*（星号）通配符，除非是导入静态常量类（只包含常量的类或接口）。 方法名是具有明确、清晰表象意义的工具类。 
 */
public class Client9_2 {
    public  static  double calCircleArea(double r){
       return PI*r*r; 
    }
    public static double calCBallArea(double r){
        return 4*PI*r*r;
    }
}
