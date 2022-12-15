package com.teksystems.capstone1.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teksystems.capstone1.database.entity.User;

public interface UserDAO extends JpaRepository<User, Long> {
	
	public User findById(Integer id);
	public User findByEmail(String email);
}
