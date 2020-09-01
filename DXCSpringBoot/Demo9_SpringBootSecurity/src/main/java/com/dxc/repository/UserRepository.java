package com.dxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.model.User;

public interface UserRepository extends JpaRepository<com.dxc.model.User, java.lang.Integer> {

	public User findByUsername(String username);
	
}