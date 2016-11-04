package com.ljx.test011;
import com.ljx.test011.SerialazationUtils;
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
