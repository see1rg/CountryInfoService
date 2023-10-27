package com.see1rg.countryinfoservice;

import jakarta.annotation.PostConstruct;
import org.oorsprong.websamples_countryinfo.countryinfoservice_wso.listofcountry.Capital;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

@Component
public class CapitalCityRepository {
    private static final Map<String, Capital> capitalCities = new HashMap<>();

    @PostConstruct
    public void initData() {

        String russia = "Russia";
        capitalCities.put(russia, Capital.MOSCOW);

        String poland = "Poland";
        capitalCities.put(poland, Capital.WARSAW);

        String taiwan = "Taiwan";
        capitalCities.put(taiwan, Capital.TAIPEI);

        String nepal = "Nepal";
        capitalCities.put(nepal, Capital.KATHMANDU);
    }

    public Capital findCapital(String name) {
        Assert.notNull(name, "The capital's name must not be null");
        return capitalCities.get(name);
    }
}
