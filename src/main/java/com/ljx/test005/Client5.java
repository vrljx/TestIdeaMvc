package com.ljx.test005;

/**
 * @Created by taylor on 2016/11/2.
 * @DESC
 */
public class Client5 {
    public void methodA (String str , int... a ){
        System.out.println("111");
    }
    public  void methodA (String str2 , String... b){
        System.out.println("2222");
    }
    public static void main(String[] args) throws  Exception{
        for(int i=0; i<100; i++){
            Thread.sleep(10000);
            Client5 c  = new Client5();
            c.methodA("aaa",0);
            c.methodA("bbb","bb");
            //调用者根据变长参数的规范调用，传入变长参数的实参数量可以是N个（N＞=0），那当然可以写成client.methodA（"china"）方法啊！完全符合规范，但是这却让编译器和调用者都很郁闷，程序符合规则却不能运行，如此问题，谁之责任呢？是Client类的设计者，他违反了KISS原则（Keep It Simple, Stupid，即懒人原则），按照此规则设计的方法应该很容易调用
//        c.methodA("ccc");
//        c.methodA("bbb",null);
            //不让编译器自己选择，比如先定义null为String的，则可以通过编译 
            String []a = null;
            c.methodA("dddd",a);

        }

    }
}
