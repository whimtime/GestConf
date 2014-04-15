package com.gestioneconferenzews.servizi;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.gestioneconferenzews.BR.GestionePagamenti;
import com.gestioneconferenzews.DAO.model.CodaFatturazione;
import com.gestioneconferenzews.DAO.model.Investimento;
import com.gestioneconferenzews.DAO.model.Pagamento;

@WebService
public class serviziopagamenti 
{
	
	public serviziopagamenti()
	{
		
	}
	
	@WebMethod
	public boolean effettuapagamento(Pagamento pagamento)
	{
		return new GestionePagamenti().effettuapagamento(pagamento);
	}
	
	@WebMethod
	public boolean stornapagamento(Pagamento pagamento)
	{
		return new GestionePagamenti().stornapagamento(pagamento);				
	}
	
	@WebMethod
	public boolean addinvestimento(Investimento investimento)
	{
		return new GestionePagamenti().addinvestimento(investimento);
	}
	
	@WebMethod
	public boolean stornainvestimento(Investimento investimento)
	{		
		return new GestionePagamenti().stornainvestimento(investimento);
	}
	
	@WebMethod
	public List<CodaFatturazione> getCodaDaElaborare()
	{
		return new GestionePagamenti().getCodaDaElaborare();
	}
	
	@WebMethod
	public boolean salvaCodaElaborata(int cd_coda)
	{
		return new GestionePagamenti().salvaCodaElaborata(cd_coda);
	}
}
