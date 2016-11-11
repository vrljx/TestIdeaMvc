package com.ljx.chapter03.test042;

/**
 * @Created by taylor on 2016/11/11.
 * @DESC    不要实例化，让实例化工具类抛出异常
 */
public class DateUtilsSelf {
    private DateUtilsSelf(){
        throw new Error("不要实例化");
    }

    public static void main(String[] args) {
        new DateUtilsSelf();
    }
}
