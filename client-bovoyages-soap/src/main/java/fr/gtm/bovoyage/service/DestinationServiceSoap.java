/**
 * DestinationServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.bovoyage.service;

public interface DestinationServiceSoap extends java.rmi.Remote {
    public fr.gtm.bovoyage.service.DestinationDTO[] getAllDestinations() throws java.rmi.RemoteException;
    public java.lang.String create(fr.gtm.bovoyage.service.Destination arg0) throws java.rmi.RemoteException;
    public java.lang.String update(fr.gtm.bovoyage.service.Destination arg0) throws java.rmi.RemoteException;
    public java.lang.String delete(long arg0) throws java.rmi.RemoteException;
    public fr.gtm.bovoyage.service.DestinationDTO[] getAllValidDestinations() throws java.rmi.RemoteException;
    public fr.gtm.bovoyage.service.DatesVoyageDTO[] getDatesVoyageByDestinationId(long arg0) throws java.rmi.RemoteException;
    public fr.gtm.bovoyage.service.DestinationDTO findById(long arg0) throws java.rmi.RemoteException;
    public void deleteDatesVoyage(long arg0) throws java.rmi.RemoteException;
}
