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


/**La classe contiene le logiche per la gestione dei pagamenti 
 * @author PortatileTiz
 *
 */
public class GestionePagamenti 
{
	
	/**
	 * Costruttore della classe
	 */
	public GestionePagamenti()
	{
		
	}
	
	/**il metodo effettua un pagamento, aggiunge la fattura nella coda 
	 * @param pagamento
	 * @return boolean
	 */
	public boolean effettuapagamento(Pagamento pagamento)
	{
		this.aggiungiBudget(this.getRataReale(pagamento.getTotaleEuro()));
		this.insertCodaElaborata(pagamento.getCdPagamento(), pagamento.getTotaleEuro(),pagamento.getCdPersona());
		//accodo il messaggio alla coda per la fase di fatturazione	
		return true;
	}
	
	private int getRataReale(int totale)
	{
		Date data_oggi = new Date();
		//retrieve della data conferenza
		
		Date data_conferenza = new Date();
		int numeroGiorni = (int)( (data_oggi.getTime() - data_conferenza.getTime()) / (1000 * 60 * 60 * 24));
		
		if(numeroGiorni>90) return ( totale / 100 )*30;
		if(numeroGiorni>=30 && numeroGiorni < 90) return ( totale / 100 )*10;
		return totale;
	}
	
	/**Il metodo permette di stornare un pagamento e relativo budget
	 * @param pagamento
	 * @return
	 */
	public boolean stornapagamento(Pagamento pagamento)
	{
		this.stornaBudget(pagamento.getTotaleEuro());
		return true;
	}
	
	
	/**Metodo per aggiungere il totale donato dall'investitore
	 * @param investimento
	 * @return
	 */
	public boolean addinvestimento(Investimento investimento)
	{
		this.aggiungiBudget(investimento.getTotaleInvestimento());
		return true;
	}
	
	/**Metodo per stornare un investimento
	 * @param investimento
	 * @return boolean
	 */
	public boolean stornainvestimento(Investimento investimento)
	{
		this.stornaBudget(investimento.getTotaleInvestimento());
		return true;
	}
	
	/**Il metodo aggiunge una totale euro al budget compessivo della conferenza
	 * @param quantita
	 * @return
	 */
	private boolean aggiungiBudget(int quantita)
	{
		return true;
	}
	
	
	/**Metodo per stornare una quantità euro
	 * @param quantita
	 * @return boolean
	 */
	private boolean stornaBudget(int quantita)
	{
		return true;
	}

		
	/**Metodo che restituisce la codsa di fatturazione da elaborare
	 * @return List<CodaFatturazione>
	 */
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
	
	
	/**Metodo utile ad aggiornare il record di coda in modo da marcarlo come "elabvorato"
	 * @param cd_coda
	 * @return
	 */
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

	/**Metodo utile ad unserire un nuovo record in coda di fatturazione 
	 * @param cd_pagamento
	 * @param totale
	 * @param cd_persona
	 * @return  boolean
	 */
	private boolean insertCodaElaborata(int cd_pagamento, int totale, int cd_persona)
	{
		return true;
	}

}