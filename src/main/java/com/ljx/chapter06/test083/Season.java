package com.ljx.chapter06.test083;

/**
 * @Created by taylor on 2016/11/24.
 * @DESC
 * 虽然枚举常量在很多方面比接口常量和类常量好用，但是有一点它是比不上接口常量和类常量的，那就是继承，枚举类型是不能有继承的，也就是说一个枚举常量定义完毕后，除非修改重构，否则无法做扩展，而接口常量和类常量则可以通过继承进行扩展。但是，一般常量在项目构建时就定义完毕了，很少会出现必须通过扩展才能实现业务逻辑的场景。 注意　在项目开发中，推荐使用枚举常量代替接口常量或类常量。
 */
public enum Season {
    Spring,Summer,Automn,Winter;
    
    public static Season getFirstSeason(){
        return Spring;
    }
    public static Season getTheMostHotSeason(){
        return Summer;
    }

    public static void describeSeason (Season s){
        switch (s){
            case Spring:
                System.out.println("春天");
                break;
            case Summer:
                System.out.println("夏天");
                break;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("第一个季节是："+getFirstSeason());
        System.out.println("最热的季节是："+getTheMostHotSeason());

        // 遍历枚举型；
        for(Season s : Season.values()){
            System.out.println(s);
        }
        describeSeason(Season.Spring);
    }
    
}
