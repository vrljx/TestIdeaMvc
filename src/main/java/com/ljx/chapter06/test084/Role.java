package com.ljx.chapter06.test084;

/**
 * @Created by taylor on 2016/11/24.
 * @DESC
 * 这样一个描述可以使开发者对Admin、User两个常量有一个立体多维度的认知，有名称、生命期，还有范围，而且还可以在程序中方便地获得此类的属性。 推荐大家在枚举定义中为每个枚举项定义描述，特别是在大规模的项目开发中，大量的常量项定义使用枚举项描述比在接口常量或类常量中增加注释的方式友好得多，简洁得多
 */
public enum Role {
    Manager("管理员","主",5),
    Employee("员工","次",6);

    private String name;
    
    private String desc;
    
    private int lifeInt;

    Role(String _name,String _desc,int _lifeInt){
        this.name = _name;
        this.desc = _desc;
        this.lifeInt = _lifeInt;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeInt() {
        return lifeInt;
    }

    public void setLifeInt(int lifeInt) {
        this.lifeInt = lifeInt;
    }

    public static void main(String[] args) {
    }
}
