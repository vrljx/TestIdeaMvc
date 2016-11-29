package com.ljx.chapter07.test098;

/**
 * @Created by taylor on 2016/11/25.
 * @DESC    建议泛型的顺序
 *  1、List<T>   确定一个类型
 *  2、List<?>   任意类型，只可读不可写
 *  3、List<Object>      可以读写，但是写入的时候要 向上转型，up cast，读出的又需要down cast 失去了泛型的意义
 */
public class Client098 {
}
