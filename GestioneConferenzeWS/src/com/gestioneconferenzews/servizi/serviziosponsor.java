package com.gestioneconferenzews.servizi;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.gestioneconferenzews.BR.GestioneSponsor;
import com.gestioneconferenzews.DAO.model.Sponsor;

@WebService
public class serviziosponsor 
{
	
	public serviziosponsor()
	{
		
	}
	
	@WebMethod
	public List<Sponsor> getsponsors()
	{
		return new GestioneSponsor().getsponsors();
	}
	
	@WebMethod
	public boolean addsponsor(Sponsor sponsor)
	{
		return new GestioneSponsor().addsponsor(sponsor);
	}
	
	
	@WebMethod
	public boolean removesponsor(Sponsor sponsor)
	{
		return new GestioneSponsor().removesponsor(sponsor);
	}

}
