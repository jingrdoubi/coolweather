package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 11941 on 2017/8/5.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;//县名
    private String weatherId;//对应的天气id
    private String cityId;//当前所属市的id的值
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return  weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public String getCityId(){
        return cityId;
    }
    public void setCityId(String cityId){
        this.cityId=cityId;
    }
}
