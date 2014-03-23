package com.gestioneconferenze.Bean;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.gestioneconferenze.facade.ConferenzeFacade;
import com.gestioneconferenzews.servizi.Conferenza;
import com.gestioneconferenzews.servizi.ConferenzaBeanVisualizza;

public class conferenzeBeanModifica extends ConferenzaBeanVisualizza{

	
	Date datainiziodata;
	Date datafinedate;
	
	public Date getDatainiziodata() {
		return datainiziodata;
	}

	public void setDatainiziodata(Date datainiziodata) {
		this.datainiziodata = datainiziodata;
	}

	public Date getDatafinedate() {
		return datafinedate;
	}

	public void setDatafinedate(Date datafinedate) {
		this.datafinedate = datafinedate;
	}


	
	public conferenzeBeanModifica() throws NumberFormatException, RemoteException {
		//carico la conferenza
		ConferenzeFacade ws = new ConferenzeFacade();
		String var = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("cdConferenza");
		Conferenza c =  ws.getconferenzaid(Integer.parseInt(var));
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		this.setCdComuneIstat(c.getCdComuneIstat());
		this.setCdConferenza(c.getCdConferenza());
		this.setIndirizzo(c.getIndirizzo());
		this.setNome(c.getNome());
		this.setSottotitolo(c.getSottotitolo());
		this.setDataInizioString(df.format(c.getDataInizio().getTime()));
		this.setDataFineString(df.format(c.getDataFine().getTime()));
		this.setUrlmodifica("");
		this.setDatafinedate(c.getDataFine().getTime());
		this.setDatainiziodata(c.getDataInizio().getTime());
		
	}
	
	public void salva() throws Exception
	{
		//creo l'oggetto e lo passo al ws
		Conferenza conferenza= new Conferenza();
		conferenza.setCdComuneIstat(this.getCdComuneIstat());
		conferenza.setCdConferenza(this.getCdConferenza());
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.getDatainiziodata());				
		conferenza.setDataInizio(cal);
		
		
		cal.setTime(this.getDatafinedate());			
		conferenza.setDataFine(cal);
		
		conferenza.setIndirizzo(this.getIndirizzo());
		conferenza.setNome(this.getNome());
		conferenza.setSottotitolo(this.getSottotitolo());
		
		
		//ws
		ConferenzeFacade facade= new ConferenzeFacade();
		boolean risposta =  facade.aggiorna(conferenza);
		
		if(risposta)
		{
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"OK", "conferenza salvata correttamente"));		
		 return;
		}
		else
		{
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"!", "errore durante il salvataggio della conferenza"));		
			 return;	
		}
		
		 
		 
		
		
		
		
		
	}

}
