package com.gestioneconferenzews.servizi;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.gestioneconferenzews.BR.DatiComitati;
import com.gestioneconferenzews.BR.DatiConferenze;
import com.gestioneconferenzews.BR.GestioneConferenze;
import com.gestioneconferenzews.DAO.model.Comitato;
import com.gestioneconferenzews.DAO.model.ComitatoPersona;
import com.gestioneconferenzews.DAO.model.Conferenza;
import com.gestioneconferenzews.DAO.model.Diplomi;
import com.gestioneconferenzews.DAO.model.Persona;

@WebService
public class servizioconferenze 
{
	@WebMethod
	public boolean salvanuovaconferenza(@WebParam(name="conferenza")Conferenza conferenza)
	{
		return new GestioneConferenze().salvaconferenza(conferenza);
	}
	
	@WebMethod
	public DatiConferenze getconferenze()
	{
		return new GestioneConferenze().getconferenze();
	}
	
	@WebMethod
	public Conferenza getconferenzaid(@WebParam(name="cdconferenza")int cdconferenza)
	{
		return new GestioneConferenze().getconferenze(cdconferenza);
	}
	
	@WebMethod
	public boolean aggiornaconferenza(@WebParam(name="conferenza")Conferenza conferenza)
	{
		return new GestioneConferenze().aggiornaconferenza(conferenza);
	}
	
	@WebMethod
	public boolean nuovocomitato(Comitato comitato) throws Exception
	{
		return new GestioneConferenze().nuovocomitato(comitato);
	}
	
	@WebMethod
	public DatiComitati getComitatiTutti()
	{
		return new GestioneConferenze().getComitatiTutti();
	}
	
	@WebMethod
	public boolean aggiornaComitato()
	{
		return new GestioneConferenze().aggiornaComitato(null);
	}
	
	@WebMethod
	public boolean addPersonaComitato(ComitatoPersona comitatopersona) throws Exception
	{
		return new GestioneConferenze().addPersonaComitato(comitatopersona);
	}
	
	@WebMethod
	public boolean removePersonaComitato(ComitatoPersona comitatopersona)
	{
		return new GestioneConferenze().removePersonaComitato(comitatopersona);
	}
	
	@WebMethod
	public List<Persona> getPersoneComitato(Comitato comitato)
	{
		return new GestioneConferenze().getPersoneComitato(comitato);
	}
	
	@WebMethod
	public boolean assegnadiploma(Diplomi diploma)
	{
		
		return new GestioneConferenze().assegnadiploma(diploma);
	}
}
