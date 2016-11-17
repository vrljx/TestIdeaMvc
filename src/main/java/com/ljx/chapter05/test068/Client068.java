package com.ljx.chapter05.test068;

/**
 * @Created by taylor on 2016/11/17.
 * @DESC    频繁插入和删除的时候用LinkedList
 */
public class Client068 {
    /*
    1、插入元素
    ArrayList，需要插入元素后面的 都向后移动一位。
    LinkedList，只需改变引用即可，前一个的后指向，后一个的前指向，指向新加入的即可。
    LinkedList的效率比 ArrayList快50倍左右。
     */
    /*
    1-1：增加元素。效率一样。LInked增加一个Entry，改变指向。ArrayList增加一个放到数组后面。
     */
    /*
    2、删除元素。
    同上一个，ArrayList依然是大量的数据移动一位。
    LinkedList是引用的改变。
     */
    
    /*
    3、修改元素
    LinkedList需要遍历元素，效率远不如ArrayList
     */
}
