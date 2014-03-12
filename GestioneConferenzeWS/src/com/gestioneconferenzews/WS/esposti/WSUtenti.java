package com.gestioneconferenzews.WS.esposti;

public class WSUtenti
{
	public WSUtenti()
	{
		
	}
	
	public boolean UtenteVerificato(String username, String password)
	{
		return new com.gestioneconferenzews.BR.GestioneUtenti().VerificaAccesso(username, password);
		
	}
}
