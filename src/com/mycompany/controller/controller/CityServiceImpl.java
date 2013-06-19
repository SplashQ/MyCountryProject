package com.mycompany.controller.controller;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.mycompany.controller.dao.CityDAOImpl;
import com.mycompany.model.domain.City;

 
@Service
public class CityServiceImpl implements CityService {
 
    @Autowired
    public CityDAOImpl cityDAO;
     

 
    @Transactional
    public List<City> getAllCities() {
 
        return cityDAO.getAllCities();
    }


    @Transactional
	public void addCity(City city) {
		  cityDAO.addCity(city);
	}


	@Transactional
	public List<City> searchCityById(int ID) {
		List <City> list = cityDAO.searchCitiesById(ID);
		return list;
	}
 

}