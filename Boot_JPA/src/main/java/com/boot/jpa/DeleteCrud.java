package com.boot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.jpa.dao.UserRepository;
import com.boot.jpa.entities.User;

@SpringBootApplication
public class DeleteCrud {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DeleteCrud.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
/*		DELETE single data
		userRepository.deleteById(9);
		System.out.println("DELETE....!");
*/
		
		Iterable<User> all = userRepository.findAll();
		all.forEach(user->{System.out.println(user);});
		
		userRepository.deleteAll(all);
		
	}

}
