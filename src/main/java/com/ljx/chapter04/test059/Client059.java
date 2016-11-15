package com.ljx.chapter04.test059;

import javax.ejb.Local;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * @Created by taylor on 2016/11/15.
 * @DESC    字符串的排序，中文， 用Collator类进行排序，满足大部分情况，
 * 如有特殊情况，可以用pinyin4j工具类。
 */
public class Client059 {
    public static void main(String[] args) {
        // 排序混乱，因为Arrays 的排序方法是按String类里的compareTo方法，走的是unicode
        /*
        while（k＜lim）{ //原字符串的字符数组 char c1=v1[k]； //比较字符串的字符数组 char c2=v2[k]； if（c1！=c2）{ //比较两者的char值大小 return c1-c2； } k++； }
         */
        String str[] = {"张三","李四","吴六"};
        Arrays.sort(str);
        int i = 1;
        for (String s : str){
            System.out.println((i++) + " || "+ s);
        }
        
        // 推荐使用java的Collator类。
        Comparator comparator = Collator.getInstance(Locale.CHINA);
        Arrays.sort(str,comparator);
        int k = 0;
        for (String s : str){
            System.out.println((++k) +"||" + s);
        }
    }
}
