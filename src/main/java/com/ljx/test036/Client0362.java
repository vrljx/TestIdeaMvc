package com.ljx.test036;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC, 构造代码块，先后顺序，先静态，在普通，后构造函数。
 */
public class Client0362 {
    {
        System.out.println("构造代码块");
    }
    static {
        System.out.println("静态 构造代码块");
    }
    public Client0362(){
        System.out.println("无参数 构造函数");
    }
    public Client0362(String a){
        System.out.println("有参数 构造函数a = " +a );
    }

    public static void main(String[] args) {
        Client0362 s = new Client0362();
        System.out.println(
                "——————————"
        );
        Client0362 s2 = new Client0362("bbbbbbbbbbb");
    }
}
