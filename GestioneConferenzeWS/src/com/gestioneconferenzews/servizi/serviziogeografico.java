package com.gestioneconferenzews.servizi;

import javax.jws.WebMethod;
import javax.jws.WebService;


import com.gestioneconferenzews.datistatici.DatiGeografici;
import com.gestioneconferenzews.datistatici.GestioneGeografia;

@WebService
public class serviziogeografico
{
		

	@WebMethod	
	public DatiGeografici getdatitotali()
	{
		return new GestioneGeografia().getDati();
	
	}
	
}
