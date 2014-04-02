package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.List;

public class StrutturaConvenzionataExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public StrutturaConvenzionataExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
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

		public Criteria andCdStrutturaConvenzionataIsNull() {
			addCriterion("cd_struttura_convenzionata is null");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataIsNotNull() {
			addCriterion("cd_struttura_convenzionata is not null");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataEqualTo(Integer value) {
			addCriterion("cd_struttura_convenzionata =", value,
					"cdStrutturaConvenzionata");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataNotEqualTo(Integer value) {
			addCriterion("cd_struttura_convenzionata <>", value,
					"cdStrutturaConvenzionata");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataGreaterThan(Integer value) {
			addCriterion("cd_struttura_convenzionata >", value,
					"cdStrutturaConvenzionata");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("cd_struttura_convenzionata >=", value,
					"cdStrutturaConvenzionata");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataLessThan(Integer value) {
			addCriterion("cd_struttura_convenzionata <", value,
					"cdStrutturaConvenzionata");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataLessThanOrEqualTo(
				Integer value) {
			addCriterion("cd_struttura_convenzionata <=", value,
					"cdStrutturaConvenzionata");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataIn(List<Integer> values) {
			addCriterion("cd_struttura_convenzionata in", values,
					"cdStrutturaConvenzionata");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataNotIn(List<Integer> values) {
			addCriterion("cd_struttura_convenzionata not in", values,
					"cdStrutturaConvenzionata");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataBetween(Integer value1,
				Integer value2) {
			addCriterion("cd_struttura_convenzionata between", value1, value2,
					"cdStrutturaConvenzionata");
			return (Criteria) this;
		}

		public Criteria andCdStrutturaConvenzionataNotBetween(Integer value1,
				Integer value2) {
			addCriterion("cd_struttura_convenzionata not between", value1,
					value2, "cdStrutturaConvenzionata");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaIsNull() {
			addCriterion("tipo_struttura is null");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaIsNotNull() {
			addCriterion("tipo_struttura is not null");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaEqualTo(Integer value) {
			addCriterion("tipo_struttura =", value, "tipoStruttura");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaNotEqualTo(Integer value) {
			addCriterion("tipo_struttura <>", value, "tipoStruttura");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaGreaterThan(Integer value) {
			addCriterion("tipo_struttura >", value, "tipoStruttura");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaGreaterThanOrEqualTo(Integer value) {
			addCriterion("tipo_struttura >=", value, "tipoStruttura");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaLessThan(Integer value) {
			addCriterion("tipo_struttura <", value, "tipoStruttura");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaLessThanOrEqualTo(Integer value) {
			addCriterion("tipo_struttura <=", value, "tipoStruttura");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaIn(List<Integer> values) {
			addCriterion("tipo_struttura in", values, "tipoStruttura");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaNotIn(List<Integer> values) {
			addCriterion("tipo_struttura not in", values, "tipoStruttura");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaBetween(Integer value1, Integer value2) {
			addCriterion("tipo_struttura between", value1, value2,
					"tipoStruttura");
			return (Criteria) this;
		}

		public Criteria andTipoStrutturaNotBetween(Integer value1,
				Integer value2) {
			addCriterion("tipo_struttura not between", value1, value2,
					"tipoStruttura");
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

		public Criteria andComuneIsNull() {
			addCriterion("comune is null");
			return (Criteria) this;
		}

		public Criteria andComuneIsNotNull() {
			addCriterion("comune is not null");
			return (Criteria) this;
		}

		public Criteria andComuneEqualTo(String value) {
			addCriterion("comune =", value, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneNotEqualTo(String value) {
			addCriterion("comune <>", value, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneGreaterThan(String value) {
			addCriterion("comune >", value, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneGreaterThanOrEqualTo(String value) {
			addCriterion("comune >=", value, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneLessThan(String value) {
			addCriterion("comune <", value, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneLessThanOrEqualTo(String value) {
			addCriterion("comune <=", value, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneLike(String value) {
			addCriterion("comune like", value, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneNotLike(String value) {
			addCriterion("comune not like", value, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneIn(List<String> values) {
			addCriterion("comune in", values, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneNotIn(List<String> values) {
			addCriterion("comune not in", values, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneBetween(String value1, String value2) {
			addCriterion("comune between", value1, value2, "comune");
			return (Criteria) this;
		}

		public Criteria andComuneNotBetween(String value1, String value2) {
			addCriterion("comune not between", value1, value2, "comune");
			return (Criteria) this;
		}

		public Criteria andDescrizioneIsNull() {
			addCriterion("descrizione is null");
			return (Criteria) this;
		}

		public Criteria andDescrizioneIsNotNull() {
			addCriterion("descrizione is not null");
			return (Criteria) this;
		}

		public Criteria andDescrizioneEqualTo(String value) {
			addCriterion("descrizione =", value, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneNotEqualTo(String value) {
			addCriterion("descrizione <>", value, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneGreaterThan(String value) {
			addCriterion("descrizione >", value, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneGreaterThanOrEqualTo(String value) {
			addCriterion("descrizione >=", value, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneLessThan(String value) {
			addCriterion("descrizione <", value, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneLessThanOrEqualTo(String value) {
			addCriterion("descrizione <=", value, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneLike(String value) {
			addCriterion("descrizione like", value, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneNotLike(String value) {
			addCriterion("descrizione not like", value, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneIn(List<String> values) {
			addCriterion("descrizione in", values, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneNotIn(List<String> values) {
			addCriterion("descrizione not in", values, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneBetween(String value1, String value2) {
			addCriterion("descrizione between", value1, value2, "descrizione");
			return (Criteria) this;
		}

		public Criteria andDescrizioneNotBetween(String value1, String value2) {
			addCriterion("descrizione not between", value1, value2,
					"descrizione");
			return (Criteria) this;
		}

		public Criteria andUrlServizioIsNull() {
			addCriterion("url_servizio is null");
			return (Criteria) this;
		}

		public Criteria andUrlServizioIsNotNull() {
			addCriterion("url_servizio is not null");
			return (Criteria) this;
		}

		public Criteria andUrlServizioEqualTo(String value) {
			addCriterion("url_servizio =", value, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioNotEqualTo(String value) {
			addCriterion("url_servizio <>", value, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioGreaterThan(String value) {
			addCriterion("url_servizio >", value, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioGreaterThanOrEqualTo(String value) {
			addCriterion("url_servizio >=", value, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioLessThan(String value) {
			addCriterion("url_servizio <", value, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioLessThanOrEqualTo(String value) {
			addCriterion("url_servizio <=", value, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioLike(String value) {
			addCriterion("url_servizio like", value, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioNotLike(String value) {
			addCriterion("url_servizio not like", value, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioIn(List<String> values) {
			addCriterion("url_servizio in", values, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioNotIn(List<String> values) {
			addCriterion("url_servizio not in", values, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioBetween(String value1, String value2) {
			addCriterion("url_servizio between", value1, value2, "urlServizio");
			return (Criteria) this;
		}

		public Criteria andUrlServizioNotBetween(String value1, String value2) {
			addCriterion("url_servizio not between", value1, value2,
					"urlServizio");
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

		public Criteria andTipoServizioIsNull() {
			addCriterion("tipo_servizio is null");
			return (Criteria) this;
		}

		public Criteria andTipoServizioIsNotNull() {
			addCriterion("tipo_servizio is not null");
			return (Criteria) this;
		}

		public Criteria andTipoServizioEqualTo(String value) {
			addCriterion("tipo_servizio =", value, "tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioNotEqualTo(String value) {
			addCriterion("tipo_servizio <>", value, "tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioGreaterThan(String value) {
			addCriterion("tipo_servizio >", value, "tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioGreaterThanOrEqualTo(String value) {
			addCriterion("tipo_servizio >=", value, "tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioLessThan(String value) {
			addCriterion("tipo_servizio <", value, "tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioLessThanOrEqualTo(String value) {
			addCriterion("tipo_servizio <=", value, "tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioLike(String value) {
			addCriterion("tipo_servizio like", value, "tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioNotLike(String value) {
			addCriterion("tipo_servizio not like", value, "tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioIn(List<String> values) {
			addCriterion("tipo_servizio in", values, "tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioNotIn(List<String> values) {
			addCriterion("tipo_servizio not in", values, "tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioBetween(String value1, String value2) {
			addCriterion("tipo_servizio between", value1, value2,
					"tipoServizio");
			return (Criteria) this;
		}

		public Criteria andTipoServizioNotBetween(String value1, String value2) {
			addCriterion("tipo_servizio not between", value1, value2,
					"tipoServizio");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneIsNull() {
			addCriterion("codice_convenzione is null");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneIsNotNull() {
			addCriterion("codice_convenzione is not null");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneEqualTo(String value) {
			addCriterion("codice_convenzione =", value, "codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneNotEqualTo(String value) {
			addCriterion("codice_convenzione <>", value, "codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneGreaterThan(String value) {
			addCriterion("codice_convenzione >", value, "codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneGreaterThanOrEqualTo(String value) {
			addCriterion("codice_convenzione >=", value, "codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneLessThan(String value) {
			addCriterion("codice_convenzione <", value, "codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneLessThanOrEqualTo(String value) {
			addCriterion("codice_convenzione <=", value, "codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneLike(String value) {
			addCriterion("codice_convenzione like", value, "codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneNotLike(String value) {
			addCriterion("codice_convenzione not like", value,
					"codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneIn(List<String> values) {
			addCriterion("codice_convenzione in", values, "codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneNotIn(List<String> values) {
			addCriterion("codice_convenzione not in", values,
					"codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneBetween(String value1, String value2) {
			addCriterion("codice_convenzione between", value1, value2,
					"codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCodiceConvenzioneNotBetween(String value1,
				String value2) {
			addCriterion("codice_convenzione not between", value1, value2,
					"codiceConvenzione");
			return (Criteria) this;
		}

		public Criteria andCoordinateIsNull() {
			addCriterion("coordinate is null");
			return (Criteria) this;
		}

		public Criteria andCoordinateIsNotNull() {
			addCriterion("coordinate is not null");
			return (Criteria) this;
		}

		public Criteria andCoordinateEqualTo(String value) {
			addCriterion("coordinate =", value, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateNotEqualTo(String value) {
			addCriterion("coordinate <>", value, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateGreaterThan(String value) {
			addCriterion("coordinate >", value, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
			addCriterion("coordinate >=", value, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateLessThan(String value) {
			addCriterion("coordinate <", value, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateLessThanOrEqualTo(String value) {
			addCriterion("coordinate <=", value, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateLike(String value) {
			addCriterion("coordinate like", value, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateNotLike(String value) {
			addCriterion("coordinate not like", value, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateIn(List<String> values) {
			addCriterion("coordinate in", values, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateNotIn(List<String> values) {
			addCriterion("coordinate not in", values, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateBetween(String value1, String value2) {
			addCriterion("coordinate between", value1, value2, "coordinate");
			return (Criteria) this;
		}

		public Criteria andCoordinateNotBetween(String value1, String value2) {
			addCriterion("coordinate not between", value1, value2, "coordinate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
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
     * This class corresponds to the database table struttura_convenzionata
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 26 22:22:41 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}