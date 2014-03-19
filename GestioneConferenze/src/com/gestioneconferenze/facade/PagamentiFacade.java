package com.gestioneconferenze.facade;

import com.gestioneconferenzews.servizi.Serviziopagamentival;
import com.gestioneconferenzews.servizi.ServiziopagamentivalProxy;
import com.gestioneconferenzews.servizi.TipoPagamento;

public class PagamentiFacade 
{
	public TipoPagamento[] getTipiPagamento() throws Exception
	{
		ServiziopagamentivalProxy ws = new ServiziopagamentivalProxy(GestoreRemoto.getIndirizzo(this));
		return ws.gettipipagamento();
	}
}
