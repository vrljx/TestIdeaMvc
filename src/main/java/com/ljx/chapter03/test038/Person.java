package com.ljx.chapter03.test038;

import com.sun.jndi.cosnaming.IiopUrl;

/**
 * @Created by taylor on 2016/11/11.
 * @DESC    使用静态内部类，提高封装性
 * Java 中的嵌套类，分为，1-静态内部类，2-内部类。
static修饰的内部类，就是静态内部类，static class，static除此之外不能修饰类。
静态内部类的优点：增加了类的封装性，和 可读性。

 静态内部类与普通内部类的区别：
 1、静态内部类，不持有外部类的引用，不可以访问到外部类的private内容，只可以访问到static部分。
 2、静态内部类，可以脱离外部类独立存在，不与外部类共生死。内部类则与外部类有依赖关系。
 3、静态内部类可以声明static方法和变量，和外部类很相似。而普通内部类是不行的。
 
 */
public class Person {
    private String name;
    
    private Home home;

    public Person(String _name){
        this.name = _name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }
    // 通过代码就可以分析出2者的强关系，加强可读性。
    // 静态内部类虽然在外部类当中，但是依然可以像外部类一样去new。需要引入person.HOme.
    public static class Home{
        private String address;
        private String telphone;

        public Home(String _address, String _telphone){
            this.address = _address;
            this.telphone = _telphone;
        }
        
        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTelphone() {
            return telphone;
        }

        public void setTelphone(String telphone) {
            this.telphone = telphone;
        }
    }

    public static void main(String[] args) {
        Person p = new Person("张三");
        p.setHome(new Home("大柳树","621"));
        System.out.println(p.name);
        System.out.println(p.getName());
        System.out.println(p.home.address);
        System.out.println(p.home.telphone);
        System.out.println(p.getHome().telphone);
        System.out.println(p.getHome().address);
    }
}
