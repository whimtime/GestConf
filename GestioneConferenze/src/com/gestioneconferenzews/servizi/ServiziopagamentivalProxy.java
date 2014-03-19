package com.gestioneconferenzews.servizi;

public class ServiziopagamentivalProxy implements com.gestioneconferenzews.servizi.Serviziopagamentival {
  private String _endpoint = null;
  private com.gestioneconferenzews.servizi.Serviziopagamentival serviziopagamentival = null;
  
  public ServiziopagamentivalProxy() {
    _initServiziopagamentivalProxy();
  }
  
  public ServiziopagamentivalProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiziopagamentivalProxy();
  }
  
  private void _initServiziopagamentivalProxy() {
    try {
      serviziopagamentival = (new com.gestioneconferenzews.servizi.ServiziopagamentivalServiceLocator()).getserviziopagamentivalPort();
      if (serviziopagamentival != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviziopagamentival)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviziopagamentival)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviziopagamentival != null)
      ((javax.xml.rpc.Stub)serviziopagamentival)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gestioneconferenzews.servizi.Serviziopagamentival getServiziopagamentival() {
    if (serviziopagamentival == null)
      _initServiziopagamentivalProxy();
    return serviziopagamentival;
  }
  
  public com.gestioneconferenzews.servizi.TipoPagamento[] gettipipagamento() throws java.rmi.RemoteException{
    if (serviziopagamentival == null)
      _initServiziopagamentivalProxy();
    return serviziopagamentival.gettipipagamento();
  }
  
  
}