/**
 * ServizioconferenzeServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class ServizioconferenzeServiceLocator extends org.apache.axis.client.Service implements com.gestioneconferenzews.servizi.ServizioconferenzeService {

    public ServizioconferenzeServiceLocator() {
    }


    public ServizioconferenzeServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServizioconferenzeServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for servizioconferenzePort
    private java.lang.String servizioconferenzePort_address = "http://localhost:8099/GestioneConferenzeWS/ServizioConferenze";

    public java.lang.String getservizioconferenzePortAddress() {
        return servizioconferenzePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String servizioconferenzePortWSDDServiceName = "servizioconferenzePort";

    public java.lang.String getservizioconferenzePortWSDDServiceName() {
        return servizioconferenzePortWSDDServiceName;
    }

    public void setservizioconferenzePortWSDDServiceName(java.lang.String name) {
        servizioconferenzePortWSDDServiceName = name;
    }

    public com.gestioneconferenzews.servizi.Servizioconferenze getservizioconferenzePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(servizioconferenzePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getservizioconferenzePort(endpoint);
    }

    public com.gestioneconferenzews.servizi.Servizioconferenze getservizioconferenzePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gestioneconferenzews.servizi.ServizioconferenzePortBindingStub _stub = new com.gestioneconferenzews.servizi.ServizioconferenzePortBindingStub(portAddress, this);
            _stub.setPortName(getservizioconferenzePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setservizioconferenzePortEndpointAddress(java.lang.String address) {
        servizioconferenzePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gestioneconferenzews.servizi.Servizioconferenze.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gestioneconferenzews.servizi.ServizioconferenzePortBindingStub _stub = new com.gestioneconferenzews.servizi.ServizioconferenzePortBindingStub(new java.net.URL(servizioconferenzePort_address), this);
                _stub.setPortName(getservizioconferenzePortWSDDServiceName());
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
        if ("servizioconferenzePort".equals(inputPortName)) {
            return getservizioconferenzePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "servizioconferenzeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "servizioconferenzePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("servizioconferenzePort".equals(portName)) {
            setservizioconferenzePortEndpointAddress(address);
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
