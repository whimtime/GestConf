package com.gestioneconferenzews.servizi;
import javax.jws.WebMethod;
import javax.jws.WebService;




import com.gestioneconferenzews.datistatici.CompetenzeVal;
import com.gestioneconferenzews.datistatici.DatiCompetenza;


@WebService
public class serviziocompetenze 
{
	@WebMethod	
	public DatiCompetenza getcompetenze()
	{
		return new CompetenzeVal().getDati();
	}
}
