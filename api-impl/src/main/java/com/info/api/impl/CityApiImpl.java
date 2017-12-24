package com.info.api.impl;

import com.info.api.CityApi;
import com.info.service.*;
import com.ratel.common.utils.ExceptionUtils;
import org.springframework.stereotype.Service;
import com.info.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import com.info.service.*;
import com.info.model.*;
import com.ratel.common.model.base.Result;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import com.info.constants.*;
import com.info.query.*;
import com.ratel.common.model.page.Pagination;
import com.ratel.common.model.MoChecker;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/23 11:13  by  李浩（lihao@cloud-young.com）创建
 */

@Service("cityApi")
public class CityApiImpl implements CityApi {
	
	private static LogUtil logger = LogUtil.build(CityApiImpl.class);
	
	@Autowired
    private CityService service;
	
	@Override
	public Result<City> getCityById(Integer id, String sessionId){
		try {
            if (id == null) {
				return new Result(ErroType.PARAMETER_ERROR.value(),ErroType.PARAMETER_ERROR.message());
            }

            City result = service.selectByPrimaryKey(id);
            if (result != null) {
                return new Result<City>(result);
            }
            return new Result(ErroType.BUSINESS_ERROR.value(), ErroType.BUSINESS_ERROR.message());
        } catch (Exception ex) {
            logger.error("getCity", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
	}
	
	@Override
	public Result<City> addCity(City entity, String sessionId){
		
        try {
            String cs = MoChecker.checkInsert(entity);
            if (StringUtils.isNotEmpty(cs)) {
                return new Result(ErroType.PARAMETER_ERROR.value(), cs + ErroType.PARAMETER_ERROR.message() + ":" + cs);
            }

            int count = service.insertSelective(entity);
            if (count > 0) {
                return new Result<City>(entity);
            }
            return new Result(ErroType.BUSINESS_ERROR.value(), ErroType.BUSINESS_ERROR.message());
        } catch (Exception ex) {
            logger.error("addCity", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }
	
	@Override
	public Result<Boolean> delCityById(Integer id, String sessionId) {
        try {
            if (id == null) {
                return new Result(ErroType.PARAMETER_ERROR.value(),ErroType.PARAMETER_ERROR.message());
            }
			
			City entity = service.selectByPrimaryKey(id);
			if (entity != null) {
				//entity.setIsActive(0);
				int count = service.updateByPrimaryKeySelective(entity);
				if (count > 0) {
					return new Result<Boolean>(true);
				}
			}
            return new Result(ErroType.BUSINESS_ERROR.value(), ErroType.BUSINESS_ERROR.message());
        } catch (Exception ex) {
            logger.error("updateProductGoods", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }
	
	@Override
	public Result<Boolean> updateCity(City entity, String sessionId){
		
        try {
            String cs = MoChecker.checkUpdate(entity);
            if (StringUtils.isNotEmpty(cs)) {
               return new Result(ErroType.PARAMETER_ERROR.value(), cs + ErroType.PARAMETER_ERROR.message() + ":" + cs);
            }
			
			int count = service.updateByPrimaryKeySelective(entity);
            if (count > 0) {
                return new Result(true);
            }
			
            return new Result(ErroType.BUSINESS_ERROR.value(), ErroType.BUSINESS_ERROR.message());
        } catch (Exception ex) {
            logger.error("updateCity", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }
	
	@Override
	public Result<List<City>> getCityListByCondition(CitySearchParameter searchVo,String sessionId){
        try {
            if (searchVo == null) {
                return new Result(ErroType.PARAMETER_ERROR.value(),ErroType.PARAMETER_ERROR.message());
            }
            List<City> list = service.getCityListByCondition(searchVo);
            return new Result<List<City>>(list);
        } catch (Exception ex) {
            logger.error("getCityListByCondition", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
    }
	
	@Override
	public Result<Pagination<City>> getCityPageListByCondition(CitySearchParameter searchVo,Pagination page,String sessionId){
		try {
            if (searchVo == null||page == null) {
                return new Result(ErroType.PARAMETER_ERROR.value(),ErroType.PARAMETER_ERROR.message());
            }
            Pagination<City> list = service.getCityPageListByCondition(searchVo,page);
            return new Result<Pagination<City>>(list);
        } catch (Exception ex) {
            logger.error("getCityVoListByCondition", ex);
            return new Result(ErroType.INNER_ERROR.value(), ErroType.INNER_ERROR.message() + ":" + ExceptionUtils.errInfo(ex));
        }
	}
}
