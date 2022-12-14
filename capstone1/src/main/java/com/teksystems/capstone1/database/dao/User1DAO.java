package com.teksystems.capstone1.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teksystems.capstone1.database.entity.User1;

public interface User1DAO extends JpaRepository<User1, Long> {
	
	public User1 findByEmail(String email);
}
