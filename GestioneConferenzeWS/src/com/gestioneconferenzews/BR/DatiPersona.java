package com.gestioneconferenzews.BR;
import java.util.List;

import com.gestioneconferenzews.DAO.model.*;
/**Classe POJO per l'incapsulamento delle informazioni e l'esposizione tramite servizio
 * @author PortatileTiz
 *
 */
public class DatiPersona {

	List<Persona> lista;

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}
}
