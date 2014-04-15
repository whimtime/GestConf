package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.List;

public class ComitatoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public ComitatoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comitato
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table comitato
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

		public Criteria andCdComitatoIsNull() {
			addCriterion("cd_comitato is null");
			return (Criteria) this;
		}

		public Criteria andCdComitatoIsNotNull() {
			addCriterion("cd_comitato is not null");
			return (Criteria) this;
		}

		public Criteria andCdComitatoEqualTo(Integer value) {
			addCriterion("cd_comitato =", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoNotEqualTo(Integer value) {
			addCriterion("cd_comitato <>", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoGreaterThan(Integer value) {
			addCriterion("cd_comitato >", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_comitato >=", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoLessThan(Integer value) {
			addCriterion("cd_comitato <", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoLessThanOrEqualTo(Integer value) {
			addCriterion("cd_comitato <=", value, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoIn(List<Integer> values) {
			addCriterion("cd_comitato in", values, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoNotIn(List<Integer> values) {
			addCriterion("cd_comitato not in", values, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoBetween(Integer value1, Integer value2) {
			addCriterion("cd_comitato between", value1, value2, "cdComitato");
			return (Criteria) this;
		}

		public Criteria andCdComitatoNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_comitato not between", value1, value2,
					"cdComitato");
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

		public Criteria andCdTipoIsNull() {
			addCriterion("cd_tipo is null");
			return (Criteria) this;
		}

		public Criteria andCdTipoIsNotNull() {
			addCriterion("cd_tipo is not null");
			return (Criteria) this;
		}

		public Criteria andCdTipoEqualTo(Integer value) {
			addCriterion("cd_tipo =", value, "cdTipo");
			return (Criteria) this;
		}

		public Criteria andCdTipoNotEqualTo(Integer value) {
			addCriterion("cd_tipo <>", value, "cdTipo");
			return (Criteria) this;
		}

		public Criteria andCdTipoGreaterThan(Integer value) {
			addCriterion("cd_tipo >", value, "cdTipo");
			return (Criteria) this;
		}

		public Criteria andCdTipoGreaterThanOrEqualTo(Integer value) {
			addCriterion("cd_tipo >=", value, "cdTipo");
			return (Criteria) this;
		}

		public Criteria andCdTipoLessThan(Integer value) {
			addCriterion("cd_tipo <", value, "cdTipo");
			return (Criteria) this;
		}

		public Criteria andCdTipoLessThanOrEqualTo(Integer value) {
			addCriterion("cd_tipo <=", value, "cdTipo");
			return (Criteria) this;
		}

		public Criteria andCdTipoIn(List<Integer> values) {
			addCriterion("cd_tipo in", values, "cdTipo");
			return (Criteria) this;
		}

		public Criteria andCdTipoNotIn(List<Integer> values) {
			addCriterion("cd_tipo not in", values, "cdTipo");
			return (Criteria) this;
		}

		public Criteria andCdTipoBetween(Integer value1, Integer value2) {
			addCriterion("cd_tipo between", value1, value2, "cdTipo");
			return (Criteria) this;
		}

		public Criteria andCdTipoNotBetween(Integer value1, Integer value2) {
			addCriterion("cd_tipo not between", value1, value2, "cdTipo");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table comitato
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
     * This class corresponds to the database table comitato
     *
     * @mbggenerated do_not_delete_during_merge Sun Mar 23 21:34:13 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}