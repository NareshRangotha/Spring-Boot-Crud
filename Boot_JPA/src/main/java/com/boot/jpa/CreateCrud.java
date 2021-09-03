package com.boot.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.jpa.dao.UserRepository;
import com.boot.jpa.entities.User;

@SpringBootApplication
public class CreateCrud {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(CreateCrud.class, args);
		UserRepository userRepository =context.getBean(UserRepository.class);
		
		User u1 = new User();
		u1.setName("Deepak");
		u1.setCity("Bhopal");
		u1.setState("MP");
		
		User u2 = new User();
		u2.setName("Nitesh");
		u2.setCity("Indore");
		u2.setState("MP");
		
		User u3 = new User();
		u3.setName("Pawan");
		u3.setCity("Indore");
		u3.setState("MP");
		
/*		saving single user
//		User result = userRepository.save(u1);  */
		
		List<User> users =new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
//		save Multiple obj
		userRepository.saveAll(users);
		
		System.out.println(users);
	}

}
