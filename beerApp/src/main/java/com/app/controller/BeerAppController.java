package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.entity.Beer;
import com.app.repository.BeerRespositroy;

@Controller
public class BeerAppController {
	
	private Beer lastBeer;
	
	@Autowired
    private BeerRespositroy beerRepository;
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView randomBeer() {
		 
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName("anotherBeer");
		 
		 List<Beer> queryResult;
		 
		 //make sure the next random beer is not same as the last one
		 do {
			 queryResult = beerRepository.findRandBeer();
		 } while (lastBeer != null && queryResult.get(0).getName().equals(lastBeer.getName()));
		
		 lastBeer = queryResult.get(0);
		
		 modelAndView.addObject("name", queryResult.get(0).getName());
		 modelAndView.addObject("description", queryResult.get(0).getDescription());
		 modelAndView.addObject("location", queryResult.get(0).getLocation());
		 modelAndView.addObject("abv", queryResult.get(0).getAbv());
		 
		 return modelAndView;
	}
	

}
