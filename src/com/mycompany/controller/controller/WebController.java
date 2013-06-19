package com.mycompany.controller.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.model.domain.City;
import com.mycompany.model.domain.Country;

@Controller
@RequestMapping("/welcome")
public class WebController{
	@Autowired
	CityService ciserv;
	@Autowired
	CountryService coserv;
	@RequestMapping("/index")
	public String index(){
		return "redirect:/index.jsp";
	}
	@RequestMapping(value="/add/city", method = RequestMethod.GET)
	public ModelAndView selectCountry(){
		ModelAndView model = new ModelAndView("addcity", "city", new City());
		model.addObject("countries", coserv.getAllCountries());
		return model;
	}
	@RequestMapping( value = "/{id}", method = RequestMethod.GET)
	public ModelAndView handleRequest(@PathVariable("id") int ID, HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView("successcitysearch");
		modelAndView.addObject("cityListByID",  ciserv.searchCityById(ID));
 
		return modelAndView;
	}
	@RequestMapping(value="/list/country", method=RequestMethod.GET)
	public ModelAndView countryList(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
 
		ModelAndView modelAndView = new ModelAndView("countrylist");
		modelAndView.addObject("countryList", coserv.getAllCountries());
		
 
		return modelAndView;
	}
	@RequestMapping(value="/list/city", method=RequestMethod.GET)
	public ModelAndView cityList(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
 
		ModelAndView modelAndView = new ModelAndView("citylist");
		modelAndView.addObject("cityList", ciserv.getAllCities());
		
 
		return modelAndView;
	}
	@RequestMapping(value="add/savecity", method=RequestMethod.POST)
	public String processSubmit(
			@ModelAttribute("city") City city,
			BindingResult result, SessionStatus status) {
			ciserv.addCity(city);
			return "redirect:/index.jsp";
	 
		}
	@RequestMapping(value="/add/country", method = RequestMethod.GET)
	public ModelAndView countryform(){
		ModelAndView model = new ModelAndView("addcountry", "country", new Country());
		return model;
	}
	@RequestMapping(value="add/savecountry", method=RequestMethod.POST)
	public String processSubmit(
			@ModelAttribute("country") Country country,
			BindingResult result, SessionStatus status) {
			coserv.addCountry(country);
			return "redirect:/index.jsp";
	 
		}

}