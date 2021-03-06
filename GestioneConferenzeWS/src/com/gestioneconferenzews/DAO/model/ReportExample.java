package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.List;

public class ReportExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public ReportExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
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

		public Criteria andCdReportIsNull() {
			addCriterion("cd_report is null");
			return (Criteria) this;
		}

		public Criteria andCdReportIsNotNull() {
			addCriterion("cd_report is not null");
			return (Criteria) this;
		}

		public Criteria andCdReportEqualTo(Integer value) {
			addCriterion("cd_report =", value, "cdReport");
			return (Criteria) this;
		}

		public Criteria andCdReportNotEqualTo(Integer value) {
			addCriterion("cd_report <>", value, "cdReport");
			return (Criteria) this;
		}

		public Criteria andCdReportGreaterThan(Integer value) {
			addCriterion("cd_report >", value, "cdReport");
			return (Criteria) this;
		}

		public Criteria andCdReportGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_report >=", value, "cdReport");
			return (Criteria) this;
		}

		public Criteria andCdReportLessThan(Integer value) {
			addCriterion("cd_report <", value, "cdReport");
			return (Criteria) this;
		}

		public Criteria andCdReportLessThanOrEqualTo(Integer value) {
			addCriterion("cd_report <=", value, "cdReport");
			return (Criteria) this;
		}

		public Criteria andCdReportIn(List<Integer> values) {
			addCriterion("cd_report in", values, "cdReport");
			return (Criteria) this;
		}

		public Criteria andCdReportNotIn(List<Integer> values) {
			addCriterion("cd_report not in", values, "cdReport");
			return (Criteria) this;
		}

		public Criteria andCdReportBetween(Integer value1, Integer value2) {
			addCriterion("cd_report between", value1, value2, "cdReport");
			return (Criteria) this;
		}

		public Criteria andCdReportNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_report not between", value1, value2, "cdReport");
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

		public Criteria andNomefileIsNull() {
			addCriterion("nomefile is null");
			return (Criteria) this;
		}

		public Criteria andNomefileIsNotNull() {
			addCriterion("nomefile is not null");
			return (Criteria) this;
		}

		public Criteria andNomefileEqualTo(String value) {
			addCriterion("nomefile =", value, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileNotEqualTo(String value) {
			addCriterion("nomefile <>", value, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileGreaterThan(String value) {
			addCriterion("nomefile >", value, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileGreaterThanOrEqualTo(String value) {
			addCriterion("nomefile >=", value, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileLessThan(String value) {
			addCriterion("nomefile <", value, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileLessThanOrEqualTo(String value) {
			addCriterion("nomefile <=", value, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileLike(String value) {
			addCriterion("nomefile like", value, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileNotLike(String value) {
			addCriterion("nomefile not like", value, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileIn(List<String> values) {
			addCriterion("nomefile in", values, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileNotIn(List<String> values) {
			addCriterion("nomefile not in", values, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileBetween(String value1, String value2) {
			addCriterion("nomefile between", value1, value2, "nomefile");
			return (Criteria) this;
		}

		public Criteria andNomefileNotBetween(String value1, String value2) {
			addCriterion("nomefile not between", value1, value2, "nomefile");
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

		public Criteria andCdTipoReportIsNull() {
			addCriterion("cd_tipo_report is null");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportIsNotNull() {
			addCriterion("cd_tipo_report is not null");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportEqualTo(Integer value) {
			addCriterion("cd_tipo_report =", value, "cdTipoReport");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportNotEqualTo(Integer value) {
			addCriterion("cd_tipo_report <>", value, "cdTipoReport");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportGreaterThan(Integer value) {
			addCriterion("cd_tipo_report >", value, "cdTipoReport");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_tipo_report >=", value, "cdTipoReport");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportLessThan(Integer value) {
			addCriterion("cd_tipo_report <", value, "cdTipoReport");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportLessThanOrEqualTo(Integer value) {
			addCriterion("cd_tipo_report <=", value, "cdTipoReport");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportIn(List<Integer> values) {
			addCriterion("cd_tipo_report in", values, "cdTipoReport");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportNotIn(List<Integer> values) {
			addCriterion("cd_tipo_report not in", values, "cdTipoReport");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportBetween(Integer value1, Integer value2) {
			addCriterion("cd_tipo_report between", value1, value2,
					"cdTipoReport");
			return (Criteria) this;
		}

		public Criteria andCdTipoReportNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_tipo_report not between", value1, value2,
					"cdTipoReport");
			return (Criteria) this;
		}

		public Criteria andAccettatoIsNull() {
			addCriterion("accettato is null");
			return (Criteria) this;
		}

		public Criteria andAccettatoIsNotNull() {
			addCriterion("accettato is not null");
			return (Criteria) this;
		}

		public Criteria andAccettatoEqualTo(Integer value) {
			addCriterion("accettato =", value, "accettato");
			return (Criteria) this;
		}

		public Criteria andAccettatoNotEqualTo(Integer value) {
			addCriterion("accettato <>", value, "accettato");
			return (Criteria) this;
		}

		public Criteria andAccettatoGreaterThan(Integer value) {
			addCriterion("accettato >", value, "accettato");
			return (Criteria) this;
		}

		public Criteria andAccettatoGreaterThanOrEqualTo(Integer value) {
			addCriterion("accettato >=", value, "accettato");
			return (Criteria) this;
		}

		public Criteria andAccettatoLessThan(Integer value) {
			addCriterion("accettato <", value, "accettato");
			return (Criteria) this;
		}

		public Criteria andAccettatoLessThanOrEqualTo(Integer value) {
			addCriterion("accettato <=", value, "accettato");
			return (Criteria) this;
		}

		public Criteria andAccettatoIn(List<Integer> values) {
			addCriterion("accettato in", values, "accettato");
			return (Criteria) this;
		}

		public Criteria andAccettatoNotIn(List<Integer> values) {
			addCriterion("accettato not in", values, "accettato");
			return (Criteria) this;
		}

		public Criteria andAccettatoBetween(Integer value1, Integer value2) {
			addCriterion("accettato between", value1, value2, "accettato");
			return (Criteria) this;
		}

		public Criteria andAccettatoNotBetween(Integer value1, Integer value2) {
			addCriterion("accettato not between", value1, value2, "accettato");
			return (Criteria) this;
		}

		public Criteria andValutazioneIsNull() {
			addCriterion("valutazione is null");
			return (Criteria) this;
		}

		public Criteria andValutazioneIsNotNull() {
			addCriterion("valutazione is not null");
			return (Criteria) this;
		}

		public Criteria andValutazioneEqualTo(Integer value) {
			addCriterion("valutazione =", value, "valutazione");
			return (Criteria) this;
		}

		public Criteria andValutazioneNotEqualTo(Integer value) {
			addCriterion("valutazione <>", value, "valutazione");
			return (Criteria) this;
		}

		public Criteria andValutazioneGreaterThan(Integer value) {
			addCriterion("valutazione >", value, "valutazione");
			return (Criteria) this;
		}

		public Criteria andValutazioneGreaterThanOrEqualTo(Integer value) {
			addCriterion("valutazione >=", value, "valutazione");
			return (Criteria) this;
		}

		public Criteria andValutazioneLessThan(Integer value) {
			addCriterion("valutazione <", value, "valutazione");
			return (Criteria) this;
		}

		public Criteria andValutazioneLessThanOrEqualTo(Integer value) {
			addCriterion("valutazione <=", value, "valutazione");
			return (Criteria) this;
		}

		public Criteria andValutazioneIn(List<Integer> values) {
			addCriterion("valutazione in", values, "valutazione");
			return (Criteria) this;
		}

		public Criteria andValutazioneNotIn(List<Integer> values) {
			addCriterion("valutazione not in", values, "valutazione");
			return (Criteria) this;
		}

		public Criteria andValutazioneBetween(Integer value1, Integer value2) {
			addCriterion("valutazione between", value1, value2, "valutazione");
			return (Criteria) this;
		}

		public Criteria andValutazioneNotBetween(Integer value1, Integer value2) {
			addCriterion("valutazione not between", value1, value2,
					"valutazione");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table report
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
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
     * This class corresponds to the database table report
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 19 16:29:51 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}