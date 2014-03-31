package com.gestioneconferenzews.servizi;

public class ServiziohotelProxy implements com.gestioneconferenzews.servizi.Serviziohotel {
  private String _endpoint = null;
  private com.gestioneconferenzews.servizi.Serviziohotel serviziohotel = null;
  
  public ServiziohotelProxy() {
    _initServiziohotelProxy();
  }
  
  public ServiziohotelProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiziohotelProxy();
  }
  
  private void _initServiziohotelProxy() {
    try {
      serviziohotel = (new com.gestioneconferenzews.servizi.ServiziohotelServiceLocator()).getserviziohotelPort();
      if (serviziohotel != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviziohotel)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviziohotel)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviziohotel != null)
      ((javax.xml.rpc.Stub)serviziohotel)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gestioneconferenzews.servizi.Serviziohotel getServiziohotel() {
    if (serviziohotel == null)
      _initServiziohotelProxy();
    return serviziohotel;
  }
  
  public com.gestioneconferenzews.servizi.StrutturaConvenzionata[] getStrutture() throws java.rmi.RemoteException{
    if (serviziohotel == null)
      _initServiziohotelProxy();
    return serviziohotel.getStrutture();
  }
  
  
}