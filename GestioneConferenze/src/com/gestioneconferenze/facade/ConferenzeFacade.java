package com.gestioneconferenze.facade;


import java.rmi.RemoteException;
import java.util.List;

import com.gestioneconferenzews.servizi.*;
import com.gestioneconferenzews.servizi.Exception;

public class ConferenzeFacade 
{
		
	public ConferenzeFacade(){}
		
	public boolean salva(Conferenza conferenza) throws java.lang.Exception
	{
		ServizioconferenzeProxy ws = new ServizioconferenzeProxy(GestoreRemoto.getIndirizzo(this));
		return ws.salvanuovaconferenza(conferenza);			
	}
		
	public Conferenza[] getconferenze() throws RemoteException
	{
		ServizioconferenzeProxy ws= new ServizioconferenzeProxy();
		return ws.getconferenze(); 		
	}
	
	public Conferenza getconferenzaid(int cdconferenza) throws RemoteException
	{
		ServizioconferenzeProxy ws= new ServizioconferenzeProxy();
		return ws.getconferenzaid(cdconferenza); 			
	}
	
	public boolean aggiorna(Conferenza conferenza) throws java.lang.Exception
	{
		ServizioconferenzeProxy ws = new ServizioconferenzeProxy(GestoreRemoto.getIndirizzo(this));
		return ws.aggiornaconferenza(conferenza);			
	}
	
	public boolean nuovocomitato(Comitato comitato) throws java.lang.Exception
	{
		ServizioconferenzeProxy ws = new ServizioconferenzeProxy(GestoreRemoto.getIndirizzo(this));
		return ws.nuovocomitato(comitato);
	}
}
