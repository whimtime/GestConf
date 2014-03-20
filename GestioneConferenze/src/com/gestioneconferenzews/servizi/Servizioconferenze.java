/**
 * Servizioconferenze.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public interface Servizioconferenze extends java.rmi.Remote {
    public boolean salvanuovaconferenza(com.gestioneconferenzews.servizi.Conferenza conferenza) throws java.rmi.RemoteException;
    public com.gestioneconferenzews.servizi.Conferenza[] getconferenze() throws java.rmi.RemoteException;
}
