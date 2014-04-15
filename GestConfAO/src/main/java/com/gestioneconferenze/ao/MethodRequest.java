package com.gestioneconferenze.ao;

import java.rmi.RemoteException;

import com.gestioneconferenzews.servizi.ServiziopagamentiProxy;

public class MethodRequest 
{
	Future future;
	
	public MethodRequest(Future future)
	{
		this.future= future;	
		System.out.println("accodamento su ActivationList");
			
	}
	
	public boolean can_run()
	{
		//qui si possono inserire regole di coerenza e controlli
		return true;
	}
	
	public boolean call()
	{
		GeneraFattura genf= new GeneraFattura();
		 boolean risp = genf.emettiFattura(this);
		 if(risp)
		 {
			 future.setRisultato(MessaggiDiRitorno.Elaborato);
			 ServiziopagamentiProxy ws= new ServiziopagamentiProxy();
			 try {
				ws.salvaCodaElaborata(future.getCoda().getCdCodaFatturazione());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("ELABORATO");
		 }else{
			 future.setRisultato(MessaggiDiRitorno.Errore);
			 //store in db del future
		 }
		
		return true;
	}
}
