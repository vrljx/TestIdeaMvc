package com.ljx.chapter07.test103;

/**
 * @Created by taylor on 2016/11/29.
 * @DESC    反射访问属性和方法时，将accessible设为true
 */
public class Client103 {
    /*
    Java通过反射执行一个方法的过程：
    1、获取一个方法对象。
    2、判断isAccessible是否为true，如果false，则set为true；  访问权限检查
    3、执行invoke方法
    Method method = ....
    if(method.isAccessible){
        method.invoke(obj,ags)
    }
    但，方法对象的isAccessible属性并不是用来决定是否可访问的。
    如Foo.class
     */
    
}
