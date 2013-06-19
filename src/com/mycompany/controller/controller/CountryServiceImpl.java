package com.mycompany.controller.controller;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.controller.dao.CountryDAOImpl;
import com.mycompany.model.domain.Country;
 

 
@Service
public class CountryServiceImpl implements CountryService {
 
    @Autowired
    public CountryDAOImpl countryDAO;
     

 
    @Transactional
    public List<Country> getAllCountries() {
 
        return countryDAO.getAllCountries();
    }


    @Transactional
	public void addCountry(Country country) {
		  countryDAO.addCountry(country);
	}


	@Transactional
	public Long getCountryID(String name) {
		
		return countryDAO.getCountryID(name);
	}
 

}
