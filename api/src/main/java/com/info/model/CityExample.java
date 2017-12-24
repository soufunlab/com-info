package com.info.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.ratel.common.model.base.BaseModel;

/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/12/23 10:50  by  李浩（lihao@cloud-young.com）创建
 */

public class CityExample extends BaseModel {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements java.io.Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

       
		
		
			//alias
	
		public Criteria andIdLike(Integer value) {
            addCriterion("id like", value, "Id");
            return (Criteria) this;
        }
		

		public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "Id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "Id");
            return (Criteria) this;
        } 
	
		public Criteria andNameLike(String value) {
            addCriterion("name like", value, "Name");
            return (Criteria) this;
        }
		

		public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "Name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "Name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "Name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "Name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "Name");
            return (Criteria) this;
        } 
	
		public Criteria andCountryCodeLike(String value) {
            addCriterion("countrycode like", value, "CountryCode");
            return (Criteria) this;
        }
		

		public Criteria andCountryCodeIsNull() {
            addCriterion("countrycode is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("countrycode is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("countrycode =", value, "CountryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("countrycode <>", value, "CountryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("countrycode >", value, "CountryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("countrycode >=", value, "CountryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("countrycode <", value, "CountryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("countrycode <=", value, "CountryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("countrycode in", values, "CountryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("countrycode not in", values, "CountryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("countrycode between", value1, value2, "CountryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("countrycode not between", value1, value2, "CountryCode");
            return (Criteria) this;
        } 
	
		public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "District");
            return (Criteria) this;
        }
		

		public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "District");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "District");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "District");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "District");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "District");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "District");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "District");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "District");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "District");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "District");
            return (Criteria) this;
        } 
	
		public Criteria andPopulationLike(Integer value) {
            addCriterion("population like", value, "Population");
            return (Criteria) this;
        }
		

		public Criteria andPopulationIsNull() {
            addCriterion("population is null");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNotNull() {
            addCriterion("population is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationEqualTo(Integer value) {
            addCriterion("population =", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotEqualTo(Integer value) {
            addCriterion("population <>", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThan(Integer value) {
            addCriterion("population >", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThanOrEqualTo(Integer value) {
            addCriterion("population >=", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThan(Integer value) {
            addCriterion("population <", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThanOrEqualTo(Integer value) {
            addCriterion("population <=", value, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationIn(List<Integer> values) {
            addCriterion("population in", values, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotIn(List<Integer> values) {
            addCriterion("population not in", values, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationBetween(Integer value1, Integer value2) {
            addCriterion("population between", value1, value2, "Population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotBetween(Integer value1, Integer value2) {
            addCriterion("population not between", value1, value2, "Population");
            return (Criteria) this;
        } 
		
       
    }

    public static class Criteria extends GeneratedCriteria implements java.io.Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements java.io.Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}