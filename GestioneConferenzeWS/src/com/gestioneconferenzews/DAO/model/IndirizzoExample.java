package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndirizzoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public IndirizzoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table indirizzo
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

		public Criteria andCdIndirizzoIsNull() {
			addCriterion("cd_indirizzo is null");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoIsNotNull() {
			addCriterion("cd_indirizzo is not null");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoEqualTo(Integer value) {
			addCriterion("cd_indirizzo =", value, "cdIndirizzo");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoNotEqualTo(Integer value) {
			addCriterion("cd_indirizzo <>", value, "cdIndirizzo");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoGreaterThan(Integer value) {
			addCriterion("cd_indirizzo >", value, "cdIndirizzo");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_indirizzo >=", value, "cdIndirizzo");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoLessThan(Integer value) {
			addCriterion("cd_indirizzo <", value, "cdIndirizzo");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoLessThanOrEqualTo(Integer value) {
			addCriterion("cd_indirizzo <=", value, "cdIndirizzo");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoIn(List<Integer> values) {
			addCriterion("cd_indirizzo in", values, "cdIndirizzo");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoNotIn(List<Integer> values) {
			addCriterion("cd_indirizzo not in", values, "cdIndirizzo");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoBetween(Integer value1, Integer value2) {
			addCriterion("cd_indirizzo between", value1, value2, "cdIndirizzo");
			return (Criteria) this;
		}

		public Criteria andCdIndirizzoNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_indirizzo not between", value1, value2,
					"cdIndirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoIsNull() {
			addCriterion("indirizzo is null");
			return (Criteria) this;
		}

		public Criteria andIndirizzoIsNotNull() {
			addCriterion("indirizzo is not null");
			return (Criteria) this;
		}

		public Criteria andIndirizzoEqualTo(String value) {
			addCriterion("indirizzo =", value, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoNotEqualTo(String value) {
			addCriterion("indirizzo <>", value, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoGreaterThan(String value) {
			addCriterion("indirizzo >", value, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoGreaterThanOrEqualTo(String value) {
			addCriterion("indirizzo >=", value, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoLessThan(String value) {
			addCriterion("indirizzo <", value, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoLessThanOrEqualTo(String value) {
			addCriterion("indirizzo <=", value, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoLike(String value) {
			addCriterion("indirizzo like", value, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoNotLike(String value) {
			addCriterion("indirizzo not like", value, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoIn(List<String> values) {
			addCriterion("indirizzo in", values, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoNotIn(List<String> values) {
			addCriterion("indirizzo not in", values, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoBetween(String value1, String value2) {
			addCriterion("indirizzo between", value1, value2, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andIndirizzoNotBetween(String value1, String value2) {
			addCriterion("indirizzo not between", value1, value2, "indirizzo");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatIsNull() {
			addCriterion("cd_comune_istat is null");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatIsNotNull() {
			addCriterion("cd_comune_istat is not null");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatEqualTo(String value) {
			addCriterion("cd_comune_istat =", value, "cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNotEqualTo(String value) {
			addCriterion("cd_comune_istat <>", value, "cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatGreaterThan(String value) {
			addCriterion("cd_comune_istat >", value, "cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatGreaterThanOrEqualTo(String value) {
			addCriterion("cd_comune_istat >=", value, "cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatLessThan(String value) {
			addCriterion("cd_comune_istat <", value, "cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatLessThanOrEqualTo(String value) {
			addCriterion("cd_comune_istat <=", value, "cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatLike(String value) {
			addCriterion("cd_comune_istat like", value, "cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNotLike(String value) {
			addCriterion("cd_comune_istat not like", value, "cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatIn(List<String> values) {
			addCriterion("cd_comune_istat in", values, "cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNotIn(List<String> values) {
			addCriterion("cd_comune_istat not in", values, "cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatBetween(String value1, String value2) {
			addCriterion("cd_comune_istat between", value1, value2,
					"cdComuneIstat");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNotBetween(String value1, String value2) {
			addCriterion("cd_comune_istat not between", value1, value2,
					"cdComuneIstat");
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

		public Criteria andTipoIsNull() {
			addCriterion("tipo is null");
			return (Criteria) this;
		}

		public Criteria andTipoIsNotNull() {
			addCriterion("tipo is not null");
			return (Criteria) this;
		}

		public Criteria andTipoEqualTo(Integer value) {
			addCriterion("tipo =", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoNotEqualTo(Integer value) {
			addCriterion("tipo <>", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoGreaterThan(Integer value) {
			addCriterion("tipo >", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoGreaterThanOrEqualTo(Integer value) {
			addCriterion("tipo >=", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoLessThan(Integer value) {
			addCriterion("tipo <", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoLessThanOrEqualTo(Integer value) {
			addCriterion("tipo <=", value, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoIn(List<Integer> values) {
			addCriterion("tipo in", values, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoNotIn(List<Integer> values) {
			addCriterion("tipo not in", values, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoBetween(Integer value1, Integer value2) {
			addCriterion("tipo between", value1, value2, "tipo");
			return (Criteria) this;
		}

		public Criteria andTipoNotBetween(Integer value1, Integer value2) {
			addCriterion("tipo not between", value1, value2, "tipo");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table indirizzo
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
     * This class corresponds to the database table indirizzo
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 12 22:35:50 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}