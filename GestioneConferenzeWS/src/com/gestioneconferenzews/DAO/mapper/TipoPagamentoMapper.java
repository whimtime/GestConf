package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.TipoPagamento;
import com.gestioneconferenzews.DAO.model.TipoPagamentoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipoPagamentoMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int countByExample(TipoPagamentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int deleteByExample(TipoPagamentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int deleteByPrimaryKey(Integer cdTipoPagamento);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int insert(TipoPagamento record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int insertSelective(TipoPagamento record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	List<TipoPagamento> selectByExample(TipoPagamentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	TipoPagamento selectByPrimaryKey(Integer cdTipoPagamento);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByExampleSelective(@Param("record") TipoPagamento record,
			@Param("example") TipoPagamentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByExample(@Param("record") TipoPagamento record,
			@Param("example") TipoPagamentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByPrimaryKeySelective(TipoPagamento record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tipo_pagamento
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByPrimaryKey(TipoPagamento record);

	List<TipoPagamento> selectTipoPagamentiTutti();
}