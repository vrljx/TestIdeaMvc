package com.ljx.chapter01.test011;

/**
 * @Created by taylor on 2016/11/4.
 * @DESC 生产者，
 */
public class Producer {
   public static void main(String[] args) {
      Person p = new Person();
      p.setName("taylor.li");
      SerialazationUtils.writeObject(p);
   } 
}
