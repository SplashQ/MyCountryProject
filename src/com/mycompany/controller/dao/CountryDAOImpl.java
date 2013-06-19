package com.mycompany.controller.dao;



import java.util.List;




import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import com.mycompany.model.domain.Country;
@Repository
public class CountryDAOImpl implements CountryDAO{

			@Autowired
		    private SessionFactory sessionFactory;

		    @SuppressWarnings("unchecked")
		    public List<Country> getAllCountries() {
		    List<Country> countryList =  sessionFactory.getCurrentSession().createQuery("from Country").list();
				return countryList;
		    }

		   
			public void addCountry(Country country) {
				 sessionFactory.getCurrentSession().save(country);		
			}


			@Override
			public Long getCountryID(String name) {
				Query query = (Query)sessionFactory.getCurrentSession().createQuery("from Country where name = :thisName ");
				query.setParameter("thisName", name );
				List <Country> list = (List <Country>)query.list().get(0);
				Long ID = list.get(0).getId();
				return ID;
			}
	}



