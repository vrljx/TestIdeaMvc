package com.ljx.chapter06.test086;

/**
 * @Created by taylor on 2016/11/25.
 * @DESC 在switch里必须加上default，就算是对枚举进行switch，也需要。
 * 枚举类后续增加属性后，switch编译是不会报错的。避免漏下，可以在default里抛出一个自定义异常。
 */
public enum LogLevel {
    DEBUG,WARN,INFO,ERROR;
}
