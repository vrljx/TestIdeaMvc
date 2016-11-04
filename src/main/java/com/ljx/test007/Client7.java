package com.ljx.test007;

/**
 * @Created by taylor on 2016/11/4.
 * @DESC 自增的陷阱
 */
public class Client7 {
    public static void main(String[] args) {
       Client7 c7 = new Client7(); 
//        c7.addSelf(0,10);
//        c7.addSelf(10);
        c7.addSelfCommit(10);
    } 
    public  void addSelf(int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = count++;
        }
        System.out.println(count);
    }

    /**
     * @DESC 上述方法的内容每次循环其实如下
     * @param n
     */
    public  void addSelfCommit(int n){
        int count = 0;
        int temp = count; 
        count++;
        System.out.println(temp); 
    }
    public  void addSelf(int count,int n){
        for (int l = 0; l < n; l++) {
           count ++; 
        }
        System.out.println(count);
    }
}
