package com.gestioneconferenzews.servizi;

public class ServiziopagamentiProxy implements com.gestioneconferenzews.servizi.Serviziopagamenti {
  private String _endpoint = null;
  private com.gestioneconferenzews.servizi.Serviziopagamenti serviziopagamenti = null;
  
  public ServiziopagamentiProxy() {
    _initServiziopagamentiProxy();
  }
  
  public ServiziopagamentiProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiziopagamentiProxy();
  }
  
  private void _initServiziopagamentiProxy() {
    try {
      serviziopagamenti = (new com.gestioneconferenzews.servizi.ServiziopagamentiServiceLocator()).getserviziopagamentiPort();
      if (serviziopagamenti != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviziopagamenti)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviziopagamenti)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviziopagamenti != null)
      ((javax.xml.rpc.Stub)serviziopagamenti)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gestioneconferenzews.servizi.Serviziopagamenti getServiziopagamenti() {
    if (serviziopagamenti == null)
      _initServiziopagamentiProxy();
    return serviziopagamenti;
  }
  
  public com.gestioneconferenzews.servizi.CodaFatturazione[] getCodaDaElaborare() throws java.rmi.RemoteException{
    if (serviziopagamenti == null)
      _initServiziopagamentiProxy();
    return serviziopagamenti.getCodaDaElaborare();
  }
  
  public boolean stornainvestimento(com.gestioneconferenzews.servizi.Investimento arg0) throws java.rmi.RemoteException{
    if (serviziopagamenti == null)
      _initServiziopagamentiProxy();
    return serviziopagamenti.stornainvestimento(arg0);
  }
  
  public boolean effettuapagamento(com.gestioneconferenzews.servizi.Pagamento arg0) throws java.rmi.RemoteException{
    if (serviziopagamenti == null)
      _initServiziopagamentiProxy();
    return serviziopagamenti.effettuapagamento(arg0);
  }
  
  public boolean addinvestimento(com.gestioneconferenzews.servizi.Investimento arg0) throws java.rmi.RemoteException{
    if (serviziopagamenti == null)
      _initServiziopagamentiProxy();
    return serviziopagamenti.addinvestimento(arg0);
  }
  
  public boolean salvaCodaElaborata(int arg0) throws java.rmi.RemoteException{
    if (serviziopagamenti == null)
      _initServiziopagamentiProxy();
    return serviziopagamenti.salvaCodaElaborata(arg0);
  }
  
  public boolean stornapagamento(com.gestioneconferenzews.servizi.Pagamento arg0) throws java.rmi.RemoteException{
    if (serviziopagamenti == null)
      _initServiziopagamentiProxy();
    return serviziopagamenti.stornapagamento(arg0);
  }
  
  
}