package com.ljx.chapter05.test075;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Created by taylor on 2016/11/21.
 * @DESC
 * indexOf依赖equals方法查找，binarySearch则依赖compareTo方法查找。 equals是判断元素是否相等，compareTo是判断元素在排序中的位置是否相同。 既然一个是决定排序位置，一个是决定相等，那我们就应该保证当排序位置相同时，其equals也相同，否则就会产生逻辑混乱。 注意　实现了compareTo方法，就应该覆写equals方法，确保两者同步。
 */
public class City implements Comparable{

    private int cityId;
    
    private String cityName;
    
    public City(int _cityId,String _cityName){
        this.cityId = _cityId;
        this.cityName = _cityName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    public int compareTo(Object object) {
        City o = (City)object;
        return new CompareToBuilder().append(cityName,o.cityName).toComparison();
    }
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(o == this){
            return true;
        }
        if(o.getClass() != this.getClass()){
            return false;
        }
        // 根据Code判断是否相等。
        return new EqualsBuilder().append(cityId,((City) o).cityId).isEquals();
    }

    public static void main(String[] args) {
        List<City> list = new ArrayList<City>();
        list.add(new City(1,"北京"));
        list.add(new City(3,"河北"));
        list.add(new City(2,"天津"));
        Collections.sort(list);
        City obj = new City(2,"天津");
        int index1 = list.indexOf(obj);
        System.out.println(index1);
        System.out.println();
        
    }
}
