package com.gestioneconferenze.conferenze;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

public class Conferenza 
{
	String nome="";
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLuogo() {
		return luogo;
	}
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	public int getNumeropartecipanti() {
		return numeropartecipanti;
	}
	public void setNumeropartecipanti(int numeropartecipanti) {
		this.numeropartecipanti = numeropartecipanti;
	}
	public Date getDataConferenzaInizio() {
		return dataConferenzaInizio;
	}
	public void setDataConferenzaInizio(Date dataConferenzaInizio) {
		this.dataConferenzaInizio = dataConferenzaInizio;
	}
	public Date getDataConferenzaFine() {
		return dataConferenzaFine;
	}
	public void setDataConferenzaFine(Date dataConferenzaFine) {
		this.dataConferenzaFine = dataConferenzaFine;
	}
	String luogo="";
	int numeropartecipanti=0;
	Date dataConferenzaInizio;
	Date dataConferenzaFine;
	String modifica="";
	

	
	public String getModifica() {
		return modifica;
	}
	public void setModifica(String modifica) 
	{
		
		try {
			this.modifica = "www.corriere.it?ID=" + com.gestioneconferenze.util.UrlUtil.EncodeUrl(this.getNome());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void entra() 
	{
		
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse)context.getExternalContext().getResponse();
		
		try {
			response.sendRedirect("home.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
