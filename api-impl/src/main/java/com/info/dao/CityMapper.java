package com.info.dao;

import com.info.dao.BaseMapper;
import org.springframework.stereotype.Repository;
import com.info.model.City;
import com.info.model.CityExample;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/23 10:50  by  李浩（lihao@cloud-young.com）创建
 */

@Repository
public interface CityMapper extends  BaseMapper<City, CityExample> {
	
}
