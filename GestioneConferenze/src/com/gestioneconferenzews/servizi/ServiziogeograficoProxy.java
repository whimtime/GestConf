package com.gestioneconferenzews.servizi;

public class ServiziogeograficoProxy implements com.gestioneconferenzews.servizi.Serviziogeografico {
  private String _endpoint = null;
  private com.gestioneconferenzews.servizi.Serviziogeografico serviziogeografico = null;
  
  public ServiziogeograficoProxy() {
    _initServiziogeograficoProxy();
  }
  
  public ServiziogeograficoProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiziogeograficoProxy();
  }
  
  private void _initServiziogeograficoProxy() {
    try {
      serviziogeografico = (new com.gestioneconferenzews.servizi.ServiziogeograficoServiceLocator()).getserviziogeograficoPort();
      if (serviziogeografico != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviziogeografico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviziogeografico)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviziogeografico != null)
      ((javax.xml.rpc.Stub)serviziogeografico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gestioneconferenzews.servizi.Serviziogeografico getServiziogeografico() {
    if (serviziogeografico == null)
      _initServiziogeograficoProxy();
    return serviziogeografico;
  }
  
  public com.gestioneconferenzews.servizi.DatiGeografici getdatitotali() throws java.rmi.RemoteException{
    if (serviziogeografico == null)
      _initServiziogeograficoProxy();
    return serviziogeografico.getdatitotali();
  }
  
  
}