package com.bridgelabz.demo.util;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgelabz.demo.model.User;
import com.bridgelabz.demo.repository.UserRepository;

@Component
public class DBWritter implements ItemWriter<User> {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	public DBWritter(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void write(List<? extends User> users) throws Exception {
		System.out.println("Data Saved for Users: " + users);
//		for (User user : users) {
//			System.out.println(user);
//			userRepository.save(user);
//		}
		userRepository.saveAll(users);
	}

}
