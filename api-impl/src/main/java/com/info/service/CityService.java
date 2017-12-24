package com.info.service;

import com.info.service.BaseService;
import com.info.model.City;
import com.info.model.CityExample;
import com.info.query.*;
import java.util.List;
import com.ratel.common.model.page.Pagination;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/23 10:50  by  李浩（lihao@cloud-young.com）创建
 */

public interface CityService extends BaseService<City, CityExample> {
	
	/**
	 * @Description:
	 * @version 1.0 2017/12/23 10:50 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @return
	 */
	List<City> getCityListByCondition(CitySearchParameter searchVo);
	
	/**
	 * @Description:
	 * @version 1.0 2017/12/23 10:50 by 李浩（lihao@cloud-young.com）创建
	 * @param searchVo
	 * @param page
	 * @return
	 */	
	Pagination<City> getCityPageListByCondition(CitySearchParameter searchVo,Pagination page);
}
