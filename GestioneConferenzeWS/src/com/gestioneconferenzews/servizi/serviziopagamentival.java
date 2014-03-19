package com.gestioneconferenzews.servizi;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;





import com.gestioneconferenzews.datistatici.DatiTipoPagamento;
import com.gestioneconferenzews.datistatici.TipoPagamentoVal;

@WebService
public class serviziopagamentival 
{
	@WebMethod
	public DatiTipoPagamento gettipipagamento()
	{
		
		return new TipoPagamentoVal().getDati();
	}

}
