package com.boot.jpa;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.jpa.dao.UserRepository;
import com.boot.jpa.entities.User;

@SpringBootApplication
public class FetchCrud {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FetchCrud.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
/*		Fetch Single data
 *      Optional<User> optional = userRepository.findById(1);
		User user = optional.get();
		System.out.println(user);
*/		
		
		Iterable<User> itr = userRepository.findAll();
		itr.forEach(user->{System.out.println(user);});
		
	}

}
