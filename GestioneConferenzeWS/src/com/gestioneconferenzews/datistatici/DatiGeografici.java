package com.gestioneconferenzews.datistatici;

import java.io.Serializable;
import java.util.List;

import com.gestioneconferenzews.DAO.model.*;

public class DatiGeografici implements Serializable
{
	List<Regione> regioni;
	List<Provincia> province;
	List<ComuneIstat> comuni;
	
	
	public List<Regione> getRegioni() {
		return regioni;
	}
	public void setRegioni(List<Regione> regioni) {
		this.regioni = regioni;
	}
	public List<Provincia> getProvince() {
		return province;
	}
	public void setProvince(List<Provincia> province) {
		this.province = province;
	}
	public List<ComuneIstat> getComuni() {
		return comuni;
	}
	public void setComuni(List<ComuneIstat> comuni) {
		this.comuni = comuni;
	}
}
