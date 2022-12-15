package com.teksystems.capstone1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teksystems.capstone1.database.dao.ProductDAO;
import com.teksystems.capstone1.database.entity.Product;

@Controller
public class SearchController {
	
	@Autowired
	private ProductDAO productDao;
	
	@RequestMapping(value = { "/search", "/search.html" }, method = RequestMethod.GET)
	public ModelAndView search(@RequestParam(required = false) String productName) {

		ModelAndView response = new ModelAndView();
		response.setViewName("search");

		response.addObject("productName", productName);

		List<Product> products = productDao.findByNameContainingIgnoreCase(productName);
		response.addObject("products", products);

		return response;
	}
}

