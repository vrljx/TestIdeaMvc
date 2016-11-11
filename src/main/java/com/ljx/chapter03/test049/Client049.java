package com.ljx.chapter03.test049;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @Created by taylor on 2016/11/11.
 * @DESC    推荐重写toString方法。
 *     当Bean的属性较多时，自己实现就不可取了，不过可以使用apache的commons工具包中的ToStringBuilder类，简洁、实用又方便。
 */
public class Client049 {
    private String name;
    public Client049 (String _name){
        this.name = _name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 不重写，输出的对象就是机器文字。
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
//        return String.format("%s.name=%s",this.getClass(),name);
    }
    /*
    当Bean的属性较多时，自己实现就不可取了，不过可以使用apache的commons工具包中的ToStringBuilder类，简洁、实用又方便。 可能有读者要说了，为什么通过println方法打印一个对象会调用toString方法？那是源于println的实现机制：如果是一个原始类型就直接打印，如果是一个类类型，则打印出其toString方法的返回值，如此而已！
     */
    public static void main(String[] args) {
        System.out.println(new Client049("啊啊啊"));
    }
}
