package com.ljx.test004;

import java.text.NumberFormat;

/**
 * @Created by taylor on 2016/11/2.
 * @DESC 避免带有变长参数的方法重载
 * 而Java 5引入变长参数（varags）就是为了更好地提高方法的复用性，让方法的调用者可以“随心所欲”地传递实参数量，当然变长参数也是要遵循一定规则的，比如变长参数必须是方法中的最后一个参数；一个方法不能定义多个变长参数
 */
public class Client4 {
    // 简单折扣计算
    public void calPrice (int price,int discount){
        float knockDownPrcie = price * discount /100.0F;
        System.out.println("简单折扣后的价格 ： = " + formatCurrency(knockDownPrcie));
    }
    
    public  void calPrice (int price , int...discounts){
        float knockDownPrice = price;
        for (int discount : discounts) {
            knockDownPrice = knockDownPrice*discount/100;
        }
        System.out.println("复杂折扣后的价格： = "+ formatCurrency(knockDownPrice));
    }
    private String formatCurrency(float knockDownPrcie) {
        return NumberFormat.getCurrencyInstance().format(knockDownPrcie/100);
    }

    /**
     * 
     * @param args
     * 现在的问题是编译器为什么会首先根据2个int类型的实参而不是1个int类型、1个int数组类型的实参来查找方法呢？这是个好问题，也非常好回答：因为int是一个原生数据类型，而数组本身是一个对象，编译器想要“偷懒”，于是它会从最简单的开始“猜想”，只要符合编译条件的即可通过，于是就出现了此问题。
     */
    public static void main(String[] args) {
        Client4 c = new Client4();
        c.calPrice(4999,75);
    }
}
