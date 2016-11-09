package com.ljx.test034;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC    构造函数尽量简化
 */
/*
0、要解释这个问题，我们首先要说说子类是如何实例化的。子类实例化时，会首先初始化父类（注意这里是初始化，可不是生成父类对象），也就是初始化父类的变量，调用父类的构造函数，然后才会初始化子类的变量，调用子类自己的构造函数，最后生成一个实例对象。了解了相关知识，我们再来看上面的程序，其执行过程如下：
1、先初始化Server的变量与构造函数，有了DEFAULT_PORT
2、执行getPort方法，调用子类的getPort，返回一个port值，可以是0 可以是4000，父类初始化完毕。
3、开始执行子类的 变量和构造方法。
4、给port赋值为100.
5、port被赋值为1000.
6、结束
 */
public class Client034 {
    public static void main(String[] args) {
        Server server = new SimpleServer(1000);
//        System.out.println(server.getPort());
    }
}
