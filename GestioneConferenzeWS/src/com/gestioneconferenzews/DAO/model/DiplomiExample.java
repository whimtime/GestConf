package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.List;

public class DiplomiExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	public DiplomiExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andCdDiplomaIsNull() {
			addCriterion("cd_diploma is null");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaIsNotNull() {
			addCriterion("cd_diploma is not null");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaEqualTo(Integer value) {
			addCriterion("cd_diploma =", value, "cdDiploma");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaNotEqualTo(Integer value) {
			addCriterion("cd_diploma <>", value, "cdDiploma");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaGreaterThan(Integer value) {
			addCriterion("cd_diploma >", value, "cdDiploma");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_diploma >=", value, "cdDiploma");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaLessThan(Integer value) {
			addCriterion("cd_diploma <", value, "cdDiploma");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaLessThanOrEqualTo(Integer value) {
			addCriterion("cd_diploma <=", value, "cdDiploma");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaIn(List<Integer> values) {
			addCriterion("cd_diploma in", values, "cdDiploma");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaNotIn(List<Integer> values) {
			addCriterion("cd_diploma not in", values, "cdDiploma");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaBetween(Integer value1, Integer value2) {
			addCriterion("cd_diploma between", value1, value2, "cdDiploma");
			return (Criteria) this;
		}

		public Criteria andCdDiplomaNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_diploma not between", value1, value2, "cdDiploma");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaIsNull() {
			addCriterion("cd_conferenza is null");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaIsNotNull() {
			addCriterion("cd_conferenza is not null");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaEqualTo(Integer value) {
			addCriterion("cd_conferenza =", value, "cdConferenza");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaNotEqualTo(Integer value) {
			addCriterion("cd_conferenza <>", value, "cdConferenza");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaGreaterThan(Integer value) {
			addCriterion("cd_conferenza >", value, "cdConferenza");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_conferenza >=", value, "cdConferenza");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaLessThan(Integer value) {
			addCriterion("cd_conferenza <", value, "cdConferenza");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaLessThanOrEqualTo(Integer value) {
			addCriterion("cd_conferenza <=", value, "cdConferenza");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaIn(List<Integer> values) {
			addCriterion("cd_conferenza in", values, "cdConferenza");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaNotIn(List<Integer> values) {
			addCriterion("cd_conferenza not in", values, "cdConferenza");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaBetween(Integer value1, Integer value2) {
			addCriterion("cd_conferenza between", value1, value2,
					"cdConferenza");
			return (Criteria) this;
		}

		public Criteria andCdConferenzaNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_conferenza not between", value1, value2,
					"cdConferenza");
			return (Criteria) this;
		}

		public Criteria andCdPersonaIsNull() {
			addCriterion("cd_persona is null");
			return (Criteria) this;
		}

		public Criteria andCdPersonaIsNotNull() {
			addCriterion("cd_persona is not null");
			return (Criteria) this;
		}

		public Criteria andCdPersonaEqualTo(Integer value) {
			addCriterion("cd_persona =", value, "cdPersona");
			return (Criteria) this;
		}

		public Criteria andCdPersonaNotEqualTo(Integer value) {
			addCriterion("cd_persona <>", value, "cdPersona");
			return (Criteria) this;
		}

		public Criteria andCdPersonaGreaterThan(Integer value) {
			addCriterion("cd_persona >", value, "cdPersona");
			return (Criteria) this;
		}

		public Criteria andCdPersonaGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_persona >=", value, "cdPersona");
			return (Criteria) this;
		}

		public Criteria andCdPersonaLessThan(Integer value) {
			addCriterion("cd_persona <", value, "cdPersona");
			return (Criteria) this;
		}

		public Criteria andCdPersonaLessThanOrEqualTo(Integer value) {
			addCriterion("cd_persona <=", value, "cdPersona");
			return (Criteria) this;
		}

		public Criteria andCdPersonaIn(List<Integer> values) {
			addCriterion("cd_persona in", values, "cdPersona");
			return (Criteria) this;
		}

		public Criteria andCdPersonaNotIn(List<Integer> values) {
			addCriterion("cd_persona not in", values, "cdPersona");
			return (Criteria) this;
		}

		public Criteria andCdPersonaBetween(Integer value1, Integer value2) {
			addCriterion("cd_persona between", value1, value2, "cdPersona");
			return (Criteria) this;
		}

		public Criteria andCdPersonaNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_persona not between", value1, value2, "cdPersona");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table diplomi
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 24 10:04:48 CEST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}