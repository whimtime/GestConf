package com.gestioneconferenzews.BR;

import java.util.Date;

import com.gestioneconferenzews.DAO.model.Persona;
import com.gestioneconferenzews.DAO.model.StrutturaConvenzionata;

/**Classe dedicata alla prenotazione di una struttura
 * @author PortatileTiz
 *
 */
public class PrenotazioneStrategy 
{
	IPrenotazione prenotazione=null;

	public IPrenotazione getStrategiaPrenotazione() {
		return prenotazione;
	}

	public void setStrategiaPrenotazione(IPrenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}
	
	
	
	/**Effettua una prenotazione
	 * @param struttura
	 * @param persona
	 * @param datainizio
	 * @param datafine
	 * @return
	 */
	public boolean effettuaPrenotazione(StrutturaConvenzionata struttura,
			Persona persona, Date datainizio, Date datafine) {
		
		return prenotazione.effettuaPrenotazione(struttura, persona, datainizio, datafine);
	}

	
	/**Cancella una prenotazione
	 * @param cd_prenotazione
	 * @return
	 */
	public boolean cancellaPrenotazione(int cd_prenotazione) {
		
		return prenotazione.cancellaPrenotazione(cd_prenotazione);
	}

	
	/**Modifica una prenotazione
	 * @param struttura
	 * @param persona
	 * @param datainizio
	 * @param datafine
	 * @return
	 */
	public boolean modificaPrenotazione(StrutturaConvenzionata struttura,
			Persona persona, Date datainizio, Date datafine) {
		
		return prenotazione.modificaPrenotazione(struttura, persona, datainizio, datafine);
	}
}
