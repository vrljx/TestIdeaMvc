package com.ljx.chapter06.test084;

/**
 * @Created by taylor on 2016/11/24.
 * @DESC
 * 使用构造函数协助描述枚举项
 * 枚举类可以有，排序号，枚举描述。
 */
public enum Season {
    Spring("春"),Summer("夏"),Autumn("秋"),Winter("冬");
    private String desc;
    Season(String _desc){
        this.desc = _desc;
    }
    public String getDesc(){
        System.out.println(this.desc);
        return this.desc;
    }
//    Spring ("春天"), Summer ("夏天"),Autumn ("秋天"), Winter ("冬天");
    public static void main(String[] args) {
        Season s1 = Season.Spring;
        s1.getDesc();
    }
}
