package com.ljx.chapter03.test051;

/**
 * @Created by taylor on 2016/11/11.
 * @DESC    `不要主动进行垃圾回收
 * Sytem.gc 的垃圾回收方法会暂停全部请求全部相应，才能检查可回收的对象，
 * 不要调用System.gc，即使经常出现内存溢出也不要调用，内存溢出是可分析的，是可以查找出原因的
 */
public class Client051 {
}
