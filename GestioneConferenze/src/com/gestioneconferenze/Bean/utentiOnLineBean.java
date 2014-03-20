package com.gestioneconferenze.Bean;

import java.util.ArrayList;
import java.util.List;


import com.gestioneconferenze.sessione.SingletonConf;
import com.gestioneconferenze.sessione.Utente;

public class utentiOnLineBean 
{
	private ArrayList<Utente> utenti;
	
	public utentiOnLineBean()
	{
		//leggo il singleton
		SingletonConf singletonConf= SingletonConf.getSingletonConf();
		
		utenti= singletonConf.getLista();
		
	}
	
	public List<Utente> getUtenti() {
		return utenti;
	}
}
