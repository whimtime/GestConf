package com.gestioneconferenzews.servizi;

public class ServizioutentiProxy implements com.gestioneconferenzews.servizi.Servizioutenti {
  private String _endpoint = null;
  private com.gestioneconferenzews.servizi.Servizioutenti servizioutenti = null;
  
  public ServizioutentiProxy() {
    _initServizioutentiProxy();
  }
  
  public ServizioutentiProxy(String endpoint) {
    _endpoint = endpoint;
    _initServizioutentiProxy();
  }
  
  private void _initServizioutentiProxy() {
    try {
      servizioutenti = (new com.gestioneconferenzews.servizi.ServizioutentiServiceLocator()).getservizioutentiPort();
      if (servizioutenti != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servizioutenti)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servizioutenti)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servizioutenti != null)
      ((javax.xml.rpc.Stub)servizioutenti)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gestioneconferenzews.servizi.Servizioutenti getServizioutenti() {
    if (servizioutenti == null)
      _initServizioutentiProxy();
    return servizioutenti;
  }
  
  public boolean nuovoutente(com.gestioneconferenzews.servizi.Utente arg0, com.gestioneconferenzews.servizi.Persona arg1, com.gestioneconferenzews.servizi.Contatto arg2) throws java.rmi.RemoteException, com.gestioneconferenzews.servizi.Exception{
    if (servizioutenti == null)
      _initServizioutentiProxy();
    return servizioutenti.nuovoutente(arg0, arg1, arg2);
  }
  
  public boolean verificautentelogin(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (servizioutenti == null)
      _initServizioutentiProxy();
    return servizioutenti.verificautentelogin(username, password);
  }
  
  
}