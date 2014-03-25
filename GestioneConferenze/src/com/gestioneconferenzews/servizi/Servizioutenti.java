/**
 * Servizioutenti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public interface Servizioutenti extends java.rmi.Remote {
    public boolean nuovoutente(com.gestioneconferenzews.servizi.Utente arg0, com.gestioneconferenzews.servizi.Persona arg1, com.gestioneconferenzews.servizi.Contatto arg2) throws java.rmi.RemoteException, com.gestioneconferenzews.servizi.Exception;
    public com.gestioneconferenzews.servizi.Persona[] getPersoneTutte() throws java.rmi.RemoteException;
    public boolean verificautentelogin(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
}
