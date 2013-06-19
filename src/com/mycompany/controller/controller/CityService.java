package com.mycompany.controller.controller;

import java.util.List;

import com.mycompany.model.domain.City;




public interface CityService {

	   
	    public List <City> getAllCities();
	    public void addCity(City city);
	    public List <City> searchCityById(int ID);
}
