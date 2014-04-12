package com.gestioneconferenze.ao;

public class Scheduler 
{
	MethodRequest request;
	ActivationList list;
	public Scheduler()
	{
		
	}
	
	public boolean insert(MethodRequest request)
	{
		this.request = request;
		//La lista è singleton			
		list = ActivationList.getActivationList();
		System.out.println("In accodamento");
		list.insert(this.request);		
		
		return true;
	}
	
	public boolean dispatch()
	{
		list = ActivationList.getActivationList();
		MethodRequest richiesta = list.remove();
		if(richiesta== null)
			{
				return false;			
			}
		if(richiesta.can_run())
		{
			richiesta.call();
		}
		
		return true;
	}
	
	
}
