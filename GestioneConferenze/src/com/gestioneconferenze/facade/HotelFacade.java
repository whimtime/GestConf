package com.gestioneconferenze.facade;

import com.gestioneconferenzews.servizi.ServiziohotelProxy;
import com.gestioneconferenzews.servizi.StrutturaConvenzionata;

public class HotelFacade 
{
	public HotelFacade()
	{
		
	}
	
	public StrutturaConvenzionata[] getStrutture() throws Exception
	{
		ServiziohotelProxy ws= new ServiziohotelProxy(GestoreRemoto.getIndirizzo(this));
		return	ws.getStrutture();
	}
}
