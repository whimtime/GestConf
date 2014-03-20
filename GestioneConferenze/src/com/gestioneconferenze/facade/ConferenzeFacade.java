package com.gestioneconferenze.facade;


import java.rmi.RemoteException;
import java.util.List;

import com.gestioneconferenzews.servizi.*;

public class ConferenzeFacade 
{
		
	public ConferenzeFacade(){}
		
	public boolean salva(Conferenza conferenza) throws Exception
	{
		ServizioconferenzeProxy ws = new ServizioconferenzeProxy(GestoreRemoto.getIndirizzo(this));
		return ws.salvanuovaconferenza(conferenza);			
	}
		
	public Conferenza[] getconferenze() throws RemoteException
	{
		ServizioconferenzeProxy ws= new ServizioconferenzeProxy();
		return ws.getconferenze(); 		
	}
	
	
}
