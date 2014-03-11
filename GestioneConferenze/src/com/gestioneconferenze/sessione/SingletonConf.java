package com.gestioneconferenze.sessione;

import java.util.ArrayList;
import java.util.Hashtable;

import org.apache.log4j.Logger;

public class SingletonConf
{
	ArrayList<Utente> elencoUtenti ;
	static Logger loggerSingleton = Logger.getLogger("com.foo");
	
	 private static SingletonConf istanza = null;
	 
	    
	    private SingletonConf() {}
	 
	    // Metodo della classe impiegato per accedere al singleton
	    public static synchronized SingletonConf getSingletonConf() {
	        if (istanza == null) {
	            istanza = new SingletonConf();
	            loggerSingleton.info("Creato singleton elenco utenti");
	        }
	        return istanza;
	    }
	    
	    public boolean addSessionUser(Utente utente)
	    {
	    	if(elencoUtenti==null) elencoUtenti=new ArrayList<>();
	    /*	
	    	if(elencoUtenti.contains(utente)){
	    		elencoUtenti.add(utente);
	    		loggerSingleton.info("l utente " + utente.getUsername() +" e entrato nel portale");
	    		return true;
	    	}else{
	    		
	    		return false;
	    	}*/
	    	
	    	boolean trovato= false;
	    	for(Utente ut : elencoUtenti)
	    	{
	    		if(ut.getUsername().equals(utente.getUsername()))
	    		{
	    			trovato= true;
	    		}
	    	}
	    	if(!trovato)
	    	{
	    		elencoUtenti.add(utente);
	    		return true;
	    	}
	    	
	    	return false;
	    }
	    	
	    public boolean removeSessionUser(Utente utente)
	    {
	    	if(elencoUtenti==null) return true;
	    	
	    	if(elencoUtenti.contains(utente)){
	    		elencoUtenti.remove(utente);
	    		loggerSingleton.info("l utente " + utente.getUsername() +" e uscito dal portale");
	    		return true;
	    	}else{
	    		
	    		return false;
	    	}
	    	
	    }
	    
	    public ArrayList<Utente> getLista()
	    {
	    	return elencoUtenti;
	    }
}


