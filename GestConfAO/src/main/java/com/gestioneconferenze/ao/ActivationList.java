package com.gestioneconferenze.ao;

import java.util.ArrayList;



public class ActivationList 
{
	ArrayList lista= new ArrayList();
	
	private static ActivationList istanza = null;
	 
	 
	public static synchronized ActivationList getActivationList() 
	{
	 
		if (istanza == null) 
		{
	            istanza = new ActivationList();	            	     
		}	     
		return istanza;	   
	}
	
	public boolean insert(MethodRequest request)
	{
		System.out.println("accodata");
		return this.lista.add(request);
		
	}
	
	public MethodRequest remove()
	{
		try{
			
		MethodRequest richiesta=(MethodRequest)this.lista.get(0);
		this.lista.remove(0);
		return richiesta;
		}catch(Exception er)
		{
			return null;
		}
	}
}
