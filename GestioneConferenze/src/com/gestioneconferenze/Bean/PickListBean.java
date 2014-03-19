package com.gestioneconferenze.Bean;


import java.rmi.RemoteException;
import java.util.ArrayList;  
import java.util.List;  

import org.primefaces.model.DualListModel;  

import com.gestioneconferenze.facade.GestoreRemoto;
import com.gestioneconferenzews.servizi.Competenza;
import com.gestioneconferenzews.servizi.ServiziocompetenzeProxy;


public class PickListBean {  
	  
   
      
    private DualListModel<String> competenze;  
  
    List<String> source =null;
    List<String> target = null;
    public DualListModel<String> getCompetenze() {

		return competenze;
	}

	public void setCompetenze(DualListModel<String> competenze) {
		this.competenze = competenze;
	}

	public PickListBean() {  
          
        source = new ArrayList<String>();  
        target=  new ArrayList<String>();  
        ArricchisciDati(source);
                                     
        competenze = new DualListModel<String>(source, target);            
     
    }

	private void ArricchisciDati(List<String> source2) {
		ServiziocompetenzeProxy ws = null;
		try {
			try {
				ws = new ServiziocompetenzeProxy(GestoreRemoto.getIndirizzo(this));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
        Competenza[] arr;
	
			arr = ws.getcompetenze();
			   for(Competenza c : arr)
		        {
		        	source2.add(c.getCompetenza());
		        }
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
      
   
	public void salvacompetenza()
	{
		
		List<String> comp =  competenze.getTarget();
		
		String s="";
		
	}
	
	
      
   
}  