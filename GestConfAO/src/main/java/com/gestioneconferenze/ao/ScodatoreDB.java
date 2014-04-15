package com.gestioneconferenze.ao;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.UUID;

import com.gestioneconferenzews.servizi.CodaFatturazione;
import com.gestioneconferenzews.servizi.ServiziopagamentiProxy;

public class ScodatoreDB implements Runnable
{
	public void avvia() throws InterruptedException, RemoteException
	{
		ServiziopagamentiProxy ws = new ServiziopagamentiProxy();
		CodaFatturazione[] coda =  ws.getCodaDaElaborare();
						
		for(int i=0;i<coda.length;i++)
		{
			System.out.println("Start accodatore");
		
			Proxy proxy= new Proxy();															
			System.out.println("in accodamento " + coda[i].getCdCodaFatturazione());						
			proxy.emettiFattura(coda[i]);												
			Thread.sleep(300);						
		}
	}
	
	
	
	public void arricchisciFattura(ArrayList listaVoci, String anagrafica, String codfis, String piva)
	{
		
		anagrafica=UUID.randomUUID().toString();
		codfis = "NTRTZN80B12F205U";
		piva = "000000000012";
		
	}

	public void run() {
		try {
			this.avvia();
		} catch (InterruptedException e) {
			// 
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
