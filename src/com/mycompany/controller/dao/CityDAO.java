package com.mycompany.controller.dao;

import java.util.List;

import com.mycompany.model.domain.City;


public interface CityDAO {
	public List <City> getAllCities();
	public void addCity(City city);
	public List<City> searchCitiesById(int ID);
}
