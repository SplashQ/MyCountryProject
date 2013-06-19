
package com.mycompany.controller.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.model.domain.City;

@Repository
public class CityDAOImpl implements CityDAO{

	@Autowired
	SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public List<City> getAllCities() {
		List<City> cityList = sessionFactory.getCurrentSession().createQuery("from City").list();
		return cityList;
	}

	@Override
	public void addCity(City city) {
		sessionFactory.getCurrentSession().save(city);
	}

	@Override
	public List<City> searchCitiesById(int ID) {
		Query query = (Query)sessionFactory.getCurrentSession().createQuery("from City where id_country = :thisID ");
		query.setParameter("thisID", ID );
		List <City> list = (List <City>)query.list();
		return list;
	}

			
	}

