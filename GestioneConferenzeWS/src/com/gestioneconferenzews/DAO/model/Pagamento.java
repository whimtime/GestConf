package com.gestioneconferenzews.DAO.model;

import java.util.Date;

public class Pagamento {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pagamento.cd_pagamento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	private Integer cdPagamento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pagamento.data_pagamento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	private Date dataPagamento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pagamento.cd_metodo_pagamento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	private Integer cdMetodoPagamento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pagamento.cd_persona
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	private Integer cdPersona;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pagamento.cd_conferenza
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	private Integer cdConferenza;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pagamento.totale_euro
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	private Integer totaleEuro;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pagamento.tipo_movimento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	private String tipoMovimento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pagamento.tipologia
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	private Integer tipologia;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pagamento.cd_pagamento
	 * @return  the value of pagamento.cd_pagamento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public Integer getCdPagamento() {
		return cdPagamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pagamento.cd_pagamento
	 * @param cdPagamento  the value for pagamento.cd_pagamento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public void setCdPagamento(Integer cdPagamento) {
		this.cdPagamento = cdPagamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pagamento.data_pagamento
	 * @return  the value of pagamento.data_pagamento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public Date getDataPagamento() {
		return dataPagamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pagamento.data_pagamento
	 * @param dataPagamento  the value for pagamento.data_pagamento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pagamento.cd_metodo_pagamento
	 * @return  the value of pagamento.cd_metodo_pagamento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public Integer getCdMetodoPagamento() {
		return cdMetodoPagamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pagamento.cd_metodo_pagamento
	 * @param cdMetodoPagamento  the value for pagamento.cd_metodo_pagamento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public void setCdMetodoPagamento(Integer cdMetodoPagamento) {
		this.cdMetodoPagamento = cdMetodoPagamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pagamento.cd_persona
	 * @return  the value of pagamento.cd_persona
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public Integer getCdPersona() {
		return cdPersona;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pagamento.cd_persona
	 * @param cdPersona  the value for pagamento.cd_persona
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public void setCdPersona(Integer cdPersona) {
		this.cdPersona = cdPersona;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pagamento.cd_conferenza
	 * @return  the value of pagamento.cd_conferenza
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public Integer getCdConferenza() {
		return cdConferenza;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pagamento.cd_conferenza
	 * @param cdConferenza  the value for pagamento.cd_conferenza
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public void setCdConferenza(Integer cdConferenza) {
		this.cdConferenza = cdConferenza;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pagamento.totale_euro
	 * @return  the value of pagamento.totale_euro
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public Integer getTotaleEuro() {
		return totaleEuro;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pagamento.totale_euro
	 * @param totaleEuro  the value for pagamento.totale_euro
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public void setTotaleEuro(Integer totaleEuro) {
		this.totaleEuro = totaleEuro;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pagamento.tipo_movimento
	 * @return  the value of pagamento.tipo_movimento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public String getTipoMovimento() {
		return tipoMovimento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pagamento.tipo_movimento
	 * @param tipoMovimento  the value for pagamento.tipo_movimento
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pagamento.tipologia
	 * @return  the value of pagamento.tipologia
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public Integer getTipologia() {
		return tipologia;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pagamento.tipologia
	 * @param tipologia  the value for pagamento.tipologia
	 * @mbggenerated  Thu Apr 24 10:04:47 CEST 2014
	 */
	public void setTipologia(Integer tipologia) {
		this.tipologia = tipologia;
	}
}