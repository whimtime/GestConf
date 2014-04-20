package com.gestioneconferenzews.BR;

import java.util.List;

import com.gestioneconferenzews.DAO.model.*;

/**Classe POJO per l'incapsulamento delle informazioni e l'esposizione tramite servizio
 * @author PortatileTiz
 *
 */
public class DatiHotel 
{
	List<StrutturaConvenzionata> hotels;

	public List<StrutturaConvenzionata> getHotels() {
		return hotels;
	}

	public void setHotels(List<StrutturaConvenzionata> hotels) {
		this.hotels = hotels;
	}
}
