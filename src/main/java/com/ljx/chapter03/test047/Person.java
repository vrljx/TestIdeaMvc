package com.ljx.chapter03.test047;

/**
 * @Created by taylor on 2016/11/11.
 * @DESC 
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

    public static void main(String[] args) {
        Person p1 = new Person("啊啊啊");
        Person p2 = new Person("啊啊啊");
        System.out.println(p1.equals(p2));
    }
}

