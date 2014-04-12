package com.gestioneconferenze.ao;

public class Future 
{
	MessaggiDiRitorno risultato;
	
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
