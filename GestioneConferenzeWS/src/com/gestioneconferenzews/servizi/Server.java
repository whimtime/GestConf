package com.gestioneconferenzews.servizi;

import javax.xml.ws.Endpoint;

public class Server {
 
    public static void main(String[] args) {
 
        Endpoint.publish("http://localhost:8080/GestioneConferenzeWS/ServizioUtenti", new servizioutenti());
 
        System.out.println("Installazione ServizioUtenti completata");
 
    }
 
}