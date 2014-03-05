package com.gestioneconferenze.sessione;

import java.io.IOException;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletResponse;

public class sessioneBean {

	String username="";
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
	String password="";
	String ipaddress="";
	Date ultimoaccesso;
	
	public void entra() 
	{
		String nome = this.username;
		String psw= this.password;
		
		psw=psw + "";
		nome=nome + "";
		
		if(!this.username.equals("tiziano"))
		{
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Errore!", "Utenza non registrata"));  
			return;
			
		}
		
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse)context.getExternalContext().getResponse();
		try {
			response.sendRedirect("index.jsf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
