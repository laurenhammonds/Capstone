package com.teksystems.capstone1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teksystems.capstone1.database.dao.UserDAO;
import com.teksystems.capstone1.database.entity.User;
import com.teksystems.capstone1.security.AuthenticatedUserService;

@Controller
public class AccountController {
	
	
	@Autowired
	private AuthenticatedUserService authenticationService;
	
	@RequestMapping(value = { "/user/account" }, method = RequestMethod.GET)
	public ModelAndView account() {
		ModelAndView response = new ModelAndView();
		response.setViewName("account");

		User user = authenticationService.getCurrentUser();
		response.addObject("user", user);
		
		return response;
	}

}
