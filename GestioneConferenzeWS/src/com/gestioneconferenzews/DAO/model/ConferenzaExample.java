package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConferenzaExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public ConferenzaExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
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

		public Criteria andNomeIsNull() {
			addCriterion("nome is null");
			return (Criteria) this;
		}

		public Criteria andNomeIsNotNull() {
			addCriterion("nome is not null");
			return (Criteria) this;
		}

		public Criteria andNomeEqualTo(String value) {
			addCriterion("nome =", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeNotEqualTo(String value) {
			addCriterion("nome <>", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeGreaterThan(String value) {
			addCriterion("nome >", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeGreaterThanOrEqualTo(String value) {
			addCriterion("nome >=", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeLessThan(String value) {
			addCriterion("nome <", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeLessThanOrEqualTo(String value) {
			addCriterion("nome <=", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeLike(String value) {
			addCriterion("nome like", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeNotLike(String value) {
			addCriterion("nome not like", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeIn(List<String> values) {
			addCriterion("nome in", values, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeNotIn(List<String> values) {
			addCriterion("nome not in", values, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeBetween(String value1, String value2) {
			addCriterion("nome between", value1, value2, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeNotBetween(String value1, String value2) {
			addCriterion("nome not between", value1, value2, "nome");
			return (Criteria) this;
		}

		public Criteria andSottotitoloIsNull() {
			addCriterion("sottotitolo is null");
			return (Criteria) this;
		}

		public Criteria andSottotitoloIsNotNull() {
			addCriterion("sottotitolo is not null");
			return (Criteria) this;
		}

		public Criteria andSottotitoloEqualTo(String value) {
			addCriterion("sottotitolo =", value, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloNotEqualTo(String value) {
			addCriterion("sottotitolo <>", value, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloGreaterThan(String value) {
			addCriterion("sottotitolo >", value, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloGreaterThanOrEqualTo(String value) {
			addCriterion("sottotitolo >=", value, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloLessThan(String value) {
			addCriterion("sottotitolo <", value, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloLessThanOrEqualTo(String value) {
			addCriterion("sottotitolo <=", value, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloLike(String value) {
			addCriterion("sottotitolo like", value, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloNotLike(String value) {
			addCriterion("sottotitolo not like", value, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloIn(List<String> values) {
			addCriterion("sottotitolo in", values, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloNotIn(List<String> values) {
			addCriterion("sottotitolo not in", values, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloBetween(String value1, String value2) {
			addCriterion("sottotitolo between", value1, value2, "sottotitolo");
			return (Criteria) this;
		}

		public Criteria andSottotitoloNotBetween(String value1, String value2) {
			addCriterion("sottotitolo not between", value1, value2,
					"sottotitolo");
			return (Criteria) this;
		}

		public Criteria andDataInizioIsNull() {
			addCriterion("data_inizio is null");
			return (Criteria) this;
		}

		public Criteria andDataInizioIsNotNull() {
			addCriterion("data_inizio is not null");
			return (Criteria) this;
		}

		public Criteria andDataInizioEqualTo(Date value) {
			addCriterion("data_inizio =", value, "dataInizio");
			return (Criteria) this;
		}

		public Criteria andDataInizioNotEqualTo(Date value) {
			addCriterion("data_inizio <>", value, "dataInizio");
			return (Criteria) this;
		}

		public Criteria andDataInizioGreaterThan(Date value) {
			addCriterion("data_inizio >", value, "dataInizio");
			return (Criteria) this;
		}

		public Criteria andDataInizioGreaterThanOrEqualTo(Date value) {
			addCriterion("data_inizio >=", value, "dataInizio");
			return (Criteria) this;
		}

		public Criteria andDataInizioLessThan(Date value) {
			addCriterion("data_inizio <", value, "dataInizio");
			return (Criteria) this;
		}

		public Criteria andDataInizioLessThanOrEqualTo(Date value) {
			addCriterion("data_inizio <=", value, "dataInizio");
			return (Criteria) this;
		}

		public Criteria andDataInizioIn(List<Date> values) {
			addCriterion("data_inizio in", values, "dataInizio");
			return (Criteria) this;
		}

		public Criteria andDataInizioNotIn(List<Date> values) {
			addCriterion("data_inizio not in", values, "dataInizio");
			return (Criteria) this;
		}

		public Criteria andDataInizioBetween(Date value1, Date value2) {
			addCriterion("data_inizio between", value1, value2, "dataInizio");
			return (Criteria) this;
		}

		public Criteria andDataInizioNotBetween(Date value1, Date value2) {
			addCriterion("data_inizio not between", value1, value2,
					"dataInizio");
			return (Criteria) this;
		}

		public Criteria andDataFineIsNull() {
			addCriterion("data_fine is null");
			return (Criteria) this;
		}

		public Criteria andDataFineIsNotNull() {
			addCriterion("data_fine is not null");
			return (Criteria) this;
		}

		public Criteria andDataFineEqualTo(Date value) {
			addCriterion("data_fine =", value, "dataFine");
			return (Criteria) this;
		}

		public Criteria andDataFineNotEqualTo(Date value) {
			addCriterion("data_fine <>", value, "dataFine");
			return (Criteria) this;
		}

		public Criteria andDataFineGreaterThan(Date value) {
			addCriterion("data_fine >", value, "dataFine");
			return (Criteria) this;
		}

		public Criteria andDataFineGreaterThanOrEqualTo(Date value) {
			addCriterion("data_fine >=", value, "dataFine");
			return (Criteria) this;
		}

		public Criteria andDataFineLessThan(Date value) {
			addCriterion("data_fine <", value, "dataFine");
			return (Criteria) this;
		}

		public Criteria andDataFineLessThanOrEqualTo(Date value) {
			addCriterion("data_fine <=", value, "dataFine");
			return (Criteria) this;
		}

		public Criteria andDataFineIn(List<Date> values) {
			addCriterion("data_fine in", values, "dataFine");
			return (Criteria) this;
		}

		public Criteria andDataFineNotIn(List<Date> values) {
			addCriterion("data_fine not in", values, "dataFine");
			return (Criteria) this;
		}

		public Criteria andDataFineBetween(Date value1, Date value2) {
			addCriterion("data_fine between", value1, value2, "dataFine");
			return (Criteria) this;
		}

		public Criteria andDataFineNotBetween(Date value1, Date value2) {
			addCriterion("data_fine not between", value1, value2, "dataFine");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table conferenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
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
     * This class corresponds to the database table conferenza
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 19 16:29:51 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}