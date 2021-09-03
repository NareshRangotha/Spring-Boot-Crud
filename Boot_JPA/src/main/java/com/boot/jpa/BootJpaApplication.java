package com.boot.jpa;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.jpa.dao.UserRepository;
import com.boot.jpa.entities.User;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootJpaApplication.class, args);
		UserRepository userRepository =context.getBean(UserRepository.class);
		
		User u1 = new User();
		u1.setName("Naresh");
		u1.setCity("Ratlam");
		u1.setState("MP");
		
		User user = userRepository.save(u1);
		
		System.out.println(user);
	}

}
