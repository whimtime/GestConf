package com.gestioneconferenzews.BR;

import com.gestioneconferenzews.DAO.model.Investimento;
import com.gestioneconferenzews.DAO.model.Pagamento;

public class GestionePagamenti 
{
	public GestionePagamenti()
	{
		
	}
	
	public boolean effettuapagamento(Pagamento pagamento)
	{
		this.aggiungiBudget(pagamento.getTotaleEuro());
		return true;
	}
	
	public boolean stornapagamento(Pagamento pagamento)
	{
		this.stornaBudget(pagamento.getTotaleEuro());
		return true;
	}
	
	public boolean addinvestimento(Investimento investimento)
	{
		this.aggiungiBudget(investimento.getTotaleInvestimento());
		return true;
	}
	
	public boolean stornainvestimento(Investimento investimento)
	{
		this.stornaBudget(investimento.getTotaleInvestimento());
		return true;
	}
	
	private boolean aggiungiBudget(int quantita)
	{
		return true;
	}
	
	private boolean stornaBudget(int quantita)
	{
		return true;
	}
}
