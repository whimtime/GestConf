package com.gestioneconferenzews.DAO.model;

public class TipoPagamento {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tipo_pagamento.cd_tipo_pagamento
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	private Integer cdTipoPagamento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tipo_pagamento.tipo_pagamento
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	private String tipoPagamento;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tipo_pagamento.cd_tipo_pagamento
	 * @return  the value of tipo_pagamento.cd_tipo_pagamento
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	public Integer getCdTipoPagamento() {
		return cdTipoPagamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tipo_pagamento.cd_tipo_pagamento
	 * @param cdTipoPagamento  the value for tipo_pagamento.cd_tipo_pagamento
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	public void setCdTipoPagamento(Integer cdTipoPagamento) {
		this.cdTipoPagamento = cdTipoPagamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tipo_pagamento.tipo_pagamento
	 * @return  the value of tipo_pagamento.tipo_pagamento
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	public String getTipoPagamento() {
		return tipoPagamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tipo_pagamento.tipo_pagamento
	 * @param tipoPagamento  the value for tipo_pagamento.tipo_pagamento
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}