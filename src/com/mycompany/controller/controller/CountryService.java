package com.mycompany.controller.controller;

import java.util.List;

import com.mycompany.model.domain.Country;


public interface CountryService {

	   
	    public List <Country> getAllCountries();
	    public void addCountry(Country country);
	    public Long getCountryID(String name);
}
