package com.gestioneconferenze.facade;

import java.util.ResourceBundle;

public class GestoreRemoto 
{
	public static String getIndirizzo(Object classe) throws Exception
	{		
		//prelevo l'ambiente per capire su quale file 
		ResourceBundle resource = ResourceBundle.getBundle("ambiente");
		
		String ambiente=resource.getString("ambiente");
		
		ResourceBundle FILE_AMBIENTE = null;
		
		
		if(ambiente.equals("produzione"))  FILE_AMBIENTE = ResourceBundle.getBundle("proprieta_produzione");
		if(ambiente.equals("preproduzione"))  FILE_AMBIENTE = ResourceBundle.getBundle("preproprieta_produzione");
		if(ambiente.equals("collaudo"))  FILE_AMBIENTE = ResourceBundle.getBundle("collaudo_produzione");
		if(ambiente.equals("sviluppo"))  FILE_AMBIENTE = ResourceBundle.getBundle("sviluppo_produzione");
		
			
		
		String chiamante = classe.getClass().getName();
		if(chiamante.equals("com.gestioneconferenze.facade.UtentiFacade"))
		{
			return FILE_AMBIENTE.getString("url_gestione_utenti");
		}
		if(chiamante.equals("com.gestioneconferenze.facade.GeografiaFacade"))
		{
			return FILE_AMBIENTE.getString("url_gestione_geografia");
		}
		if(chiamante.equals("com.gestioneconferenze.Bean.PickListBean"))
		{
			return FILE_AMBIENTE.getString("url_gestione_competenze");
		}
		if(chiamante.equals("com.gestioneconferenze.facade.PagamentiFacade"))
		{
			return FILE_AMBIENTE.getString("url_gestione_pagamenti");
		}
		if(chiamante.equals("com.gestioneconferenze.facade.ConferenzeFacade"))
		{
			return FILE_AMBIENTE.getString("url_gestione_conferenze");
		}
		if(chiamante.equals("com.gestioneconferenze.facade.HotelFacade"))
		{
			return FILE_AMBIENTE.getString("url_gestione_hotel");
		}
		
		throw new Exception("Url remota non trovata");
		
	}
}
