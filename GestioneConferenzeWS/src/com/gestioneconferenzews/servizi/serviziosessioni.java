package com.gestioneconferenzews.servizi;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.gestioneconferenzews.BR.DatiSessione;
import com.gestioneconferenzews.BR.GestioneSessioni;
import com.gestioneconferenzews.DAO.model.Persona;
import com.gestioneconferenzews.DAO.model.Sessione;

@WebService
public class serviziosessioni 
{
	
	public serviziosessioni()
	{
		
	}
	
	@WebMethod
	public boolean nuovasessione(Sessione sessione)
	{
		
		return new GestioneSessioni().nuovasessione(sessione); 
	}
	
	@WebMethod
	public boolean modificasessione(Sessione sessione)
	{
		
		return new GestioneSessioni().modificasessione(sessione);
	}
	
	@WebMethod
	public boolean cancellasessione(Sessione sessione)
	{
		
		return new GestioneSessioni().cancellasessione(sessione);
	}
	
	@WebMethod
	public boolean addpartecipante(Persona persona, Sessione sessione)
	{
		return true;
	}
	
	@WebMethod
	public boolean removepartecipante(Persona persona, Sessione sessione)
	{
		return true;
	}
	
	@WebMethod
	public DatiSessione getpartecipantisessione(int cd_sessione)
	{
		return new DatiSessione();
	}
}
