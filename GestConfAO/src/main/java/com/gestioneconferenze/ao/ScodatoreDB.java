package com.gestioneconferenze.ao;

import java.util.ArrayList;
import java.util.UUID;

public class ScodatoreDB implements Runnable
{
	public void avvia() throws InterruptedException
	{
		int i=0;
		while(true)
		{
			System.out.println("Start accodatore");
			String proxfattura = this.prossimoMessaggio();
			Proxy proxy= new Proxy();
						
			ArrayList listaVoci= new ArrayList();
			
			String anagrafica = null, codfis = null,piva = null;
			anagrafica=UUID.randomUUID().toString();
			System.out.println("in accodamento " + anagrafica);
			
			
			proxy.emettiFattura(listaVoci, anagrafica, codfis, piva);
			
			
			
			
			Thread.sleep(300);
			
			
		}
	}
	
	public String prossimoMessaggio()
	{
		
		return "1234";
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
		}
		
	}
}
