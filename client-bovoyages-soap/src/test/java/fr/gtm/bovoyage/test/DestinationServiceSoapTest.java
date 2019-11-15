package fr.gtm.bovoyage.test;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.junit.Test;

import fr.gtm.bovoyage.service.DestinationDTO;
import fr.gtm.bovoyage.service.DestinationServiceSoap;
import fr.gtm.bovoyage.service.DestinationServiceSoapServiceLocator;

public class DestinationServiceSoapTest {
	
	private static final String WEB_APPLI = "http://localhost:9080/jboss-bovoyage/DestinationServiceSoap?wsdl";
	
	@Test
	public void testGetAllDestinations() throws ServiceException, RemoteException {
		DestinationServiceSoap service = new DestinationServiceSoapServiceLocator().getDestinationServiceSoapPort();
		DestinationDTO[] destination = service.getAllDestinations();
		assertFalse(destination.length==0);
	}
	
//	@Test
//	public void testGetDatesVoyage() {
//		DestinationServiceSoap service = new DestinationServiceSoapServiceLocator().getDestinationServiceSoapPort();
//		fr.gtm.destination.services.DatesVoyage[] destination = service.getDatesVoyage();
//		assertFalse(destination.length==0);	
//	}

}
