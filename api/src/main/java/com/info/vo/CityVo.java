package com.info.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.io.Serializable;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/23 10:50  by  李浩（lihao@cloud-young.com）创建
 */

public class CityVo implements Serializable {


	//alias
	private Integer id;  
	/**
	*
	*/
	private String name;  
	/**
	*
	*/
	private String countryCode;  
	/**
	*
	*/
	private String district;  
	/**
	*
	*/
	private Integer population;  
	

    
    public void setId(Integer id) {  
        this.id = id;  
    }  
      
    public Integer getId() {  
        return this.id;  
    }  
    
    public void setName(String name) {  
        this.name = name;  
    }  
      
    public String getName() {  
        return this.name;  
    }  
    
    public void setCountryCode(String countryCode) {  
        this.countryCode = countryCode;  
    }  
      
    public String getCountryCode() {  
        return this.countryCode;  
    }  
    
    public void setDistrict(String district) {  
        this.district = district;  
    }  
      
    public String getDistrict() {  
        return this.district;  
    }  
    
    public void setPopulation(Integer population) {  
        this.population = population;  
    }  
      
    public Integer getPopulation() {  
        return this.population;  
    }  
	
	

}
