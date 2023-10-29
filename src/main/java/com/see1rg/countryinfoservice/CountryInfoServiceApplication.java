package com.see1rg.countryinfoservice;

import com.see1rg.soap.client.CountryInfoService;
import com.see1rg.soap.client.CountryInfoServiceSoapType;

public class CountryInfoServiceApplication {
    public static void main(String[] args) {

        CountryInfoService countryInfoService = new CountryInfoService();
        CountryInfoServiceSoapType countryInfoServiceSoapType = countryInfoService.getCountryInfoServiceSoap();
        System.out.println(countryInfoServiceSoapType.capitalCity("RUS"));
    }
}

