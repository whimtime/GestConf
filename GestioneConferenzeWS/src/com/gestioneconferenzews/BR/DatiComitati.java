package com.gestioneconferenzews.BR;

import java.util.List;

import com.gestioneconferenzews.DAO.model.*;
/**Classe POJO per l'incapsulamento delle informazioni e l'esposizione tramite servizio
 * @author PortatileTiz
 *
 */
public class DatiComitati 
{
	List<Comitato> comitati;

	public List<Comitato> getComitati() {
		return comitati;
	}

	public void setComitati(List<Comitato> comitati) {
		this.comitati = comitati;
	}
}
