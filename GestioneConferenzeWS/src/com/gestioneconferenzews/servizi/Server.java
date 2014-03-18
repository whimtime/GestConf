package com.gestioneconferenzews.servizi;

import javax.xml.ws.Endpoint;

public class Server {
 
    public static void main(String[] args) {
 
        Endpoint.publish("http://localhost:8099/GestioneConferenzeWS/ServizioUtenti", new servizioutenti()); 
        System.out.println("Installazione ServizioUtenti completata");
         
        Endpoint.publish("http://localhost:8099/GestioneConferenzeWS/ServizioGeografia", new serviziogeografico());        
        System.out.println("Installazione ServioGeografia completata");
    }
 
}