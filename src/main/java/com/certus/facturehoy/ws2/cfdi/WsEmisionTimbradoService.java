
package com.certus.facturehoy.ws2.cfdi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WsEmisionTimbradoService", targetNamespace = "http://cfdi.ws2.facturehoy.certus.com/", wsdlLocation = "http://173.201.18.113:9999/CFDI/WsEmisionTimbrado?WSDL")
public class WsEmisionTimbradoService
    extends Service
{

    private final static URL WSEMISIONTIMBRADOSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSEMISIONTIMBRADOSERVICE_EXCEPTION;
    private final static QName WSEMISIONTIMBRADOSERVICE_QNAME = new QName("http://cfdi.ws2.facturehoy.certus.com/", "WsEmisionTimbradoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://173.201.18.113:9999/CFDI/WsEmisionTimbrado?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSEMISIONTIMBRADOSERVICE_WSDL_LOCATION = url;
        WSEMISIONTIMBRADOSERVICE_EXCEPTION = e;
    }

    public WsEmisionTimbradoService() {
        super(__getWsdlLocation(), WSEMISIONTIMBRADOSERVICE_QNAME);
    }

    public WsEmisionTimbradoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSEMISIONTIMBRADOSERVICE_QNAME, features);
    }

    public WsEmisionTimbradoService(URL wsdlLocation) {
        super(wsdlLocation, WSEMISIONTIMBRADOSERVICE_QNAME);
    }

    public WsEmisionTimbradoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSEMISIONTIMBRADOSERVICE_QNAME, features);
    }

    public WsEmisionTimbradoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsEmisionTimbradoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsEmisionTimbrado
     */
    @WebEndpoint(name = "WsEmisionTimbradoPort")
    public WsEmisionTimbrado getWsEmisionTimbradoPort() {
        return super.getPort(new QName("http://cfdi.ws2.facturehoy.certus.com/", "WsEmisionTimbradoPort"), WsEmisionTimbrado.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsEmisionTimbrado
     */
    @WebEndpoint(name = "WsEmisionTimbradoPort")
    public WsEmisionTimbrado getWsEmisionTimbradoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cfdi.ws2.facturehoy.certus.com/", "WsEmisionTimbradoPort"), WsEmisionTimbrado.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSEMISIONTIMBRADOSERVICE_EXCEPTION!= null) {
            throw WSEMISIONTIMBRADOSERVICE_EXCEPTION;
        }
        return WSEMISIONTIMBRADOSERVICE_WSDL_LOCATION;
    }

}
