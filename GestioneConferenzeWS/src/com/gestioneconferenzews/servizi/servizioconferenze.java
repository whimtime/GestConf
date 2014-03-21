package com.gestioneconferenzews.servizi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.gestioneconferenzews.BR.DatiConferenze;
import com.gestioneconferenzews.BR.GestioneConferenze;
import com.gestioneconferenzews.DAO.model.Conferenza;

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
}
