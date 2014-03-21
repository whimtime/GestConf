package com.gestioneconferenze.Bean;

import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.gestioneconferenze.facade.ConferenzeFacade;
import com.gestioneconferenzews.servizi.Conferenza;

public class conferenzeBean 
{
	String titolo="";
	String sottotitolo="";
	Date datainizio;
	Date datafine;
	String cdcomuneistat="";
	String indirizzo="";
	String datainiziostring="";
	String datafinestring="";
	
	
	public String getDatainiziostring() {
		return datainiziostring;
	}
	public void setDatainiziostring(String datainiziostring) {
		this.datainiziostring = datainiziostring;
	}
	public String getDatafinestring() {
		return datafinestring;
	}
	public void setDatafinestring(String datafinestring) {
		this.datafinestring = datafinestring;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getSottotitolo() {
		return sottotitolo;
	}
	public void setSottotitolo(String sottotitolo) {
		this.sottotitolo = sottotitolo;
	}
	public Date getDatainizio() {
		return datainizio;
	}
	public void setDatainizio(Date datainizio) {
		this.datainizio = datainizio;
	}
	public Date getDatafine() {
		return datafine;
	}
	public void setDatafine(Date datafine) {
		this.datafine = datafine;
	}
	public String getCdcomuneistat() {
		return cdcomuneistat;
	}
	public void setCdcomuneistat(String cdcomuneistat) {
		this.cdcomuneistat = cdcomuneistat;
	}

	public void salva() throws Exception
	{
		//creo l'oggetto e lo passo al ws
		Conferenza conferenza= new Conferenza();
		conferenza.setCdComuneIstat(this.cdcomuneistat);
		conferenza.setCdConferenza(0);
		Calendar cal = Calendar.getInstance();
		cal.setTime(datainizio);				
		conferenza.setDataInizio(cal);
		
		
		cal.setTime(datafine);			
		conferenza.setDataFine(cal);
		
		conferenza.setIndirizzo(this.indirizzo);
		conferenza.setNome(this.titolo);
		conferenza.setSottotitolo(this.sottotitolo);
		
		
		//ws
		ConferenzeFacade facade= new ConferenzeFacade();
		boolean risposta =  facade.salva(conferenza);
		
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
