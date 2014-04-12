package com.gestioneconferenzews.BR;

import java.util.Date;

import com.gestioneconferenzews.DAO.model.Persona;
import com.gestioneconferenzews.DAO.model.StrutturaConvenzionata;

public class PrenotazioneStrategy 
{
	IPrenotazione prenotazione=null;

	public IPrenotazione getStrategiaPrenotazione() {
		return prenotazione;
	}

	public void setStrategiaPrenotazione(IPrenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}
	
	
	
	public boolean effettuaPrenotazione(StrutturaConvenzionata struttura,
			Persona persona, Date datainizio, Date datafine) {
		
		return prenotazione.effettuaPrenotazione(struttura, persona, datainizio, datafine);
	}

	
	public boolean cancellaPrenotazione(int cd_prenotazione) {
		
		return prenotazione.cancellaPrenotazione(cd_prenotazione);
	}

	
	public boolean modificaPrenotazione(StrutturaConvenzionata struttura,
			Persona persona, Date datainizio, Date datafine) {
		
		return prenotazione.modificaPrenotazione(struttura, persona, datainizio, datafine);
	}
}
