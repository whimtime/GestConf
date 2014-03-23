package com.gestioneconferenze.Bean.Applicazione;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.gestioneconferenze.facade.GeografiaFacade;
import com.gestioneconferenzews.servizi.*;
import com.gestioneconferenzews.servizi.Exception;

public class GeografiaBean 
{
	
	List<Regione> regioni;
	List<Provincia> province;
	List<ComuneIstat> comuni;
	GeografiaFacade facade;
	DatiGeografici dati;
	Logger logger = Logger.getLogger("com.foo");
	
	public GeografiaBean() throws java.lang.Exception
	{
		//inizializzo dal servizio e cast delle liste
		facade= new GeografiaFacade();
		try 
		{			
			dati = facade.getDatiTutti();
			logger.info("Caricati dati iniziali geografici");				
			regioni = new ArrayList<Regione>(Arrays.asList(dati.getRegioni()));
			province = new ArrayList<Provincia>(Arrays.asList(dati.getProvince()));
			comuni = new ArrayList<ComuneIstat>(Arrays.asList(dati.getComuni()));
			
		} catch (Exception e) {			
			e.printStackTrace();
			logger.error("Caricati dati iniziali geografici");
		}
	}
	
	public List<Regione> getRegioni() 
	{				
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
