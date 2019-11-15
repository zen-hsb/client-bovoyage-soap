/**
 * DestinationServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.bovoyage.service;

public class DestinationServiceSoapServiceLocator extends org.apache.axis.client.Service implements fr.gtm.bovoyage.service.DestinationServiceSoapService {

    public DestinationServiceSoapServiceLocator() {
    }


    public DestinationServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DestinationServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DestinationServiceSoapPort
    private java.lang.String DestinationServiceSoapPort_address = "http://localhost:9080/jboss-bovoyage/DestinationServiceSoap";

    public java.lang.String getDestinationServiceSoapPortAddress() {
        return DestinationServiceSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DestinationServiceSoapPortWSDDServiceName = "DestinationServiceSoapPort";

    public java.lang.String getDestinationServiceSoapPortWSDDServiceName() {
        return DestinationServiceSoapPortWSDDServiceName;
    }

    public void setDestinationServiceSoapPortWSDDServiceName(java.lang.String name) {
        DestinationServiceSoapPortWSDDServiceName = name;
    }

    public fr.gtm.bovoyage.service.DestinationServiceSoap getDestinationServiceSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DestinationServiceSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDestinationServiceSoapPort(endpoint);
    }

    public fr.gtm.bovoyage.service.DestinationServiceSoap getDestinationServiceSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.gtm.bovoyage.service.DestinationServiceSoapServiceSoapBindingStub _stub = new fr.gtm.bovoyage.service.DestinationServiceSoapServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDestinationServiceSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDestinationServiceSoapPortEndpointAddress(java.lang.String address) {
        DestinationServiceSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.gtm.bovoyage.service.DestinationServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.gtm.bovoyage.service.DestinationServiceSoapServiceSoapBindingStub _stub = new fr.gtm.bovoyage.service.DestinationServiceSoapServiceSoapBindingStub(new java.net.URL(DestinationServiceSoapPort_address), this);
                _stub.setPortName(getDestinationServiceSoapPortWSDDServiceName());
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
        if ("DestinationServiceSoapPort".equals(inputPortName)) {
            return getDestinationServiceSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.bovoyage.gtm.fr/", "DestinationServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.bovoyage.gtm.fr/", "DestinationServiceSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DestinationServiceSoapPort".equals(portName)) {
            setDestinationServiceSoapPortEndpointAddress(address);
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
