package com.gestioneconferenzews.servizi;

import javax.xml.ws.Endpoint;

public class Server {
 
    public static void main(String[] args) {
 
        Endpoint.publish("http://localhost:8099/GestioneConferenzeWS/ServizioUtenti", new servizioutenti()); 
        System.out.println("Installazione ServizioUtenti completata");
         
        Endpoint.publish("http://localhost:8099/GestioneConferenzeWS/ServizioGeografia", new serviziogeografico());        
        System.out.println("Installazione ServizioGeografia completata");
        
        Endpoint.publish("http://localhost:8099/GestioneConferenzeWS/ServizioCompetenze", new serviziocompetenze());        
        System.out.println("Installazione ServizioCompetenze completata");
        
        Endpoint.publish("http://localhost:8099/GestioneConferenzeWS/ServizioTipoPagamentiVal", new serviziopagamentival());    
        System.out.println("Installazione ServizioTipoPagamentiVal completata");
        
        Endpoint.publish("http://localhost:8099/GestioneConferenzeWS/ServizioConferenze", new servizioconferenze());        
        System.out.println("Installazione ServizioConferenze completata");
        
        Endpoint.publish("http://localhost:8099/GestioneConferenzeWS/ServizioHotels", new serviziohotel());        
        System.out.println("Installazione ServizioHotels completata");
        
        Endpoint.publish("http://localhost:8099/GestioneConferenzeWS/ServizioSessioni", new serviziosessioni());        
        System.out.println("Installazione ServizioSessioni completata");
    }
 
}