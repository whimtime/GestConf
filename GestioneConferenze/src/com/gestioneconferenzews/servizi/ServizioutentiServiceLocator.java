/**
 * ServizioutentiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class ServizioutentiServiceLocator extends org.apache.axis.client.Service implements com.gestioneconferenzews.servizi.ServizioutentiService {

    public ServizioutentiServiceLocator() {
    }


    public ServizioutentiServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServizioutentiServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for servizioutentiPort
    private java.lang.String servizioutentiPort_address = "http://localhost:8080/GestioneConferenzeWS/ServizioUtenti";

    public java.lang.String getservizioutentiPortAddress() {
        return servizioutentiPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String servizioutentiPortWSDDServiceName = "servizioutentiPort";

    public java.lang.String getservizioutentiPortWSDDServiceName() {
        return servizioutentiPortWSDDServiceName;
    }

    public void setservizioutentiPortWSDDServiceName(java.lang.String name) {
        servizioutentiPortWSDDServiceName = name;
    }

    public com.gestioneconferenzews.servizi.Servizioutenti getservizioutentiPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(servizioutentiPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getservizioutentiPort(endpoint);
    }

    public com.gestioneconferenzews.servizi.Servizioutenti getservizioutentiPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gestioneconferenzews.servizi.ServizioutentiPortBindingStub _stub = new com.gestioneconferenzews.servizi.ServizioutentiPortBindingStub(portAddress, this);
            _stub.setPortName(getservizioutentiPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setservizioutentiPortEndpointAddress(java.lang.String address) {
        servizioutentiPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gestioneconferenzews.servizi.Servizioutenti.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gestioneconferenzews.servizi.ServizioutentiPortBindingStub _stub = new com.gestioneconferenzews.servizi.ServizioutentiPortBindingStub(new java.net.URL(servizioutentiPort_address), this);
                _stub.setPortName(getservizioutentiPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("servizioutentiPort".equals(inputPortName)) {
            return getservizioutentiPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "servizioutentiService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "servizioutentiPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("servizioutentiPort".equals(portName)) {
            setservizioutentiPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
