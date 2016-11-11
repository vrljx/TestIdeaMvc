package com.ljx.chapter04.test052;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * @Created by taylor on 2016/11/11.
 * @DESC    推荐使用String直接赋值。而不是new
 */
public class Client052 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = new String("aaa");
        String s4 = new String("中国");
        String s5 = s4.intern();
        String s6 = s3.intern();
        System.out.println("s3 intern = " + s3.intern());
        System.out.println("s5 = "+s5);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s4 == s5);
        System.out.println(s1 == s6);
        System.out.println(s3 == s6);
        
       /*
        String 字符串池，类似于pool。
        如果没有aaa，则创建aaa返回地址。
        若再次String = aaa ，则有了，依然返回上述地址。
        new String(aaa) 会创建一个新的，不检查池中是否已存在。
        当intern() 的时候，又会去检查了。所以又返回了第一个地址。
         */
    }
}
