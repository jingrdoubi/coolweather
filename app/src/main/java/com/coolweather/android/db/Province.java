package com.coolweather.android.db;

/**
 * Created by 11941 on 2017/8/2.
 */

        import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceName;//省名
    private int provinceCode;//省得代号
    public int getId()
    {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return  provinceCode;
    }
    public void setProvinceCode(int provinceCode)
    {
        this.provinceCode=provinceCode;
    }
}
