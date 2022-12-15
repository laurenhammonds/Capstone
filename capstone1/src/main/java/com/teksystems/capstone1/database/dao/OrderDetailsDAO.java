package com.teksystems.capstone1.database.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.teksystems.capstone1.database.entity.Order;
import com.teksystems.capstone1.database.entity.OrderDetails;

public interface OrderDetailsDAO extends JpaRepository<Order, Long> {
	
	public Order findByUserId(Integer Id);
	
	

}
