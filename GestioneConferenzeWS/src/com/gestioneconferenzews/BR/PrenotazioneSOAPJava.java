package com.gestioneconferenzews.BR;

import java.util.Date;

import com.gestioneconferenzews.DAO.model.Persona;
import com.gestioneconferenzews.DAO.model.StrutturaConvenzionata;

/**Permette la prenotazione a ws di tipo java
 * @author PortatileTiz
 *
 */
public class PrenotazioneSOAPJava implements IPrenotazione {

	@Override
	public boolean effettuaPrenotazione(StrutturaConvenzionata struttura,
			Persona persona, Date datainizio, Date datafine) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancellaPrenotazione(int cd_prenotazione) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificaPrenotazione(StrutturaConvenzionata struttura,
			Persona persona, Date datainizio, Date datafine) {
		// TODO Auto-generated method stub
		return false;
	}

}
