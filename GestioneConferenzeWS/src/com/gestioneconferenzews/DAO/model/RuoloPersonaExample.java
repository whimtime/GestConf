package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.List;

public class RuoloPersonaExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public RuoloPersonaExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
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

		public Criteria andCdRuoloIsNull() {
			addCriterion("cd_ruolo is null");
			return (Criteria) this;
		}

		public Criteria andCdRuoloIsNotNull() {
			addCriterion("cd_ruolo is not null");
			return (Criteria) this;
		}

		public Criteria andCdRuoloEqualTo(Integer value) {
			addCriterion("cd_ruolo =", value, "cdRuolo");
			return (Criteria) this;
		}

		public Criteria andCdRuoloNotEqualTo(Integer value) {
			addCriterion("cd_ruolo <>", value, "cdRuolo");
			return (Criteria) this;
		}

		public Criteria andCdRuoloGreaterThan(Integer value) {
			addCriterion("cd_ruolo >", value, "cdRuolo");
			return (Criteria) this;
		}

		public Criteria andCdRuoloGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_ruolo >=", value, "cdRuolo");
			return (Criteria) this;
		}

		public Criteria andCdRuoloLessThan(Integer value) {
			addCriterion("cd_ruolo <", value, "cdRuolo");
			return (Criteria) this;
		}

		public Criteria andCdRuoloLessThanOrEqualTo(Integer value) {
			addCriterion("cd_ruolo <=", value, "cdRuolo");
			return (Criteria) this;
		}

		public Criteria andCdRuoloIn(List<Integer> values) {
			addCriterion("cd_ruolo in", values, "cdRuolo");
			return (Criteria) this;
		}

		public Criteria andCdRuoloNotIn(List<Integer> values) {
			addCriterion("cd_ruolo not in", values, "cdRuolo");
			return (Criteria) this;
		}

		public Criteria andCdRuoloBetween(Integer value1, Integer value2) {
			addCriterion("cd_ruolo between", value1, value2, "cdRuolo");
			return (Criteria) this;
		}

		public Criteria andCdRuoloNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_ruolo not between", value1, value2, "cdRuolo");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ruolo_persona
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
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
     * This class corresponds to the database table ruolo_persona
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 12 22:32:36 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}