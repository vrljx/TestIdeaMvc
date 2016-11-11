package com.ljx.chapter01.test011;

import java.io.Serializable;

/**
 * @Created by taylor on 2016/11/4.
 * @DESC
 */
public class Person implements Serializable{
    private static final long serialVersionUID = -2671274380430827985L;
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
