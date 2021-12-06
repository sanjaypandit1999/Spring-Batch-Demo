package com.bridgelabz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
