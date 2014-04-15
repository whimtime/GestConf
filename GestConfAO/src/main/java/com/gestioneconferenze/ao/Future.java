package com.gestioneconferenze.ao;

import com.gestioneconferenzews.servizi.CodaFatturazione;

public class Future 
{
	MessaggiDiRitorno risultato;
	CodaFatturazione coda;
	
	public CodaFatturazione getCoda() {
		return coda;
	}

	public void setCoda(CodaFatturazione coda) {
		this.coda = coda;
	}

	public Future()
	{
		System.out.println("Instanziato Future");
	}
	
	public MessaggiDiRitorno getRisultato() {
		return risultato;
	}

	public void setRisultato(MessaggiDiRitorno risultato) {
		this.risultato = risultato;
	}
	
}
