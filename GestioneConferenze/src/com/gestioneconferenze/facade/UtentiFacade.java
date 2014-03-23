package com.gestioneconferenze.facade;

import java.rmi.RemoteException;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.ws.Service;

import org.apache.log4j.Logger;

import com.gestioneconferenze.sessione.SingletonConf;
import com.gestioneconferenze.sessione.Utente;
import com.gestioneconferenze.util.SendMail;
import com.gestioneconferenze.util.UrlUtil;
import com.gestioneconferenzews.servizi.Contatto;
import com.gestioneconferenzews.servizi.Persona;
import com.gestioneconferenzews.servizi.Servizioutenti;
import com.gestioneconferenzews.servizi.ServizioutentiPortBindingStub;
import com.gestioneconferenzews.servizi.ServizioutentiProxy;
import com.gestioneconferenzews.servizi.ServizioutentiService;



public class UtentiFacade
{
	public UtentiFacade()
	{
		
	}
	
	public boolean login(String username, String password) throws Exception
	{
						
		ServizioutentiProxy ws= new ServizioutentiProxy(GestoreRemoto.getIndirizzo(this));
		boolean risposta = ws.verificautentelogin(username, password);
						
		return risposta;
	}
	
	
	public boolean creaSessionUtente(String username)
	{
			try
			{
				SingletonConf oggettoSingleton = SingletonConf.getSingletonConf();
				Utente utente= new Utente();
				utente.setUsername(username);
				utente.setEmail("");
				utente.setDataaccesso(new Date());
				utente.setIpaddress(UrlUtil.getRemoteAddr());
				oggettoSingleton.addSessionUser(utente);
				return true;			
			}
			catch(Exception er)
			{
				return false;
			}
	}
	
	
	private void SalvaDettaglioUtente(Utente utente)
	{
		Logger  logger = Logger.getLogger("com.foo");
		
		 
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"!", "Utenza salvata con successo"));
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"!", "Ti è stata mandata una mail per confermare la tua mail"));
		
		 new SendMail("info@gestioneconferenzeweb.com", "tiziano.interlandi@gmail.com", "modifica dati utente", "i tuoi dati sono stati modificati").send();
	}
	
	public boolean nuovoutente(com.gestioneconferenzews.servizi.Persona persona, com.gestioneconferenzews.servizi.Utente utente, com.gestioneconferenzews.servizi.Contatto contatto) throws Exception
	{
		Logger  logger = Logger.getLogger("com.foo");
		
		ServizioutentiProxy ws= new ServizioutentiProxy(GestoreRemoto.getIndirizzo(this));
		boolean risposta =  ws.nuovoutente(utente, persona,contatto);
		if(risposta)
		{

			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"!", "Utenza salvata con successo"));
			
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"!", "Ti è stata mandata una mail per confermare"));
		return true;
		}
		else
		{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"!", "Errore durante la creazione"));
			return false;
		}
		
		
	}
}
