package com.teksystems.capstone1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = { "/", "/index", "/homepage.html", "/home" }, method = RequestMethod.GET)
	public ModelAndView homepage() {
		ModelAndView response = new ModelAndView();
		response.setViewName("homepage");
		return response;
	}
}
