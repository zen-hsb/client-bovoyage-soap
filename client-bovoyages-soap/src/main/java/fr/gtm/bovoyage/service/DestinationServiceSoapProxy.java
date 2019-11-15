package fr.gtm.bovoyage.service;

public class DestinationServiceSoapProxy implements fr.gtm.bovoyage.service.DestinationServiceSoap {
  private String _endpoint = null;
  private fr.gtm.bovoyage.service.DestinationServiceSoap destinationServiceSoap = null;
  
  public DestinationServiceSoapProxy() {
    _initDestinationServiceSoapProxy();
  }
  
  public DestinationServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initDestinationServiceSoapProxy();
  }
  
  private void _initDestinationServiceSoapProxy() {
    try {
      destinationServiceSoap = (new fr.gtm.bovoyage.service.DestinationServiceSoapServiceLocator()).getDestinationServiceSoapPort();
      if (destinationServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)destinationServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)destinationServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (destinationServiceSoap != null)
      ((javax.xml.rpc.Stub)destinationServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.gtm.bovoyage.service.DestinationServiceSoap getDestinationServiceSoap() {
    if (destinationServiceSoap == null)
      _initDestinationServiceSoapProxy();
    return destinationServiceSoap;
  }
  
  public fr.gtm.bovoyage.service.DestinationDTO[] getAllDestinations() throws java.rmi.RemoteException{
    if (destinationServiceSoap == null)
      _initDestinationServiceSoapProxy();
    return destinationServiceSoap.getAllDestinations();
  }
  
  public java.lang.String create(fr.gtm.bovoyage.service.Destination arg0) throws java.rmi.RemoteException{
    if (destinationServiceSoap == null)
      _initDestinationServiceSoapProxy();
    return destinationServiceSoap.create(arg0);
  }
  
  public java.lang.String update(fr.gtm.bovoyage.service.Destination arg0) throws java.rmi.RemoteException{
    if (destinationServiceSoap == null)
      _initDestinationServiceSoapProxy();
    return destinationServiceSoap.update(arg0);
  }
  
  public java.lang.String delete(long arg0) throws java.rmi.RemoteException{
    if (destinationServiceSoap == null)
      _initDestinationServiceSoapProxy();
    return destinationServiceSoap.delete(arg0);
  }
  
  public fr.gtm.bovoyage.service.DestinationDTO[] getAllValidDestinations() throws java.rmi.RemoteException{
    if (destinationServiceSoap == null)
      _initDestinationServiceSoapProxy();
    return destinationServiceSoap.getAllValidDestinations();
  }
  
  public fr.gtm.bovoyage.service.DatesVoyageDTO[] getDatesVoyageByDestinationId(long arg0) throws java.rmi.RemoteException{
    if (destinationServiceSoap == null)
      _initDestinationServiceSoapProxy();
    return destinationServiceSoap.getDatesVoyageByDestinationId(arg0);
  }
  
  public fr.gtm.bovoyage.service.DestinationDTO findById(long arg0) throws java.rmi.RemoteException{
    if (destinationServiceSoap == null)
      _initDestinationServiceSoapProxy();
    return destinationServiceSoap.findById(arg0);
  }
  
  public void deleteDatesVoyage(long arg0) throws java.rmi.RemoteException{
    if (destinationServiceSoap == null)
      _initDestinationServiceSoapProxy();
    destinationServiceSoap.deleteDatesVoyage(arg0);
  }
  
  
}