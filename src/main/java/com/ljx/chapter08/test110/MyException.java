package com.ljx.chapter08.test110;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created by taylor on 2016/11/29.
 * @DESC    只是一个异常容器，可以放入多个异常
 */
public class MyException extends Exception{
    private List<Throwable> causeList = new ArrayList<Throwable>();
    
    public MyException(){
        
    }
    public MyException(List<? extends Throwable> list){
        this.causeList.addAll(list);
    }
    public List<? extends Throwable> getCauseList(){
        return causeList;
    }
}
