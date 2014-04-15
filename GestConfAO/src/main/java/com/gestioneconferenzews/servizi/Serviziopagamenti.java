/**
 * Serviziopagamenti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public interface Serviziopagamenti extends java.rmi.Remote {
    public com.gestioneconferenzews.servizi.CodaFatturazione[] getCodaDaElaborare() throws java.rmi.RemoteException;
    public boolean stornainvestimento(com.gestioneconferenzews.servizi.Investimento arg0) throws java.rmi.RemoteException;
    public boolean effettuapagamento(com.gestioneconferenzews.servizi.Pagamento arg0) throws java.rmi.RemoteException;
    public boolean addinvestimento(com.gestioneconferenzews.servizi.Investimento arg0) throws java.rmi.RemoteException;
    public boolean salvaCodaElaborata(int arg0) throws java.rmi.RemoteException;
    public boolean stornapagamento(com.gestioneconferenzews.servizi.Pagamento arg0) throws java.rmi.RemoteException;
}
