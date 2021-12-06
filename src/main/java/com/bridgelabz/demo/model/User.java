package com.bridgelabz.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	private Integer id;
	private String name;
	private String dept;
	private Integer salary;
	private Date time;

	public User(Integer id, String name, String dept, Integer salary, Date time) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.time = time;
	}

	public User() {
	}

}
