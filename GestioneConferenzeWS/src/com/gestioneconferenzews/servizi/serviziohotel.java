package com.gestioneconferenzews.servizi;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.gestioneconferenzews.BR.DatiHotel;
import com.gestioneconferenzews.BR.GestioneHotel;

@WebService
public class serviziohotel {

	@WebMethod
	public DatiHotel getStrutture()
	{
		return new GestioneHotel().getHotelTutti();
	}
}
