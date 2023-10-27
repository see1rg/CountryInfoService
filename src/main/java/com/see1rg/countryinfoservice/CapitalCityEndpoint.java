package com.see1rg.countryinfoservice;

import org.oorsprong.websamples_countryinfo.countryinfoservice_wso.listofcountry.GetCapitalRequest;
import org.oorsprong.websamples_countryinfo.countryinfoservice_wso.listofcountry.GetCapitalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CapitalCityEndpoint {
    private static final String NAMESPACE_URI = "http://www.oorsprong.org/websamples.countryinfo";

    private CapitalCityRepository capitalCityRepository;

    @Autowired
    public CapitalCityEndpoint(CapitalCityRepository capitalCityRepository) {
        this.capitalCityRepository = capitalCityRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCapitalResponse getCountry(@RequestPayload GetCapitalRequest request) {
        GetCapitalResponse response = new GetCapitalResponse();
        response.setCapital(capitalCityRepository.findCapital(request.getName()));

        return response;
    }
}