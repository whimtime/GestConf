package com.gestioneconferenze.facade;

import com.gestioneconferenzews.servizi.DatiGeografici;
import com.gestioneconferenzews.servizi.ServiziogeograficoProxy;


public class GeografiaFacade 
{
	
	public GeografiaFacade()
	{
		
	}
	
	public DatiGeografici getDatiTutti() throws Exception
	{		
	
		ServiziogeograficoProxy ws= new ServiziogeograficoProxy(GestoreRemoto.getIndirizzo(this));
	    DatiGeografici dati = ws.getdatitotali();
	    return dati;	
	}
}
