package com.gestioneconferenze.facade;

import java.rmi.RemoteException;

import javax.xml.ws.Service;

import com.gestioneconferenzews.servizi.Servizioutenti;
import com.gestioneconferenzews.servizi.ServizioutentiPortBindingStub;
import com.gestioneconferenzews.servizi.ServizioutentiProxy;
import com.gestioneconferenzews.servizi.ServizioutentiService;



public class UtentiFacade
{
	public UtentiFacade()
	{
		
	}
	
	public boolean login(String username, String password) throws Exception
	{
						
		ServizioutentiProxy ws= new ServizioutentiProxy(GestoreRemoto.getIndirizzo(this));
		boolean risposta = ws.verificautentelogin(username, password);
						
		return risposta;
	}
	
	
}
