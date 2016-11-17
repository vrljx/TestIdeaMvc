package com.ljx.chapter05.test069;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Created by taylor on 2016/11/17.
 * @DESC    列表相等的判断，内容和长度一样即可。
 */
public class Client069 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("aaa");
        
        List<String> list2 = new Vector<String>();
        list2.add("aaa");

        System.out.println(list1 == list2); // 肯定不等，比的是地址
        System.out.println(list1.equals(list2));
        /*
        它不关心List的具体实现类。只要所有的元素相等，并且长度也相等就表明两个List是相等的，与具体的容量类型无关。也就是说，上面的例子中虽然一个是ArrayList，一个是Vector，只要里面的元素相等，那结果就是相等。 Java如此处理也确实是在为开发者考虑，列表只是一个容器，只要是同一种类型的容器（如List），不用关心容器的细节差别（如ArrayList与LinkedList），只要确定所有的元素数据相等，那这两个列表就是相等的。如此一来，我们在开发中就不用太关注容器细节了，可以把注意力更多地放在数据元素上，而且即使在中途重构容器类型，也不会对相等的判断产生太大的影响。 其他的集合类型，如Set、Map等与此相同，也是只关心集合元素，不用考虑集合类型。 注意　判断集合是否相等时只须关注元素是否相等即可。
         */
    }
}
