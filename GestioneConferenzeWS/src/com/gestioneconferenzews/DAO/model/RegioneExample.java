package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.List;

public class RegioneExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	public RegioneExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
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

		public Criteria andCodiceIstatRegioneIsNull() {
			addCriterion("CODICE_ISTAT_REGIONE is null");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneIsNotNull() {
			addCriterion("CODICE_ISTAT_REGIONE is not null");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneEqualTo(String value) {
			addCriterion("CODICE_ISTAT_REGIONE =", value, "codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneNotEqualTo(String value) {
			addCriterion("CODICE_ISTAT_REGIONE <>", value, "codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneGreaterThan(String value) {
			addCriterion("CODICE_ISTAT_REGIONE >", value, "codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneGreaterThanOrEqualTo(String value) {
			addCriterion("CODICE_ISTAT_REGIONE >=", value, "codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneLessThan(String value) {
			addCriterion("CODICE_ISTAT_REGIONE <", value, "codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneLessThanOrEqualTo(String value) {
			addCriterion("CODICE_ISTAT_REGIONE <=", value, "codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneLike(String value) {
			addCriterion("CODICE_ISTAT_REGIONE like", value,
					"codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneNotLike(String value) {
			addCriterion("CODICE_ISTAT_REGIONE not like", value,
					"codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneIn(List<String> values) {
			addCriterion("CODICE_ISTAT_REGIONE in", values,
					"codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneNotIn(List<String> values) {
			addCriterion("CODICE_ISTAT_REGIONE not in", values,
					"codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneBetween(String value1,
				String value2) {
			addCriterion("CODICE_ISTAT_REGIONE between", value1, value2,
					"codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andCodiceIstatRegioneNotBetween(String value1,
				String value2) {
			addCriterion("CODICE_ISTAT_REGIONE not between", value1, value2,
					"codiceIstatRegione");
			return (Criteria) this;
		}

		public Criteria andRegioneIsNull() {
			addCriterion("REGIONE is null");
			return (Criteria) this;
		}

		public Criteria andRegioneIsNotNull() {
			addCriterion("REGIONE is not null");
			return (Criteria) this;
		}

		public Criteria andRegioneEqualTo(String value) {
			addCriterion("REGIONE =", value, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneNotEqualTo(String value) {
			addCriterion("REGIONE <>", value, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneGreaterThan(String value) {
			addCriterion("REGIONE >", value, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneGreaterThanOrEqualTo(String value) {
			addCriterion("REGIONE >=", value, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneLessThan(String value) {
			addCriterion("REGIONE <", value, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneLessThanOrEqualTo(String value) {
			addCriterion("REGIONE <=", value, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneLike(String value) {
			addCriterion("REGIONE like", value, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneNotLike(String value) {
			addCriterion("REGIONE not like", value, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneIn(List<String> values) {
			addCriterion("REGIONE in", values, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneNotIn(List<String> values) {
			addCriterion("REGIONE not in", values, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneBetween(String value1, String value2) {
			addCriterion("REGIONE between", value1, value2, "regione");
			return (Criteria) this;
		}

		public Criteria andRegioneNotBetween(String value1, String value2) {
			addCriterion("REGIONE not between", value1, value2, "regione");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table regione
	 * @mbggenerated  Wed Apr 02 22:57:41 CEST 2014
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
     * This class corresponds to the database table regione
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 11 12:24:47 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}