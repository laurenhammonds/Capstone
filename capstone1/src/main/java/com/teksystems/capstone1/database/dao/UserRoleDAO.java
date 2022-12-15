package com.teksystems.capstone1.database.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teksystems.capstone1.database.entity.UserRole;

public interface UserRoleDAO extends JpaRepository<UserRole, Long> {
	
		public List<UserRole> findByUserId(Integer userId);
	
}
