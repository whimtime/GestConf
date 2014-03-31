package com.gestioneconferenze.Bean;

import java.io.Serializable;  

import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;  
import org.primefaces.model.map.LatLng;  
import org.primefaces.model.map.MapModel;  
import org.primefaces.model.map.Marker;  

import com.gestioneconferenze.facade.HotelFacade;
import com.gestioneconferenzews.servizi.StrutturaConvenzionata;

public class MapBean implements Serializable {


	private MapModel advancedModel; 	
	private Marker marker;  
	
	public MapBean() throws Exception {
		advancedModel  = new DefaultMapModel();
		
		//chiamo la facade
		HotelFacade fa= new HotelFacade();
		StrutturaConvenzionata[] strutture = fa.getStrutture();
		
		//Shared coordinates
		String[] co1= strutture[0].getCoordinate().split("\\,");
		double d1= Double.parseDouble(co1[0]);
		double d2= Double.parseDouble(co1[1]);
		LatLng coord1 = new LatLng(d1,d2);
		String[] co2= strutture[1].getCoordinate().split("\\,");
		d1= Double.parseDouble(co2[0]);
		d2= Double.parseDouble(co2[1]);
		LatLng coord2 = new LatLng(d1,d2);
		String[] co3= strutture[2].getCoordinate().split("\\,");
		d1= Double.parseDouble(co3[0]);
		d2= Double.parseDouble(co3[1]);
		LatLng coord3 = new LatLng(d1,d2);
		
		
		//Basic marker
	
        advancedModel.addOverlay(new Marker(coord1, strutture[0].getNome()+ " - " + strutture[0].getDescrizione(), "konyaalti.png", "http://maps.google.com/mapfiles/ms/micons/blue-dot.png"));  
        advancedModel.addOverlay(new Marker(coord2, strutture[1].getNome()+ " - " + strutture[1].getDescrizione(), "ataturkparki.png"));  
        advancedModel.addOverlay(new Marker(coord3, strutture[2].getNome()+ " - " + strutture[2].getDescrizione(), "kaleici.png", "http://maps.google.com/mapfiles/ms/micons/pink-dot.png")); 
		
	}

	  public MapModel getAdvancedModel() {  
	        return advancedModel;  
	    }  
	      
	    public void onMarkerSelect(OverlaySelectEvent event) {  
	        marker = (Marker) event.getOverlay();  
	    }  
	      
	    public Marker getMarker() {  
	        return marker;  
	    }  
}
					
