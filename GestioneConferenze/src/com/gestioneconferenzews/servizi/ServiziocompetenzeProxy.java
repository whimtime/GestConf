package com.gestioneconferenzews.servizi;

public class ServiziocompetenzeProxy implements com.gestioneconferenzews.servizi.Serviziocompetenze {
  private String _endpoint = null;
  private com.gestioneconferenzews.servizi.Serviziocompetenze serviziocompetenze = null;
  
  public ServiziocompetenzeProxy() {
    _initServiziocompetenzeProxy();
  }
  
  public ServiziocompetenzeProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiziocompetenzeProxy();
  }
  
  private void _initServiziocompetenzeProxy() {
    try {
      serviziocompetenze = (new com.gestioneconferenzews.servizi.ServiziocompetenzeServiceLocator()).getserviziocompetenzePort();
      if (serviziocompetenze != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviziocompetenze)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviziocompetenze)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviziocompetenze != null)
      ((javax.xml.rpc.Stub)serviziocompetenze)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gestioneconferenzews.servizi.Serviziocompetenze getServiziocompetenze() {
    if (serviziocompetenze == null)
      _initServiziocompetenzeProxy();
    return serviziocompetenze;
  }
  
  public com.gestioneconferenzews.servizi.Competenza[] getcompetenze() throws java.rmi.RemoteException{
    if (serviziocompetenze == null)
      _initServiziocompetenzeProxy();
    return serviziocompetenze.getcompetenze();
  }
  
  
}