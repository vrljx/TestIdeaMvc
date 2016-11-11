package com.ljx.chapter03.test048;

import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.*;
import java.util.logging.StreamHandler;

/**
 * @Created by taylor on 2016/11/11.
 * @DESC    如果重新了equals方法，则必须重新hashCode方法，因为如果Aequals等于B，则aA和B的hashCode必须相等。
 */
public class Person {
    public Person(String _name) {
        this.name = _name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
//        if(obj instanceof Person){    // 
     if(null != obj && obj.getClass() == this.getClass()){
            Person p = (Person) obj;
            if(name.equalsIgnoreCase(p.getName())){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        int a = new HashCodeBuilder().append(this.name).toHashCode();
        return a;
    }
    /*
接着深入探讨，那对象元素的hashCode方法返回的是什么值呢？它是一个对象的哈希码，是由Object类的本地方法生成的，确保每个对象有一个哈希码（这也是哈希算法的基本要求：任意输入k，通过一定算法f（k），将其转换为非可逆的输出，对于两个输入k1和k2，要求若k1=k2，则必须f（k1）=f（k2），但也允许k1≠k2，f（k1）=f（k2）的情况存在）。
     */
    public static void main(String[] args) {
        // Person 类的 map
        Map<Person, Object> map = new HashMap<Person,Object>();
        map.put(new Person("张三"),new Object());
        // Person 类的 List
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("张三"));
        System.out.println(map.containsKey(new Person("张三")));
        System.out.println("list长度 = " +list.size());
        System.out.println(list.contains(new Person("张三")));
        System.out.println("map 长度= " + map.size());
    }
}

