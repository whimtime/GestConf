package com.gestioneconferenze.Bean;

import java.util.List;

import com.gestioneconferenze.facade.PagamentiFacade;
import com.gestioneconferenzews.servizi.Serviziopagamentival;
import com.gestioneconferenzews.servizi.TipoPagamento;

public class PagamentiBean 
{
	
	String preferred="";
	public String getPreferred() {
		return preferred;
	}

	public void setPreferred(String preferred) {
		this.preferred = preferred;
	}

	public TipoPagamento[]  getPagamenti() {
		return pagamenti;
	}

	public void setPagamenti(TipoPagamento[]  pagamenti) {
		this.pagamenti = pagamenti;
	}

	TipoPagamento[] pagamenti;
	
	public PagamentiBean() throws Exception
	{
		PagamentiFacade ws=new PagamentiFacade();
		pagamenti =    ws.getTipiPagamento();
		
	}
	
	
	

	
}
