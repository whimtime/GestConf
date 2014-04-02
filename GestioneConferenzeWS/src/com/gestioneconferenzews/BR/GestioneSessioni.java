package com.gestioneconferenzews.BR;

import com.gestioneconferenzews.DAO.model.Persona;
import com.gestioneconferenzews.DAO.model.Sessione;

public class GestioneSessioni 
{
	public GestioneSessioni()
	{
		
	}
	
	public boolean nuovasessione(Sessione sessione)
	{
		
		return true;
	}
	
	public boolean modificasessione(Sessione sessione)
	{
		
		return true;
	}
	
	public boolean cancellasessione(Sessione sessione)
	{
		
		return true;
	}
	
	public boolean addpartecipante(Persona persona, Sessione sessione)
	{
		return true;
	}
	
	public boolean removepartecipante(Persona persona, Sessione sessione)
	{
		return true;
	}
	
	public DatiSessione getpartecipantisessione(int cd_sessione)
	{
		return new DatiSessione();
	}
	
	
	
}
