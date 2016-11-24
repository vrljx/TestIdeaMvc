package com.ljx.chapter06.test085;

/**
 * @Created by taylor on 2016/11/24.
 * @DESC
 */
public enum Season {
    Spring("春天"),Summer("夏天"),Autumn("秋天"),Winter("冬天");
    
    private String desc;
    
    Season(String _desc){
        this.desc = _desc;
    }

    public String getDesc(){
        return desc;
    }
}
