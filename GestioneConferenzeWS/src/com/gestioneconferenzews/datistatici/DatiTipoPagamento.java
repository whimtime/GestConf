package com.gestioneconferenzews.datistatici;

import java.io.Serializable;
import java.util.List;

import com.gestioneconferenzews.DAO.model.TipoPagamento;

public class DatiTipoPagamento implements Serializable
{
	List<TipoPagamento> tipopag;

	public List<TipoPagamento> getTipopag() {
		return tipopag;
	}

	public void setTipopag(List<TipoPagamento> tipopag) {
		this.tipopag = tipopag;
	}
	
}
