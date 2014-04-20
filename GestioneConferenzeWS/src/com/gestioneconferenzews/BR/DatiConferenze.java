package com.gestioneconferenzews.BR;

import java.util.List;

import com.gestioneconferenzews.DAO.model.*;
/**Classe POJO per l'incapsulamento delle informazioni e l'esposizione tramite servizio
 * @author PortatileTiz
 *
 */
public class DatiConferenze 
{
	List<Conferenza> conferenze;
	
	

	public List<Conferenza> getConferenze() {
		return conferenze;
	}



	public void setConferenze(List<Conferenza> conferenze) {
		this.conferenze = conferenze;
	}



	public DatiConferenze()
	{
		
	}
	
	
}
