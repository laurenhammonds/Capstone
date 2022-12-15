package com.teksystems.capstone1.database.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teksystems.capstone1.database.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Long> {
	public Product findById(Integer id);
	
	@Query("select p from Product p where p.productName like %:productName%")
	public List<Product> findByNameContainingIgnoreCase(String productName);

}
