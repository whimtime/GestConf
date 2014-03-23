package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonaCompetenzaExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	public PersonaCompetenzaExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
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

		public Criteria andCdPersonaCompetenzaIsNull() {
			addCriterion("cd_persona_competenza is null");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaIsNotNull() {
			addCriterion("cd_persona_competenza is not null");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaEqualTo(Integer value) {
			addCriterion("cd_persona_competenza =", value,
					"cdPersonaCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaNotEqualTo(Integer value) {
			addCriterion("cd_persona_competenza <>", value,
					"cdPersonaCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaGreaterThan(Integer value) {
			addCriterion("cd_persona_competenza >", value,
					"cdPersonaCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_persona_competenza >=", value,
					"cdPersonaCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaLessThan(Integer value) {
			addCriterion("cd_persona_competenza <", value,
					"cdPersonaCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaLessThanOrEqualTo(Integer value) {
			addCriterion("cd_persona_competenza <=", value,
					"cdPersonaCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaIn(List<Integer> values) {
			addCriterion("cd_persona_competenza in", values,
					"cdPersonaCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaNotIn(List<Integer> values) {
			addCriterion("cd_persona_competenza not in", values,
					"cdPersonaCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaBetween(Integer value1,
				Integer value2) {
			addCriterion("cd_persona_competenza between", value1, value2,
					"cdPersonaCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdPersonaCompetenzaNotBetween(Integer value1,
				Integer value2) {
			addCriterion("cd_persona_competenza not between", value1, value2,
					"cdPersonaCompetenza");
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

		public Criteria andCdCompetenzaIsNull() {
			addCriterion("cd_competenza is null");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaIsNotNull() {
			addCriterion("cd_competenza is not null");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaEqualTo(Integer value) {
			addCriterion("cd_competenza =", value, "cdCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaNotEqualTo(Integer value) {
			addCriterion("cd_competenza <>", value, "cdCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaGreaterThan(Integer value) {
			addCriterion("cd_competenza >", value, "cdCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_competenza >=", value, "cdCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaLessThan(Integer value) {
			addCriterion("cd_competenza <", value, "cdCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaLessThanOrEqualTo(Integer value) {
			addCriterion("cd_competenza <=", value, "cdCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaIn(List<Integer> values) {
			addCriterion("cd_competenza in", values, "cdCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaNotIn(List<Integer> values) {
			addCriterion("cd_competenza not in", values, "cdCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaBetween(Integer value1, Integer value2) {
			addCriterion("cd_competenza between", value1, value2,
					"cdCompetenza");
			return (Criteria) this;
		}

		public Criteria andCdCompetenzaNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_competenza not between", value1, value2,
					"cdCompetenza");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoIsNull() {
			addCriterion("data_annullamento is null");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoIsNotNull() {
			addCriterion("data_annullamento is not null");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoEqualTo(Date value) {
			addCriterion("data_annullamento =", value, "dataAnnullamento");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoNotEqualTo(Date value) {
			addCriterion("data_annullamento <>", value, "dataAnnullamento");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoGreaterThan(Date value) {
			addCriterion("data_annullamento >", value, "dataAnnullamento");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoGreaterThanOrEqualTo(Date value) {
			addCriterion("data_annullamento >=", value, "dataAnnullamento");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoLessThan(Date value) {
			addCriterion("data_annullamento <", value, "dataAnnullamento");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoLessThanOrEqualTo(Date value) {
			addCriterion("data_annullamento <=", value, "dataAnnullamento");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoIn(List<Date> values) {
			addCriterion("data_annullamento in", values, "dataAnnullamento");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoNotIn(List<Date> values) {
			addCriterion("data_annullamento not in", values, "dataAnnullamento");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoBetween(Date value1, Date value2) {
			addCriterion("data_annullamento between", value1, value2,
					"dataAnnullamento");
			return (Criteria) this;
		}

		public Criteria andDataAnnullamentoNotBetween(Date value1, Date value2) {
			addCriterion("data_annullamento not between", value1, value2,
					"dataAnnullamento");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table persona_competenza
	 * @mbggenerated  Sun Mar 23 21:34:13 CET 2014
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
     * This class corresponds to the database table persona_competenza
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 18 22:26:00 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}