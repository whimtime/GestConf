package com.gestioneconferenze.Bean;

import java.io.Serializable;  

import org.primefaces.model.map.DefaultMapModel;  
import org.primefaces.model.map.LatLng;  
import org.primefaces.model.map.MapModel;  
import org.primefaces.model.map.Marker;  

public class MapBean implements Serializable {

	private MapModel simpleModel;

	public MapBean() {
		simpleModel = new DefaultMapModel();
		
		//Shared coordinates
		LatLng coord1 = new LatLng(45.447032, 9.208642);
		LatLng coord2 = new LatLng(45.444533, 9.164525);
		LatLng coord3 = new LatLng(45.458351, 9.178644);
		LatLng coord4 = new LatLng(45.472798, 9.186841);
		
		//Basic marker
		simpleModel.addOverlay(new Marker(coord1, "Hotel centrale"));
		simpleModel.addOverlay(new Marker(coord2, "BestWestern"));
		simpleModel.addOverlay(new Marker(coord3, "Italiana Hotel"));
		simpleModel.addOverlay(new Marker(coord4, "Mercure"));
	}

	public MapModel getSimpleModel() {
		return simpleModel;
	}
}
					
