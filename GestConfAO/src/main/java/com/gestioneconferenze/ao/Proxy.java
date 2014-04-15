package com.gestioneconferenze.ao;

import java.util.ArrayList;

import com.gestioneconferenzews.servizi.CodaFatturazione;

public class Proxy 
{
	public Proxy()
	{
		System.out.println("Istanziato Proxy");
	}
	
	public boolean emettiFattura(CodaFatturazione coda)
	{
		System.out.println("[" + coda.getCdCodaFatturazione() + "] Instanzio il future per la comunicazione al client dell'avvenuta elaborazione");
		Future future= new Future();
		future.setCoda(coda);
		MethodRequest request= new MethodRequest(future);
		System.out.println("Creato MethodRequest");
		Scheduler scheduler= new Scheduler();
		scheduler.insert(request);
		System.out.println("Creato MethodRequest");
		
		return true;
	}
	
	
	public boolean emettiScontrino(ArrayList listaVoci, String anagrafica, String piva)
	{
		System.out.println("Instanzio il future per la comunicazione al client dell'avvenuta elaborazione");
		Future future= new Future();
		System.out.println("Creato MethodRequest");
		MethodRequest request= new MethodRequest(future);
		Scheduler scheduler= new Scheduler();
		scheduler.insert(request);
		System.out.println("Creato Scheduler");
		return true;
	}
}
