package com.gestioneconferenze.Bean;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gestioneconferenze.facade.ConferenzeFacade;
import com.gestioneconferenze.facade.GestoreRemoto;
import com.gestioneconferenzews.servizi.*;
import com.gestioneconferenzews.servizi.Exception;

public class conferenzeElencoBean 
{
	/**
	 * 
	 */
	
	private ConferenzaBeanVisualizza[] conferenze;
	
	
	
	
	public ConferenzaBeanVisualizza[] getConferenze() {
		return conferenze;
	}




	public void setConferenze(ConferenzaBeanVisualizza[] conferenze) {
		this.conferenze = conferenze;
	}




	public conferenzeElencoBean() throws RemoteException 
	{				
		ConferenzeFacade ws= new ConferenzeFacade();
		Conferenza[] conftemp= ws.getconferenze();
		
		ArrayList<ConferenzaBeanVisualizza> elenco = new ArrayList<>();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		for(Conferenza c : conftemp)
		{
			ConferenzaBeanVisualizza b = new ConferenzaBeanVisualizza();
			
			b.setCdComuneIstat(c.getCdComuneIstat());
			b.setCdConferenza(c.getCdConferenza());
			b.setIndirizzo(c.getIndirizzo());
			b.setNome(c.getNome());
			b.setSottotitolo(c.getSottotitolo());
			b.setDataInizioString(df.format(c.getDataInizio().getTime()));
			b.setDataFineString(df.format(c.getDataFine().getTime()));
			b.setUrlmodifica("modificaconferenza.xhtml?cdConferenza=" + c.getCdConferenza().toString());
			
			elenco.add(b);
			
		}
		
		conferenze= new ConferenzaBeanVisualizza[elenco.size()];
		conferenze = elenco.toArray(conferenze);
		
		String s="";
	
		
	}



	
	
	
	
	
}
