package com.gestioneconferenzews.servizi;

import java.util.Map;

import javax.faces.context.FacesContext;

public class ConferenzaBeanVisualizza extends Conferenza 
{
	String DataInizioString="";
	String DataFineString="";
	String urlmodifica="";
		
	
	
	
	
	
	
	
	
	public String getUrlmodifica() {
		return urlmodifica;
	}
	public void setUrlmodifica(String urlmodifica) {
		this.urlmodifica = urlmodifica;
	}
	public String getDataInizioString() {
		return DataInizioString;
	}
	public void setDataInizioString(String dataInizioString) {
		DataInizioString = dataInizioString;
	}
	public String getDataFineString() {
		return DataFineString;
	}
	public void setDataFineString(String dataFineString) {
		DataFineString = dataFineString;
	}
	
	
	
	

}
