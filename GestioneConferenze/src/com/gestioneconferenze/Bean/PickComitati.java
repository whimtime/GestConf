package com.gestioneconferenze.Bean;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.DualListModel;

import com.gestioneconferenze.facade.ConferenzeFacade;
import com.gestioneconferenze.facade.GestoreRemoto;
import com.gestioneconferenze.facade.UtentiFacade;
import com.gestioneconferenzews.servizi.Competenza;
import com.gestioneconferenzews.servizi.Persona;
import com.gestioneconferenzews.servizi.ServiziocompetenzeProxy;

public class PickComitati 
{
    private DualListModel<String> persone;  
    
    List<String> source =null;
    List<String> target = null;
    public DualListModel<String> getPesone() {

		return persone;
	}

	public void setCompetenze(DualListModel<String> persone) {
		this.persone = persone;
	}

	public PickComitati() {  
          
        source = new ArrayList<String>();  
        target=  new ArrayList<String>();  
        try {
			ArricchisciDati(source);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                                     
        persone = new DualListModel<String>(source, target);            
     
    }

	private void ArricchisciDati(List<String> source2) throws Exception {
		UtentiFacade ws= new UtentiFacade();
        Persona[] arr;
	
			arr = ws.getPersoneTutte();
			   for(Persona c : arr)
		        {
		        	source2.add(c.getCognome());
		        }
		
	} 
      
   
	public void salvacompetenza()
	{
		
		List<String> comp =  persone.getTarget();
		
		String s="";
		
	}
}
