package com.gestioneconferenze.sessione;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;
import com.gestioneconferenze.util.*;

public class sessioneBean {

	String username="";
	String password="";
	String ipaddress="";
	Date ultimoaccesso;
	String modifica="www.corriere.it";
	String mail="";
	
	
	
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
	
	
	
	public void dettaglio()
	{
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("dettaglioUtente.xhtml");
	}
}
