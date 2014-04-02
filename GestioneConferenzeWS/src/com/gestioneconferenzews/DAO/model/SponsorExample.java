package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.List;

public class SponsorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public SponsorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    protected abstract static class GeneratedCriteria {
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

        public Criteria andCdSponsorIsNull() {
            addCriterion("cd_sponsor is null");
            return (Criteria) this;
        }

        public Criteria andCdSponsorIsNotNull() {
            addCriterion("cd_sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andCdSponsorEqualTo(Integer value) {
            addCriterion("cd_sponsor =", value, "cdSponsor");
            return (Criteria) this;
        }

        public Criteria andCdSponsorNotEqualTo(Integer value) {
            addCriterion("cd_sponsor <>", value, "cdSponsor");
            return (Criteria) this;
        }

        public Criteria andCdSponsorGreaterThan(Integer value) {
            addCriterion("cd_sponsor >", value, "cdSponsor");
            return (Criteria) this;
        }

        public Criteria andCdSponsorGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_sponsor >=", value, "cdSponsor");
            return (Criteria) this;
        }

        public Criteria andCdSponsorLessThan(Integer value) {
            addCriterion("cd_sponsor <", value, "cdSponsor");
            return (Criteria) this;
        }

        public Criteria andCdSponsorLessThanOrEqualTo(Integer value) {
            addCriterion("cd_sponsor <=", value, "cdSponsor");
            return (Criteria) this;
        }

        public Criteria andCdSponsorIn(List<Integer> values) {
            addCriterion("cd_sponsor in", values, "cdSponsor");
            return (Criteria) this;
        }

        public Criteria andCdSponsorNotIn(List<Integer> values) {
            addCriterion("cd_sponsor not in", values, "cdSponsor");
            return (Criteria) this;
        }

        public Criteria andCdSponsorBetween(Integer value1, Integer value2) {
            addCriterion("cd_sponsor between", value1, value2, "cdSponsor");
            return (Criteria) this;
        }

        public Criteria andCdSponsorNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_sponsor not between", value1, value2, "cdSponsor");
            return (Criteria) this;
        }

        public Criteria andDenominazioneIsNull() {
            addCriterion("denominazione is null");
            return (Criteria) this;
        }

        public Criteria andDenominazioneIsNotNull() {
            addCriterion("denominazione is not null");
            return (Criteria) this;
        }

        public Criteria andDenominazioneEqualTo(String value) {
            addCriterion("denominazione =", value, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneNotEqualTo(String value) {
            addCriterion("denominazione <>", value, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneGreaterThan(String value) {
            addCriterion("denominazione >", value, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneGreaterThanOrEqualTo(String value) {
            addCriterion("denominazione >=", value, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneLessThan(String value) {
            addCriterion("denominazione <", value, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneLessThanOrEqualTo(String value) {
            addCriterion("denominazione <=", value, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneLike(String value) {
            addCriterion("denominazione like", value, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneNotLike(String value) {
            addCriterion("denominazione not like", value, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneIn(List<String> values) {
            addCriterion("denominazione in", values, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneNotIn(List<String> values) {
            addCriterion("denominazione not in", values, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneBetween(String value1, String value2) {
            addCriterion("denominazione between", value1, value2, "denominazione");
            return (Criteria) this;
        }

        public Criteria andDenominazioneNotBetween(String value1, String value2) {
            addCriterion("denominazione not between", value1, value2, "denominazione");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sponsor
     *
     * @mbggenerated do_not_delete_during_merge Wed Apr 02 22:57:42 CEST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sponsor
     *
     * @mbggenerated Wed Apr 02 22:57:42 CEST 2014
     */
    public static class Criterion {
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