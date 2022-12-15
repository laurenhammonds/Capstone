package com.teksystems.capstone1.database.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.teksystems.capstone1.database.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long> {
	
public Order findById(Integer Id);
	
	@Query(value = "select o from Order o where o.user.id = :userId")
	public List<Order> findByUserId(Integer userId);
	
//	@Query(value="select * from order o join order_details od on o.id = od.order_id join user u on u.id = od.user_id where u.id = :userId", nativeQuery = true)
//	public List<Order> findOrderByUserId(Integer userId);
	
	@Query(value = "SELECT * FROM order WHERE product_id = :productId", nativeQuery = true)
	public List<Order> findByProductId(@Param("productId") Integer productId);
	

}
