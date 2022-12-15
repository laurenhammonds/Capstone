package com.teksystems.capstone1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teksystems.capstone1.database.dao.OrderDAO;
import com.teksystems.capstone1.database.dao.ProductDAO;
import com.teksystems.capstone1.database.entity.Order;
import com.teksystems.capstone1.database.entity.Product;
import com.teksystems.capstone1.database.entity.User;
import com.teksystems.capstone1.security.AuthenticatedUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class OrdersController {
	
	@Autowired
	private OrderDAO orderDao;
	
	@Autowired
	private ProductDAO productDao;
	
	@Autowired
	private AuthenticatedUserService authenticationService;
	
	
//	@RequestMapping(value = {"/orders"}, method = RequestMethod.GET)
//	public ModelAndView viewOrders() { 
//		ModelAndView response = new ModelAndView();
//		response.setViewName("orderhistory");
//		
//		User user = authenticationService.getCurrentUser();
//		response.addObject("user", user);
//		
//		List <Order> orders = orderDao.findOrderByUserId(user.getId());
//					
//		response.addObject("orders", orders);
//
//		return response;
//		
//	}
//	
//	
//	@RequestMapping(value = { "/order/addOrder" }, method = RequestMethod.GET)
//	public ModelAndView createOrder(@PathVariable Integer id) {
//		
//		ModelAndView response = new ModelAndView();
//		response.setViewName("/cart");
//		Product product = productDao.findById(id);
//		
//		response.addObject("product", product);
//		response.addObject("order", orderDao.findByProductId(id));
//		response.addObject("user", authenticationService.getCurrentUser());
//		
//		return response;
//	}
}
