/**
 * ServiziopagamentivalServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class ServiziopagamentivalServiceLocator extends org.apache.axis.client.Service implements com.gestioneconferenzews.servizi.ServiziopagamentivalService {

    public ServiziopagamentivalServiceLocator() {
    }


    public ServiziopagamentivalServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiziopagamentivalServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for serviziopagamentivalPort
    private java.lang.String serviziopagamentivalPort_address = "http://localhost:8099/GestioneConferenzeWS/ServizioTipoPagamentiVal";

    public java.lang.String getserviziopagamentivalPortAddress() {
        return serviziopagamentivalPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String serviziopagamentivalPortWSDDServiceName = "serviziopagamentivalPort";

    public java.lang.String getserviziopagamentivalPortWSDDServiceName() {
        return serviziopagamentivalPortWSDDServiceName;
    }

    public void setserviziopagamentivalPortWSDDServiceName(java.lang.String name) {
        serviziopagamentivalPortWSDDServiceName = name;
    }

    public com.gestioneconferenzews.servizi.Serviziopagamentival getserviziopagamentivalPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(serviziopagamentivalPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getserviziopagamentivalPort(endpoint);
    }

    public com.gestioneconferenzews.servizi.Serviziopagamentival getserviziopagamentivalPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gestioneconferenzews.servizi.ServiziopagamentivalPortBindingStub _stub = new com.gestioneconferenzews.servizi.ServiziopagamentivalPortBindingStub(portAddress, this);
            _stub.setPortName(getserviziopagamentivalPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setserviziopagamentivalPortEndpointAddress(java.lang.String address) {
        serviziopagamentivalPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gestioneconferenzews.servizi.Serviziopagamentival.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gestioneconferenzews.servizi.ServiziopagamentivalPortBindingStub _stub = new com.gestioneconferenzews.servizi.ServiziopagamentivalPortBindingStub(new java.net.URL(serviziopagamentivalPort_address), this);
                _stub.setPortName(getserviziopagamentivalPortWSDDServiceName());
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
        if ("serviziopagamentivalPort".equals(inputPortName)) {
            return getserviziopagamentivalPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "serviziopagamentivalService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "serviziopagamentivalPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("serviziopagamentivalPort".equals(portName)) {
            setserviziopagamentivalPortEndpointAddress(address);
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
