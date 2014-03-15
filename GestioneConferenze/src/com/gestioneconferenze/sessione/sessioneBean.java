package com.gestioneconferenze.sessione;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.gestioneconferenze.facade.UtentiFacade;
import com.gestioneconferenze.util.*;

import org.apache.log4j.Logger;

import com.gestioneconferenze.util.*;

public class sessioneBean {

	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getMail2() {
		return mail2;
	}
	public void setMail2(String mail2) {
		this.mail2 = mail2;
	}


	String username="";
	String password="";
	String password2="";
	String ipaddress="";
	Date ultimoaccesso;
	String modifica="www.corriere.it";
	String mail="";
	String mail2="";
	
	
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getUsername() {
	
		return username;
	}
	public void setUsername(String username) {
		
		
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public Date getUltimoaccesso() {
		return ultimoaccesso;
	}
	public void setUltimoaccesso(Date ultimoaccesso) {
		this.ultimoaccesso = ultimoaccesso;
	}
	
	
	public String getModifica() {
		return modifica;
	}
	public void setModifica(String modifica) {
		this.modifica = modifica;
	}
	public void entra() throws Exception 
	{
		String nome = this.username;
		String psw= this.password;
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata entra di sessioneBean");
						
		UtentiFacade ws= new UtentiFacade();
		if(!ws.login(nome, psw))
		{
			logger.warn("l utente " + this.username + " ha tentato di accedere senza successo");
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Errore!", "Utenza non registrata"));  
			return;
			
		}		
		logger.info("L utente " + this.username + " ha effettuato accesso");		

		boolean risposta = ws.creaSessionUtente(username);
		if(!risposta)
		{
			logger.warn("l utente " + this.username + " - errore nella creazione della sessione");
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Errore!", "Impossibile accedere"));
			 return;
		}
		
		UrlUtil.RedirectAPagina("home.xhtml");
	}
	
	
	public void salva() 
	{
		
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata salva di sessioneBean");
	
		if(!password.equals(password2))
		 {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"!", "le due password devono coincidere"));
			 logger.info("Per l utente " + username + " le due password non coincidono");
			 return;
		 }
		 
		 if(!mail.equals(mail2))
		 {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"!", "le due password devono coincidere"));
			 logger.info("Per l utente " + username + " le due mail non coincidono");
			 return;
		 }
		logger.info("L utente " + this.username + " ha salvato i dati della propria utenza");
		
	}

	
	
	public void dettaglio()
	{
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("dettaglioUtente.xhtml");
	}

	

}
