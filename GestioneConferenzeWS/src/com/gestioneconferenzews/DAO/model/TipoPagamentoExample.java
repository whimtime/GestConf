package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.List;

public class TipoPagamentoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public TipoPagamentoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tipo_pagamento
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

		public Criteria andCdTipoPagamentoIsNull() {
			addCriterion("cd_tipo_pagamento is null");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoIsNotNull() {
			addCriterion("cd_tipo_pagamento is not null");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoEqualTo(Integer value) {
			addCriterion("cd_tipo_pagamento =", value, "cdTipoPagamento");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoNotEqualTo(Integer value) {
			addCriterion("cd_tipo_pagamento <>", value, "cdTipoPagamento");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoGreaterThan(Integer value) {
			addCriterion("cd_tipo_pagamento >", value, "cdTipoPagamento");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_tipo_pagamento >=", value, "cdTipoPagamento");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoLessThan(Integer value) {
			addCriterion("cd_tipo_pagamento <", value, "cdTipoPagamento");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoLessThanOrEqualTo(Integer value) {
			addCriterion("cd_tipo_pagamento <=", value, "cdTipoPagamento");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoIn(List<Integer> values) {
			addCriterion("cd_tipo_pagamento in", values, "cdTipoPagamento");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoNotIn(List<Integer> values) {
			addCriterion("cd_tipo_pagamento not in", values, "cdTipoPagamento");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoBetween(Integer value1, Integer value2) {
			addCriterion("cd_tipo_pagamento between", value1, value2,
					"cdTipoPagamento");
			return (Criteria) this;
		}

		public Criteria andCdTipoPagamentoNotBetween(Integer value1,
				Integer value2) {
			addCriterion("cd_tipo_pagamento not between", value1, value2,
					"cdTipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoIsNull() {
			addCriterion("tipo_pagamento is null");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoIsNotNull() {
			addCriterion("tipo_pagamento is not null");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoEqualTo(String value) {
			addCriterion("tipo_pagamento =", value, "tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoNotEqualTo(String value) {
			addCriterion("tipo_pagamento <>", value, "tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoGreaterThan(String value) {
			addCriterion("tipo_pagamento >", value, "tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoGreaterThanOrEqualTo(String value) {
			addCriterion("tipo_pagamento >=", value, "tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoLessThan(String value) {
			addCriterion("tipo_pagamento <", value, "tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoLessThanOrEqualTo(String value) {
			addCriterion("tipo_pagamento <=", value, "tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoLike(String value) {
			addCriterion("tipo_pagamento like", value, "tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoNotLike(String value) {
			addCriterion("tipo_pagamento not like", value, "tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoIn(List<String> values) {
			addCriterion("tipo_pagamento in", values, "tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoNotIn(List<String> values) {
			addCriterion("tipo_pagamento not in", values, "tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoBetween(String value1, String value2) {
			addCriterion("tipo_pagamento between", value1, value2,
					"tipoPagamento");
			return (Criteria) this;
		}

		public Criteria andTipoPagamentoNotBetween(String value1, String value2) {
			addCriterion("tipo_pagamento not between", value1, value2,
					"tipoPagamento");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tipo_pagamento
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
     * This class corresponds to the database table tipo_pagamento
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 19 11:05:52 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}