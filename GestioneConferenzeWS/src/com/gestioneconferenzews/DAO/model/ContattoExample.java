package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContattoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public ContattoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
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

		public Criteria andCdContattoIsNull() {
			addCriterion("cd_contatto is null");
			return (Criteria) this;
		}

		public Criteria andCdContattoIsNotNull() {
			addCriterion("cd_contatto is not null");
			return (Criteria) this;
		}

		public Criteria andCdContattoEqualTo(Integer value) {
			addCriterion("cd_contatto =", value, "cdContatto");
			return (Criteria) this;
		}

		public Criteria andCdContattoNotEqualTo(Integer value) {
			addCriterion("cd_contatto <>", value, "cdContatto");
			return (Criteria) this;
		}

		public Criteria andCdContattoGreaterThan(Integer value) {
			addCriterion("cd_contatto >", value, "cdContatto");
			return (Criteria) this;
		}

		public Criteria andCdContattoGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_contatto >=", value, "cdContatto");
			return (Criteria) this;
		}

		public Criteria andCdContattoLessThan(Integer value) {
			addCriterion("cd_contatto <", value, "cdContatto");
			return (Criteria) this;
		}

		public Criteria andCdContattoLessThanOrEqualTo(Integer value) {
			addCriterion("cd_contatto <=", value, "cdContatto");
			return (Criteria) this;
		}

		public Criteria andCdContattoIn(List<Integer> values) {
			addCriterion("cd_contatto in", values, "cdContatto");
			return (Criteria) this;
		}

		public Criteria andCdContattoNotIn(List<Integer> values) {
			addCriterion("cd_contatto not in", values, "cdContatto");
			return (Criteria) this;
		}

		public Criteria andCdContattoBetween(Integer value1, Integer value2) {
			addCriterion("cd_contatto between", value1, value2, "cdContatto");
			return (Criteria) this;
		}

		public Criteria andCdContattoNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_contatto not between", value1, value2,
					"cdContatto");
			return (Criteria) this;
		}

		public Criteria andTipoIsNull() {
			addCriterion("tipo is null");
			return (Criteria) this;
		}

		public Criteria andTipoIsNotNull() {
			addCriterion("tipo is not null");
			return (Criteria) this;
		}

		public Criteria andTipoEqualTo(String value) {
			addCriterion("tipo =", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoNotEqualTo(String value) {
			addCriterion("tipo <>", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoGreaterThan(String value) {
			addCriterion("tipo >", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoGreaterThanOrEqualTo(String value) {
			addCriterion("tipo >=", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoLessThan(String value) {
			addCriterion("tipo <", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoLessThanOrEqualTo(String value) {
			addCriterion("tipo <=", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoLike(String value) {
			addCriterion("tipo like", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoNotLike(String value) {
			addCriterion("tipo not like", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoIn(List<String> values) {
			addCriterion("tipo in", values, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoNotIn(List<String> values) {
			addCriterion("tipo not in", values, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoBetween(String value1, String value2) {
			addCriterion("tipo between", value1, value2, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoNotBetween(String value1, String value2) {
			addCriterion("tipo not between", value1, value2, "tipo");
			return (Criteria) this;
		}

		public Criteria andContattoIsNull() {
			addCriterion("contatto is null");
			return (Criteria) this;
		}

		public Criteria andContattoIsNotNull() {
			addCriterion("contatto is not null");
			return (Criteria) this;
		}

		public Criteria andContattoEqualTo(String value) {
			addCriterion("contatto =", value, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoNotEqualTo(String value) {
			addCriterion("contatto <>", value, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoGreaterThan(String value) {
			addCriterion("contatto >", value, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoGreaterThanOrEqualTo(String value) {
			addCriterion("contatto >=", value, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoLessThan(String value) {
			addCriterion("contatto <", value, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoLessThanOrEqualTo(String value) {
			addCriterion("contatto <=", value, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoLike(String value) {
			addCriterion("contatto like", value, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoNotLike(String value) {
			addCriterion("contatto not like", value, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoIn(List<String> values) {
			addCriterion("contatto in", values, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoNotIn(List<String> values) {
			addCriterion("contatto not in", values, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoBetween(String value1, String value2) {
			addCriterion("contatto between", value1, value2, "contatto");
			return (Criteria) this;
		}

		public Criteria andContattoNotBetween(String value1, String value2) {
			addCriterion("contatto not between", value1, value2, "contatto");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table contatto
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
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
     * This class corresponds to the database table contatto
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 12 22:32:36 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}