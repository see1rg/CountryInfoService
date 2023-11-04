
package com.see1rg.soap.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This DataFlex Web Service opens up country information. 2 letter ISO codes are used for Country code. There are functions to retrieve the used Currency, Language, Capital City, Continent and Telephone code.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.6
 * Generated source version: 2.2
 *
 * Аннотация @WebServiceClient применяется к классу клиента веб-сервиса и используется для настройки клиента
 * веб-сервиса в Java.В данном случае, аннотация @WebServiceClient(name = "CountryInfoService",
 * targetNamespace = "http://www.oorsprong.org/websamples.countryinfo",
 * wsdlLocation = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?wsdl")
 * указывает следующие настройки:
 * name = "CountryInfoService": Указывает имя веб-сервиса, с которым будет взаимодействовать клиент.
 * targetNamespace = "http://www.oorsprong.org/websamples.countryinfo": Указывает целевое пространство имен веб-сервиса.
 * wsdlLocation = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?wsdl":
 * Указывает расположение WSDL-документа веб-сервиса, который определяет его интерфейс.
 * Эта аннотация позволяет настроить клиент веб-сервиса для взаимодействия с конкретным веб-сервисом, указывая его имя,
 * пространство имен и расположение WSDL-документа.
 */
@WebServiceClient(name = "CountryInfoService", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", wsdlLocation = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?wsdl")
public class CountryInfoService
    extends Service
{

    private static final URL COUNTRYINFOSERVICE_WSDL_LOCATION;
    private static final WebServiceException COUNTRYINFOSERVICE_EXCEPTION;
    private static final QName COUNTRYINFOSERVICE_QNAME = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COUNTRYINFOSERVICE_WSDL_LOCATION = url;
        COUNTRYINFOSERVICE_EXCEPTION = e;
    }

    public CountryInfoService() {
        super(__getWsdlLocation(), COUNTRYINFOSERVICE_QNAME);
    }

    public CountryInfoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COUNTRYINFOSERVICE_QNAME, features);
    }

    public CountryInfoService(URL wsdlLocation) {
        super(wsdlLocation, COUNTRYINFOSERVICE_QNAME);
    }

    public CountryInfoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COUNTRYINFOSERVICE_QNAME, features);
    }

    public CountryInfoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CountryInfoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap() {
        return super.getPort(new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap"), CountryInfoServiceSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap"), CountryInfoServiceSoapType.class, features);
    }

    /**
     * 
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap12")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap12() {
        return super.getPort(new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap12"), CountryInfoServiceSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap12")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap12"), CountryInfoServiceSoapType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COUNTRYINFOSERVICE_EXCEPTION!= null) {
            throw COUNTRYINFOSERVICE_EXCEPTION;
        }
        return COUNTRYINFOSERVICE_WSDL_LOCATION;
    }

}
