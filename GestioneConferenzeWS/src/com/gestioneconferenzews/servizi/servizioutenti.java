package com.gestioneconferenzews.servizi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.gestioneconferenzews.BR.DatiPersona;
import com.gestioneconferenzews.BR.GestioneUtenti;
import com.gestioneconferenzews.DAO.model.Contatto;
import com.gestioneconferenzews.DAO.model.Persona;
import com.gestioneconferenzews.DAO.model.Utente;

@WebService
public class servizioutenti 
{
		

	@WebMethod	
	public boolean verificautentelogin(@WebParam(name="username")String username, @WebParam(name="password")String password)
	{
		return new GestioneUtenti().VerificaAccesso(username, password);
	
	}
	
	@WebMethod
	public boolean nuovoutente(Utente utente, Persona persona, Contatto contatto) throws Exception
	{
		return new GestioneUtenti().nuovoutente(utente, persona, contatto);
	}
	
	@WebMethod
	public DatiPersona getPersoneTutte(){
		return new GestioneUtenti().getPersoneTutte();
	}
	
	
}
