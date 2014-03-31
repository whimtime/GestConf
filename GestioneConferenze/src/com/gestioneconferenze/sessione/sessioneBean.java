package com.gestioneconferenze.sessione;

import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.gestioneconferenze.Bean.contattoBean;
import com.gestioneconferenze.Bean.personaBean;
import com.gestioneconferenze.facade.UtentiFacade;
import com.gestioneconferenze.util.*;

import org.apache.log4j.Logger;

import com.gestioneconferenze.util.*;
import com.gestioneconferenzews.servizi.ComuneIstat;
import com.gestioneconferenzews.servizi.Contatto;
import com.gestioneconferenzews.servizi.Persona;
import com.gestioneconferenzews.servizi.Regione;

public class sessioneBean {

	
	public sessioneBean()
	{
		if(beanpersona==null) beanpersona= new personaBean();
		if(beancontatto==null) beancontatto = new contattoBean();
	}
	
	personaBean beanpersona;
	contattoBean beancontatto;
	
	public contattoBean getBeancontatto() {
		return beancontatto;
	}
	public void setBeancontatto(contattoBean beancontatto) {
		this.beancontatto = beancontatto;
	}
	public personaBean getBeanpersona() {
		return beanpersona;
	}
	public void setBeanpersona(personaBean beanpersona) {
		this.beanpersona = beanpersona;
	}
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
	public String getComunecodice() {
		return comunecodice;
	}
	public void setComunecodice(String comunecodice) {
		this.comunecodice = comunecodice;
	}
	public ComuneIstat getComune() {
		return comune;
	}
	public void setComune(ComuneIstat comune) {
		this.comune = comune;
	}


	String comunecodice="";
	ComuneIstat comune;
	
	
	

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
	
	public void caricareport()
	{
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("caricareport.xhtml");
	}

	public void nuovaconferenza()
	{
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("nuovaconferenza.xhtml");
	}
	
	public void elencoconferenze()
	{
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("elencoConferenze.xhtml");
	}
	
	public void nuovocomitato()
	{
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("nuovocomitato.xhtml");
	}
	
	public void abbinacomitato()
	{
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("addpersona.xhtml");
	}
	
	public void nuovapersona()
	{
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("nuovoutente.xhtml");
	}
	
	public void elencopersone()
	{
		Logger  logger = Logger.getLogger("com.foo");
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("elencoPersone.xhtml");
	}
	
	
	

	public void logout()
	{
		Logger  logger = Logger.getLogger("com.foo");
		this.username="";
		this.password="";
		
		logger.info("inizio chiamata dettaglio di sessioneBean");		
		UrlUtil.RedirectAjaxAPagina("loginPage.xhtml");
	}
	
	public void nuovoutente() throws Exception
	{
		//creo in sequenza Persona, Utenza, Contatto
		Persona persona = new Persona();
		persona.setCdComuneIstatNascita(this.beanpersona.getCdcomunenascita());
		persona.setCdPersona(0);
		persona.setCodiceFiscale(this.beanpersona.getCodicefiscale());
		persona.setCognome(this.beanpersona.getCognome());
		Calendar cal= Calendar.getInstance();
		cal.setTime(this.beanpersona.getDatanascita());
		persona.setDataNascita(cal);
		persona.setNome(this.beanpersona.getNome());
		persona.setPartitaIva(this.beanpersona.getPartitaiva());
		
		
		com.gestioneconferenzews.servizi.Utente utente= new com.gestioneconferenzews.servizi.Utente();
		utente.setPassword(this.password);
		utente.setUsername(this.username);
		
		
		Contatto contatto = new Contatto();
		contatto.setCdContatto(0);
		contatto.setCdPersona(0);
		contatto.setContatto(this.mail);
		contatto.setTipo("MAIL");
		
		UtentiFacade fa= new UtentiFacade();
		boolean risposta= fa.nuovoutente(persona, utente, contatto);
		
		if(!risposta)
		{
			
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Errore!", "Impossibile creare"));
			 return;
		}
	
		
	}


}
