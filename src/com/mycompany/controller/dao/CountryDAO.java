package com.mycompany.controller.dao;

import java.util.List;

import com.mycompany.model.domain.Country;

public interface CountryDAO {
	public List <Country> getAllCountries();
	public void addCountry(Country country);
	public Long getCountryID(String name);
}
