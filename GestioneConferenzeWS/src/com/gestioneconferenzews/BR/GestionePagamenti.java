package com.gestioneconferenzews.BR;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.gestioneconferenzews.DAO.gestoreConnessioni;
import com.gestioneconferenzews.DAO.mapper.CodaFatturazioneMapper;
import com.gestioneconferenzews.DAO.mapper.ConferenzaMapper;
import com.gestioneconferenzews.DAO.model.CodaFatturazione;
import com.gestioneconferenzews.DAO.model.CodaFatturazioneExample;
import com.gestioneconferenzews.DAO.model.Conferenza;
import com.gestioneconferenzews.DAO.model.Investimento;
import com.gestioneconferenzews.DAO.model.Pagamento;
import com.gestioneconferenzews.DAO.model.PersonaCompetenzaExample.Criteria;


public class GestionePagamenti 
{
	public GestionePagamenti()
	{
		
	}
	
	public boolean effettuapagamento(Pagamento pagamento)
	{
		this.aggiungiBudget(pagamento.getTotaleEuro());
		this.insertCodaElaborata(pagamento.getCdPagamento(), pagamento.getTotaleEuro(),pagamento.getCdPersona());
		//accodo il messaggio alla coda per la fase di fatturazione
		
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

	private boolean accodaMessaggio(String messaggio)
	{
		//accodo il messaggio su rabbit 
		
		return true;
	}
	
	public List<CodaFatturazione> getCodaDaElaborare()
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
			SqlSession session = gestoreConnessioni.getConnection(logger);
		    
		CodaFatturazioneMapper mapperCoda = session.getMapper(CodaFatturazioneMapper.class);
			
		List<CodaFatturazione> lista= mapperCoda.selectCodaElaborazione();
		
		return lista;															
		
		
		}catch(Exception er){ return null;}
	}
	
	public boolean salvaCodaElaborata(int cd_coda)
	{
		Logger logger= Logger.getLogger("com.foo");
		try
		{
			SqlSession session = gestoreConnessioni.getConnection(logger);
		    
			CodaFatturazioneMapper mapperCoda = session.getMapper(CodaFatturazioneMapper.class);
				
			CodaFatturazione record= mapperCoda.selectByPrimaryKey(cd_coda);
			
			record.setDataElaborazione(new Date());
			
			int tot = mapperCoda.updateByPrimaryKey(record);
			session.commit();
			if(tot>0)
			{
				return true;
			}else{
				return false;
			}
		}catch(Exception er)
		{
			return false;
		}
	}

	private boolean insertCodaElaborata(int cd_pagamento, int totale, int cd_persona)
	{
		return true;
	}
}