package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonaExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public PersonaExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table persona
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

		public Criteria andCognomeIsNull() {
			addCriterion("cognome is null");
			return (Criteria) this;
		}

		public Criteria andCognomeIsNotNull() {
			addCriterion("cognome is not null");
			return (Criteria) this;
		}

		public Criteria andCognomeEqualTo(String value) {
			addCriterion("cognome =", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeNotEqualTo(String value) {
			addCriterion("cognome <>", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeGreaterThan(String value) {
			addCriterion("cognome >", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeGreaterThanOrEqualTo(String value) {
			addCriterion("cognome >=", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeLessThan(String value) {
			addCriterion("cognome <", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeLessThanOrEqualTo(String value) {
			addCriterion("cognome <=", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeLike(String value) {
			addCriterion("cognome like", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeNotLike(String value) {
			addCriterion("cognome not like", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeIn(List<String> values) {
			addCriterion("cognome in", values, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeNotIn(List<String> values) {
			addCriterion("cognome not in", values, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeBetween(String value1, String value2) {
			addCriterion("cognome between", value1, value2, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeNotBetween(String value1, String value2) {
			addCriterion("cognome not between", value1, value2, "cognome");
			return (Criteria) this;
		}

		public Criteria andDataNascitaIsNull() {
			addCriterion("data_nascita is null");
			return (Criteria) this;
		}

		public Criteria andDataNascitaIsNotNull() {
			addCriterion("data_nascita is not null");
			return (Criteria) this;
		}

		public Criteria andDataNascitaEqualTo(Date value) {
			addCriterion("data_nascita =", value, "dataNascita");
			return (Criteria) this;
		}

		public Criteria andDataNascitaNotEqualTo(Date value) {
			addCriterion("data_nascita <>", value, "dataNascita");
			return (Criteria) this;
		}

		public Criteria andDataNascitaGreaterThan(Date value) {
			addCriterion("data_nascita >", value, "dataNascita");
			return (Criteria) this;
		}

		public Criteria andDataNascitaGreaterThanOrEqualTo(Date value) {
			addCriterion("data_nascita >=", value, "dataNascita");
			return (Criteria) this;
		}

		public Criteria andDataNascitaLessThan(Date value) {
			addCriterion("data_nascita <", value, "dataNascita");
			return (Criteria) this;
		}

		public Criteria andDataNascitaLessThanOrEqualTo(Date value) {
			addCriterion("data_nascita <=", value, "dataNascita");
			return (Criteria) this;
		}

		public Criteria andDataNascitaIn(List<Date> values) {
			addCriterion("data_nascita in", values, "dataNascita");
			return (Criteria) this;
		}

		public Criteria andDataNascitaNotIn(List<Date> values) {
			addCriterion("data_nascita not in", values, "dataNascita");
			return (Criteria) this;
		}

		public Criteria andDataNascitaBetween(Date value1, Date value2) {
			addCriterion("data_nascita between", value1, value2, "dataNascita");
			return (Criteria) this;
		}

		public Criteria andDataNascitaNotBetween(Date value1, Date value2) {
			addCriterion("data_nascita not between", value1, value2,
					"dataNascita");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleIsNull() {
			addCriterion("codice_fiscale is null");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleIsNotNull() {
			addCriterion("codice_fiscale is not null");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleEqualTo(String value) {
			addCriterion("codice_fiscale =", value, "codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleNotEqualTo(String value) {
			addCriterion("codice_fiscale <>", value, "codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleGreaterThan(String value) {
			addCriterion("codice_fiscale >", value, "codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleGreaterThanOrEqualTo(String value) {
			addCriterion("codice_fiscale >=", value, "codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleLessThan(String value) {
			addCriterion("codice_fiscale <", value, "codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleLessThanOrEqualTo(String value) {
			addCriterion("codice_fiscale <=", value, "codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleLike(String value) {
			addCriterion("codice_fiscale like", value, "codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleNotLike(String value) {
			addCriterion("codice_fiscale not like", value, "codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleIn(List<String> values) {
			addCriterion("codice_fiscale in", values, "codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleNotIn(List<String> values) {
			addCriterion("codice_fiscale not in", values, "codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleBetween(String value1, String value2) {
			addCriterion("codice_fiscale between", value1, value2,
					"codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andCodiceFiscaleNotBetween(String value1, String value2) {
			addCriterion("codice_fiscale not between", value1, value2,
					"codiceFiscale");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaIsNull() {
			addCriterion("partita_iva is null");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaIsNotNull() {
			addCriterion("partita_iva is not null");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaEqualTo(String value) {
			addCriterion("partita_iva =", value, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaNotEqualTo(String value) {
			addCriterion("partita_iva <>", value, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaGreaterThan(String value) {
			addCriterion("partita_iva >", value, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaGreaterThanOrEqualTo(String value) {
			addCriterion("partita_iva >=", value, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaLessThan(String value) {
			addCriterion("partita_iva <", value, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaLessThanOrEqualTo(String value) {
			addCriterion("partita_iva <=", value, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaLike(String value) {
			addCriterion("partita_iva like", value, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaNotLike(String value) {
			addCriterion("partita_iva not like", value, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaIn(List<String> values) {
			addCriterion("partita_iva in", values, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaNotIn(List<String> values) {
			addCriterion("partita_iva not in", values, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaBetween(String value1, String value2) {
			addCriterion("partita_iva between", value1, value2, "partitaIva");
			return (Criteria) this;
		}

		public Criteria andPartitaIvaNotBetween(String value1, String value2) {
			addCriterion("partita_iva not between", value1, value2,
					"partitaIva");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaIsNull() {
			addCriterion("cd_comune_istat_nascita is null");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaIsNotNull() {
			addCriterion("cd_comune_istat_nascita is not null");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaEqualTo(String value) {
			addCriterion("cd_comune_istat_nascita =", value,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaNotEqualTo(String value) {
			addCriterion("cd_comune_istat_nascita <>", value,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaGreaterThan(String value) {
			addCriterion("cd_comune_istat_nascita >", value,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaGreaterThanOrEqualTo(String value) {
			addCriterion("cd_comune_istat_nascita >=", value,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaLessThan(String value) {
			addCriterion("cd_comune_istat_nascita <", value,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaLessThanOrEqualTo(String value) {
			addCriterion("cd_comune_istat_nascita <=", value,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaLike(String value) {
			addCriterion("cd_comune_istat_nascita like", value,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaNotLike(String value) {
			addCriterion("cd_comune_istat_nascita not like", value,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaIn(List<String> values) {
			addCriterion("cd_comune_istat_nascita in", values,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaNotIn(List<String> values) {
			addCriterion("cd_comune_istat_nascita not in", values,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaBetween(String value1,
				String value2) {
			addCriterion("cd_comune_istat_nascita between", value1, value2,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andCdComuneIstatNascitaNotBetween(String value1,
				String value2) {
			addCriterion("cd_comune_istat_nascita not between", value1, value2,
					"cdComuneIstatNascita");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneIsNull() {
			addCriterion("data_creazione is null");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneIsNotNull() {
			addCriterion("data_creazione is not null");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneEqualTo(Date value) {
			addCriterion("data_creazione =", value, "dataCreazione");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneNotEqualTo(Date value) {
			addCriterion("data_creazione <>", value, "dataCreazione");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneGreaterThan(Date value) {
			addCriterion("data_creazione >", value, "dataCreazione");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneGreaterThanOrEqualTo(Date value) {
			addCriterion("data_creazione >=", value, "dataCreazione");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneLessThan(Date value) {
			addCriterion("data_creazione <", value, "dataCreazione");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneLessThanOrEqualTo(Date value) {
			addCriterion("data_creazione <=", value, "dataCreazione");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneIn(List<Date> values) {
			addCriterion("data_creazione in", values, "dataCreazione");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneNotIn(List<Date> values) {
			addCriterion("data_creazione not in", values, "dataCreazione");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneBetween(Date value1, Date value2) {
			addCriterion("data_creazione between", value1, value2,
					"dataCreazione");
			return (Criteria) this;
		}

		public Criteria andDataCreazioneNotBetween(Date value1, Date value2) {
			addCriterion("data_creazione not between", value1, value2,
					"dataCreazione");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table persona
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
     * This class corresponds to the database table persona
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 12 22:32:36 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}