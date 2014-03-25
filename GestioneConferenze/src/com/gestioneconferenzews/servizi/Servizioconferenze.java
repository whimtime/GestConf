/**
 * Servizioconferenze.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public interface Servizioconferenze extends java.rmi.Remote {
    public com.gestioneconferenzews.servizi.Persona[] getPersoneComitato(com.gestioneconferenzews.servizi.Comitato arg0) throws java.rmi.RemoteException;
    public boolean aggiornaconferenza(com.gestioneconferenzews.servizi.Conferenza conferenza) throws java.rmi.RemoteException;
    public boolean addPersonaComitato(com.gestioneconferenzews.servizi.ComitatoPersona arg0) throws java.rmi.RemoteException, com.gestioneconferenzews.servizi.Exception;
    public com.gestioneconferenzews.servizi.Comitato[] getComitatiTutti() throws java.rmi.RemoteException;
    public boolean aggiornaComitato() throws java.rmi.RemoteException;
    public boolean salvanuovaconferenza(com.gestioneconferenzews.servizi.Conferenza conferenza) throws java.rmi.RemoteException;
    public com.gestioneconferenzews.servizi.Conferenza getconferenzaid(int cdconferenza) throws java.rmi.RemoteException;
    public boolean removePersonaComitato(com.gestioneconferenzews.servizi.ComitatoPersona arg0) throws java.rmi.RemoteException;
    public boolean nuovocomitato(com.gestioneconferenzews.servizi.Comitato arg0) throws java.rmi.RemoteException, com.gestioneconferenzews.servizi.Exception;
    public com.gestioneconferenzews.servizi.Conferenza[] getconferenze() throws java.rmi.RemoteException;
}
