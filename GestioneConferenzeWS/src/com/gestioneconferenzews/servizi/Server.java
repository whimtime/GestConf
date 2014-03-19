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
        System.out.println("Installazione ServizoTipoPagamentiVal completata");
    }
 
}