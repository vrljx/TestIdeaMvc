package com.ljx.chapter08.test110;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Created by taylor on 2016/11/29.
 * @DESC    提倡异常封装
 * Java API 提供的异常都是比较低级的，低级别的异常，
 * 如果要与业务相关，则要封装异常
 */
public class Client110 {
    public static void doStuff() throws MyException {
        List<Throwable> list = new ArrayList<Throwable>();
        try {
            
        }catch (Exception e){
            list.add(e);
        }
        // .... 多个 list.add
        list.add(new FileNotFoundException());
        list.add(new NullPointerException());
        list.add(new OutOfMemoryError());
        if(list.size()>0){
            throw new MyException(list);
        }
    }

    public static void main(String[] args) throws MyException {
        doStuff();
    }
    
    /*
    这样一来，doStuff方法的调用者就可以一次获得多个异常了，也能够为用户提供完整的例外情况说明。
    可能有读者会问：这种情况可能出现吗？怎么会要求一个方法抛出多个异常呢？ 
    绝对可能出现，
        例如Web界面注册时，展现层依次把User对象传递到逻辑层，Register方法需要对各个Field进行校验并注册，例如用户名不能重复，密码必须符合密码策略等，不要出现用户第一次提交时系统提示“用户名重复”，在用户修改用户名再次提交后，系统又提示“密码长度少于6位”的情况，这种操作模式下的用户体验非常糟糕，最好的解决办法就是封装异常，建立异常容器，一次性地对User对象进行校验，然后返回所有的异常。
     */
}
