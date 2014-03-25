package com.gestioneconferenze.Bean;

import com.gestioneconferenze.facade.ConferenzeFacade;
import com.gestioneconferenzews.servizi.Comitato;

public class comitatoElencoBean {
	
	Comitato[] comitati;

	public Comitato[] getComitati() {
		return comitati;
	}

	public void setComitati(Comitato[] comitati) {
		this.comitati = comitati;
	}
	
	public comitatoElencoBean() throws Exception
	{
		comitati = new ConferenzeFacade().getComitatiTutti();
	}

}
