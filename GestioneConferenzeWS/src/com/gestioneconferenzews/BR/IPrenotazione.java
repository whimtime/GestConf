package com.gestioneconferenzews.BR;

import java.util.Date;

import com.gestioneconferenzews.DAO.model.Persona;
import com.gestioneconferenzews.DAO.model.StrutturaConvenzionata;

public interface IPrenotazione 
{
	boolean effettuaPrenotazione(StrutturaConvenzionata struttura, Persona persona, Date datainizio, Date datafine);
	
	boolean cancellaPrenotazione(int cd_prenotazione);
	
	boolean modificaPrenotazione(StrutturaConvenzionata struttura, Persona persona, Date datainizio, Date datafine);
	
	
	
}
