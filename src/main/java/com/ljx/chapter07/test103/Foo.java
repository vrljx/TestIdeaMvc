package com.ljx.chapter07.test103;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Created by taylor on 2016/11/29.
 * @DESC
 */
public class Foo {
    public final void doStuff(){
        System.out.println("do this method doStuff");
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Foo.class.getMethod("doStuff");
        System.out.println(method.isAccessible());  // false， 
        method.invoke(new Foo());   // false，依然可以执行
        /*
        这是因为Accessible的属性并不是我们语法层级理解的访问权限，而是指是否更容易获得，是否进行安全检查
         */
        /*
        method.setAccessible(true);
        if(method.isAccessible()){
            System.out.println(method.invoke(new Foo()));
        }
        */
        /*
        Accessible属性只是用来判断是否需要进行安全检查的，
        如果不需要则直接执行，这就可以大幅度地提升系统性能
        （当然了，由于取消了安全检查，也可以运行private方法、访问private私有属性了）。
        经过测试，在大量的反射情况下，设置Accessible为true可以提升性能20倍以上。
         */
    }
}
