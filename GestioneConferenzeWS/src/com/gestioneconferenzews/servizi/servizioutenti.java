package com.gestioneconferenzews.servizi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.gestioneconferenzews.BR.GestioneUtenti;

@WebService
public class servizioutenti 
{
		

	@WebMethod	
	public boolean verificautentelogin(@WebParam(name="username")String username, @WebParam(name="password")String password)
	{
		return new GestioneUtenti().VerificaAccesso(username, password);
	
	}
	
}
