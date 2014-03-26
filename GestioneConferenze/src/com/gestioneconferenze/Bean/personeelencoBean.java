package com.gestioneconferenze.Bean;

import com.gestioneconferenze.facade.UtentiFacade;
import com.gestioneconferenzews.servizi.Persona;

public class personeelencoBean 
{

	Persona[] persone;
	
	public Persona[] getPersone() {
		return persone;
	}

	public void setPersone(Persona[] persone) {
		this.persone = persone;
	}

	public personeelencoBean() throws Exception 
	{
		UtentiFacade ws= new UtentiFacade();
		
		persone = ws.getPersoneTutte();		
		
	}

}
