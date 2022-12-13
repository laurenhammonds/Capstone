package com.teksystems.capstone1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teksystems.capstone1.database.dao.UserDAO;
import com.teksystems.capstone1.database.dao.UserRoleDAO;
import com.teksystems.capstone1.database.entity.User;
import com.teksystems.capstone1.database.entity.UserRole;
import com.teksystems.capstone1.form.CreateUserForm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {
	
	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private UserRoleDAO userRoleDao;
	
	@Autowired
	@Qualifier("passwordEncoder")
	private PasswordEncoder passwordEncoder;
	
	// this method is request mapping to show the actual login JSP page.
	// the URL here in the mapping is the same URL configured in spring security .loginPage
	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView response = new ModelAndView();
		response.setViewName("login_pages/login");
		return response;
	}
	
	
	@RequestMapping(value = "/user/createuser" , method = RequestMethod.GET)
	public ModelAndView createUser() {
		ModelAndView response = new ModelAndView();
		response.setViewName("login_pages/create_user");
		
		log.info("This is in the GET method for create user");
		return response;
	}
		
	@RequestMapping(value = "/user/createuser", method = RequestMethod.POST)
	public ModelAndView createUserSubmit(@Valid CreateUserForm form, BindingResult bindingResult) {
		ModelAndView response = new ModelAndView();
		response.setViewName("login_pages/create_user");
		log.info("This is in the POST method for create user");
		
//		log.debug(form.toString());
		
		for ( ObjectError e: bindingResult.getAllErrors()) {
			log.info(e.getObjectName() + " : " + e.getDefaultMessage());
		}
		
		if (!form.getPassword().equals(form.getConfirmPassword())) {
			bindingResult.rejectValue("password", "error.user", "Passwords much match");
		}
		
		if ( !bindingResult.hasErrors()) {
		User user = new User();
		
		user.setFirstName(form.getFirstName());
		user.setLastName(form.getLastName());
		user.setEmail(form.getEmail());
		user.setPassword(form.getPassword());
		user.setAddress(form.getAddress());
		user.setCity(form.getCity());
		user.setState(form.getState());
		user.setZip(form.getZip());
		user.setPhone(form.getPhone());
		
		String encodedPassword = passwordEncoder.encode(form.getPassword());
		user.setPassword(encodedPassword);
		
		userDao.save(user);
		
		UserRole ur = new UserRole();
		ur.setRoleName("USER");
		ur.setUserId(user.getId());
		
		userRoleDao.save(ur);
		response.setViewName("login_pages/login");
		
	} else {
		response.addObject("bindingResult", bindingResult);
		response.addObject("form", form);
	}
		
		return response;
	}
}