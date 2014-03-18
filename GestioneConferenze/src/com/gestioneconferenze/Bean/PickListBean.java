package com.gestioneconferenze.Bean;

import java.rmi.RemoteException;
import java.util.ArrayList;  
import java.util.List;  

import javax.faces.application.FacesMessage;  
import javax.faces.context.FacesContext;  

import org.primefaces.event.TransferEvent;  
  

import org.primefaces.model.DualListModel;  

import com.gestioneconferenze.facade.GestoreRemoto;
import com.gestioneconferenzews.servizi.Competenza;
import com.gestioneconferenzews.servizi.ServiziocompetenzeProxy;
import com.gestioneconferenzews.servizi.ServiziogeograficoProxy;

public class PickListBean {  
	  
   
      
    private DualListModel<Competenza> competenze;  
  
    public DualListModel<Competenza> getCompetenze() {
		return competenze;
	}

	public void setCompetenze(DualListModel<Competenza> competenze) {
		this.competenze = competenze;
	}

	public PickListBean() {  
        //Players  
        List<Competenza> source = new ArrayList<Competenza>();  
        List<Competenza> target = new ArrayList<Competenza>();  
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
		        	source.add(c);
		        }
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
     
       
       
          
        competenze = new DualListModel<Competenza>(source, target);  
          
     
    }  
      
   
 
      
   
}  