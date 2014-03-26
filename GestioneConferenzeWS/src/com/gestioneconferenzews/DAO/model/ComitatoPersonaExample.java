package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.List;

public class ComitatoPersonaExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	public ComitatoPersonaExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
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

		public Criteria andCdComitatoPersonaIsNull() {
			addCriterion("cd_comitato_persona is null");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaIsNotNull() {
			addCriterion("cd_comitato_persona is not null");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaEqualTo(Integer value) {
			addCriterion("cd_comitato_persona =", value, "cdComitatoPersona");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaNotEqualTo(Integer value) {
			addCriterion("cd_comitato_persona <>", value, "cdComitatoPersona");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaGreaterThan(Integer value) {
			addCriterion("cd_comitato_persona >", value, "cdComitatoPersona");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_comitato_persona >=", value, "cdComitatoPersona");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaLessThan(Integer value) {
			addCriterion("cd_comitato_persona <", value, "cdComitatoPersona");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaLessThanOrEqualTo(Integer value) {
			addCriterion("cd_comitato_persona <=", value, "cdComitatoPersona");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaIn(List<Integer> values) {
			addCriterion("cd_comitato_persona in", values, "cdComitatoPersona");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaNotIn(List<Integer> values) {
			addCriterion("cd_comitato_persona not in", values,
					"cdComitatoPersona");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaBetween(Integer value1,
				Integer value2) {
			addCriterion("cd_comitato_persona between", value1, value2,
					"cdComitatoPersona");
			return (Criteria) this;
		}

		public Criteria andCdComitatoPersonaNotBetween(Integer value1,
				Integer value2) {
			addCriterion("cd_comitato_persona not between", value1, value2,
					"cdComitatoPersona");
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

		public Criteria andCdComitatoIsNull() {
			addCriterion("cd_comitato is null");
			return (Criteria) this;
		}

		public Criteria andCdComitatoIsNotNull() {
			addCriterion("cd_comitato is not null");
			return (Criteria) this;
		}

		public Criteria andCdComitatoEqualTo(Integer value) {
			addCriterion("cd_comitato =", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoNotEqualTo(Integer value) {
			addCriterion("cd_comitato <>", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoGreaterThan(Integer value) {
			addCriterion("cd_comitato >", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_comitato >=", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoLessThan(Integer value) {
			addCriterion("cd_comitato <", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoLessThanOrEqualTo(Integer value) {
			addCriterion("cd_comitato <=", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoIn(List<Integer> values) {
			addCriterion("cd_comitato in", values, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoNotIn(List<Integer> values) {
			addCriterion("cd_comitato not in", values, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoBetween(Integer value1, Integer value2) {
			addCriterion("cd_comitato between", value1, value2, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_comitato not between", value1, value2,
					"cdComitato");
			return (Criteria) this;
		}

		public Criteria andChairIsNull() {
			addCriterion("chair is null");
			return (Criteria) this;
		}

		public Criteria andChairIsNotNull() {
			addCriterion("chair is not null");
			return (Criteria) this;
		}

		public Criteria andChairEqualTo(Integer value) {
			addCriterion("chair =", value, "chair");
			return (Criteria) this;
		}

		public Criteria andChairNotEqualTo(Integer value) {
			addCriterion("chair <>", value, "chair");
			return (Criteria) this;
		}

		public Criteria andChairGreaterThan(Integer value) {
			addCriterion("chair >", value, "chair");
			return (Criteria) this;
		}

		public Criteria andChairGreaterThanOrEqualTo(Integer value) {
			addCriterion("chair >=", value, "chair");
			return (Criteria) this;
		}

		public Criteria andChairLessThan(Integer value) {
			addCriterion("chair <", value, "chair");
			return (Criteria) this;
		}

		public Criteria andChairLessThanOrEqualTo(Integer value) {
			addCriterion("chair <=", value, "chair");
			return (Criteria) this;
		}

		public Criteria andChairIn(List<Integer> values) {
			addCriterion("chair in", values, "chair");
			return (Criteria) this;
		}

		public Criteria andChairNotIn(List<Integer> values) {
			addCriterion("chair not in", values, "chair");
			return (Criteria) this;
		}

		public Criteria andChairBetween(Integer value1, Integer value2) {
			addCriterion("chair between", value1, value2, "chair");
			return (Criteria) this;
		}

		public Criteria andChairNotBetween(Integer value1, Integer value2) {
			addCriterion("chair not between", value1, value2, "chair");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table comitato_persona
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
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
     * This class corresponds to the database table comitato_persona
     *
     * @mbggenerated do_not_delete_during_merge Sun Mar 23 21:34:13 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}