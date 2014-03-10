package com.gestioneconferenze.sessione;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public void entra() 
	{
		String nome = this.username;
		String psw= this.password;
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata entra di sessioneBean");
		psw=psw + "";
		nome=nome + "";
		
		this.ipaddress =  UrlUtil.getRemoteAddr();
		
		if(!this.username.equals("tiziano"))
		{
			logger.warn("l utente " + this.username + " ha tentato di accedere senza successo");
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Errore!", "Utenza non registrata"));  
			return;
			
		}		
		logger.info("L utente " + this.username + " ha effettuato accesso");
		UrlUtil.RedirectAPagina("home.xhtml");
	}
	
	public void salva() 
	{
		
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata salva di sessioneBean");
	
		 if(password != password2)
		 {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"!", "le due password devono coincidere"));
			 logger.info("Per l utente " + this.username + " le due password non coincidono");
			 return;
		 }
		 
		 if(mail != mail2)
		 {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"!", "le due password devono coincidere"));
			 logger.info("Per l utente " + this.username + " le due mail non coincidono");
			 return;
		 }
		 
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"!", "Utenza salvata con successo"));
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"!", "Ti è stata mandata una mail per confermare la tua mail"));
		
		 
		logger.info("L utente " + this.username + " ha salvato i dati della propria utenza");
		
	}
	
	
	public void dettaglio()
	{
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("dettaglioUtente.xhtml");
	}
}
