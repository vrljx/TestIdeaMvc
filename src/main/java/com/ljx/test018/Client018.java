package com.ljx.test018;

import com.alibaba.druid.sql.visitor.functions.Char;

import javax.swing.text.StyledEditorKit;
import java.util.Date;

/**
 * @Created by taylor on 2016/11/7.
 * @DESC 避免instanceOf非预期结果
 */
public class Client018 {
    public static void main(String[] args) {
        // String 是否是Object的实例。
        boolean b1 = "String" instanceof Object;
        // String对象是否是String的实例。
        boolean b2 = new String() instanceof String;
        // object 是否是String的实例
        /**
         * Object 的父类，对象肯定不是String，但是可以编译通过，因为instanceOf关键字，的左右两边，只要有继承关系就可以编译通过。
         */
        boolean b3 = new Object() instanceof  String;
        // 拆箱类型是否是装箱类型的实例
        /*
        编译不通过，因为A是一个char类型， 是基本类型，不是对象，instance方法只用于对象的判断
        boolean b4 = "A" instanceof Character;
         */
        // 空对象是否是String的实例
        /*
        instanceof的规定，只要左侧是null，则直接返回false，省去了判断null的情况
         */
        boolean b5 = null instanceof String;
        // 类型转换后的空对象，是否是String的实例
        /*
        null 是一个万用类型，不论怎么转，都是一个null，没有类型
         */
        boolean b6 = (String)null instanceof  String;
        // date对象是否是String的实例
//        boolean b7 = new Date() instanceof  String ;
        // 在泛型中判断String 是否是date的实例。
        /*
        编译通过，返回false。
        在转成字节码的时候，T就是Object的类型，虽说传入的是String，但表面是Object类型，object和date有继承关系，所以编译通过。
         */
        boolean b8 = new GenericClass<String>().isDateInstance(""); 
    }
}
class GenericClass<T> {
    // 判断是否date类型
    public boolean isDateInstance(T t){
        return t instanceof  Date;
    }
}
