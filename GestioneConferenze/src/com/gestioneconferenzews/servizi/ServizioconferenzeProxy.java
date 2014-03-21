package com.gestioneconferenzews.servizi;

public class ServizioconferenzeProxy implements com.gestioneconferenzews.servizi.Servizioconferenze {
  private String _endpoint = null;
  private com.gestioneconferenzews.servizi.Servizioconferenze servizioconferenze = null;
  
  public ServizioconferenzeProxy() {
    _initServizioconferenzeProxy();
  }
  
  public ServizioconferenzeProxy(String endpoint) {
    _endpoint = endpoint;
    _initServizioconferenzeProxy();
  }
  
  private void _initServizioconferenzeProxy() {
    try {
      servizioconferenze = (new com.gestioneconferenzews.servizi.ServizioconferenzeServiceLocator()).getservizioconferenzePort();
      if (servizioconferenze != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servizioconferenze)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servizioconferenze)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servizioconferenze != null)
      ((javax.xml.rpc.Stub)servizioconferenze)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gestioneconferenzews.servizi.Servizioconferenze getServizioconferenze() {
    if (servizioconferenze == null)
      _initServizioconferenzeProxy();
    return servizioconferenze;
  }
  
  public com.gestioneconferenzews.servizi.Conferenza[] getconferenze() throws java.rmi.RemoteException{
    if (servizioconferenze == null)
      _initServizioconferenzeProxy();
    return servizioconferenze.getconferenze();
  }
  
  public boolean salvanuovaconferenza(com.gestioneconferenzews.servizi.Conferenza conferenza) throws java.rmi.RemoteException{
    if (servizioconferenze == null)
      _initServizioconferenzeProxy();
    return servizioconferenze.salvanuovaconferenza(conferenza);
  }
  
  public com.gestioneconferenzews.servizi.Conferenza getconferenzaid(int cdconferenza) throws java.rmi.RemoteException{
    if (servizioconferenze == null)
      _initServizioconferenzeProxy();
    return servizioconferenze.getconferenzaid(cdconferenza);
  }
  
  public boolean aggiornaconferenza(com.gestioneconferenzews.servizi.Conferenza conferenza) throws java.rmi.RemoteException{
    if (servizioconferenze == null)
      _initServizioconferenzeProxy();
    return servizioconferenze.aggiornaconferenza(conferenza);
  }
  
  
}