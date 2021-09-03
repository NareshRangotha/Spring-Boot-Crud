package com.boot.jpa;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.jpa.dao.UserRepository;
import com.boot.jpa.entities.User;

@SpringBootApplication
public class UpdateCrud {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(UpdateCrud.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		User u1 = new User();
		
		Optional<User> optional = userRepository.findById(4);
		User user = optional.get();
		
		user.setName("Deepak");
		user.setCity("Harda");
		User res = userRepository.save(user);
		
		System.out.println(res);
		
	}
}