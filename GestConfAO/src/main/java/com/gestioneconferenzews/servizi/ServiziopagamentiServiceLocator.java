/**
 * ServiziopagamentiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class ServiziopagamentiServiceLocator extends org.apache.axis.client.Service implements com.gestioneconferenzews.servizi.ServiziopagamentiService {

    public ServiziopagamentiServiceLocator() {
    }


    public ServiziopagamentiServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiziopagamentiServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for serviziopagamentiPort
    private java.lang.String serviziopagamentiPort_address = "http://localhost:8099/GestioneConferenzeWS/ServizioPagamenti";

    public java.lang.String getserviziopagamentiPortAddress() {
        return serviziopagamentiPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String serviziopagamentiPortWSDDServiceName = "serviziopagamentiPort";

    public java.lang.String getserviziopagamentiPortWSDDServiceName() {
        return serviziopagamentiPortWSDDServiceName;
    }

    public void setserviziopagamentiPortWSDDServiceName(java.lang.String name) {
        serviziopagamentiPortWSDDServiceName = name;
    }

    public com.gestioneconferenzews.servizi.Serviziopagamenti getserviziopagamentiPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(serviziopagamentiPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getserviziopagamentiPort(endpoint);
    }

    public com.gestioneconferenzews.servizi.Serviziopagamenti getserviziopagamentiPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gestioneconferenzews.servizi.ServiziopagamentiPortBindingStub _stub = new com.gestioneconferenzews.servizi.ServiziopagamentiPortBindingStub(portAddress, this);
            _stub.setPortName(getserviziopagamentiPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setserviziopagamentiPortEndpointAddress(java.lang.String address) {
        serviziopagamentiPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gestioneconferenzews.servizi.Serviziopagamenti.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gestioneconferenzews.servizi.ServiziopagamentiPortBindingStub _stub = new com.gestioneconferenzews.servizi.ServiziopagamentiPortBindingStub(new java.net.URL(serviziopagamentiPort_address), this);
                _stub.setPortName(getserviziopagamentiPortWSDDServiceName());
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
        if ("serviziopagamentiPort".equals(inputPortName)) {
            return getserviziopagamentiPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "serviziopagamentiService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "serviziopagamentiPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("serviziopagamentiPort".equals(portName)) {
            setserviziopagamentiPortEndpointAddress(address);
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
