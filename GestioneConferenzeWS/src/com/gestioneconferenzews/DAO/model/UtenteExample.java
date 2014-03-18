package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UtenteExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public UtenteExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table utente
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

		public Criteria andCdUsernameIsNull() {
			addCriterion("cd_username is null");
			return (Criteria) this;
		}

		public Criteria andCdUsernameIsNotNull() {
			addCriterion("cd_username is not null");
			return (Criteria) this;
		}

		public Criteria andCdUsernameEqualTo(Integer value) {
			addCriterion("cd_username =", value, "cdUsername");
			return (Criteria) this;
		}

		public Criteria andCdUsernameNotEqualTo(Integer value) {
			addCriterion("cd_username <>", value, "cdUsername");
			return (Criteria) this;
		}

		public Criteria andCdUsernameGreaterThan(Integer value) {
			addCriterion("cd_username >", value, "cdUsername");
			return (Criteria) this;
		}

		public Criteria andCdUsernameGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_username >=", value, "cdUsername");
			return (Criteria) this;
		}

		public Criteria andCdUsernameLessThan(Integer value) {
			addCriterion("cd_username <", value, "cdUsername");
			return (Criteria) this;
		}

		public Criteria andCdUsernameLessThanOrEqualTo(Integer value) {
			addCriterion("cd_username <=", value, "cdUsername");
			return (Criteria) this;
		}

		public Criteria andCdUsernameIn(List<Integer> values) {
			addCriterion("cd_username in", values, "cdUsername");
			return (Criteria) this;
		}

		public Criteria andCdUsernameNotIn(List<Integer> values) {
			addCriterion("cd_username not in", values, "cdUsername");
			return (Criteria) this;
		}

		public Criteria andCdUsernameBetween(Integer value1, Integer value2) {
			addCriterion("cd_username between", value1, value2, "cdUsername");
			return (Criteria) this;
		}

		public Criteria andCdUsernameNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_username not between", value1, value2,
					"cdUsername");
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

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
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

		public Criteria andDataVerificaIsNull() {
			addCriterion("data_verifica is null");
			return (Criteria) this;
		}

		public Criteria andDataVerificaIsNotNull() {
			addCriterion("data_verifica is not null");
			return (Criteria) this;
		}

		public Criteria andDataVerificaEqualTo(Date value) {
			addCriterion("data_verifica =", value, "dataVerifica");
			return (Criteria) this;
		}

		public Criteria andDataVerificaNotEqualTo(Date value) {
			addCriterion("data_verifica <>", value, "dataVerifica");
			return (Criteria) this;
		}

		public Criteria andDataVerificaGreaterThan(Date value) {
			addCriterion("data_verifica >", value, "dataVerifica");
			return (Criteria) this;
		}

		public Criteria andDataVerificaGreaterThanOrEqualTo(Date value) {
			addCriterion("data_verifica >=", value, "dataVerifica");
			return (Criteria) this;
		}

		public Criteria andDataVerificaLessThan(Date value) {
			addCriterion("data_verifica <", value, "dataVerifica");
			return (Criteria) this;
		}

		public Criteria andDataVerificaLessThanOrEqualTo(Date value) {
			addCriterion("data_verifica <=", value, "dataVerifica");
			return (Criteria) this;
		}

		public Criteria andDataVerificaIn(List<Date> values) {
			addCriterion("data_verifica in", values, "dataVerifica");
			return (Criteria) this;
		}

		public Criteria andDataVerificaNotIn(List<Date> values) {
			addCriterion("data_verifica not in", values, "dataVerifica");
			return (Criteria) this;
		}

		public Criteria andDataVerificaBetween(Date value1, Date value2) {
			addCriterion("data_verifica between", value1, value2,
					"dataVerifica");
			return (Criteria) this;
		}

		public Criteria andDataVerificaNotBetween(Date value1, Date value2) {
			addCriterion("data_verifica not between", value1, value2,
					"dataVerifica");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table utente
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
     * This class corresponds to the database table utente
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 12 22:32:36 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}