package com.ljx.chapter03.test047;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * @Created by taylor on 2016/11/11.
 * @DESC
 */
public class Employee extends Person{

    private int id ;
    public Employee(String _name,int _id){
        super(_name);
        id = _id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String _name) {
        super(_name);
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Employee){
            Employee em = (Employee)obj;
            // super.equals(obj) 是判断name是否相当
            if(super.equals(obj) && id == em.getId()){
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("张三",100);
        Employee e2 = new Employee("张三",101);
        Person p1 = new Person("张三");
        System.out.println(p1.equals(e1));
        System.out.println(p1.equals(e2));
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(p1));
        System.out.println(e2.equals(p1));
        
        // p1 = e1 ， p1 = e2  因为是p1.equals。 调用的是p1的equals方法。
//        父类使用了instanceof关键字，它是用来判断是否是一个类的实例对象的，这很容易让子类“钻空子”。想要解决也很简单，使用getClass来代替instanceof进行类型判断，Person类的equals方法修改后如下所示： 
        
    }
}
