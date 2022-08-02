package com.javatechpractice.springbootprojectpractice;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javatechpractice.springbootprojectpractice.dao.UserRepository;
import com.javatechpractice.springbootprojectpractice.entities.User;


@SpringBootApplication
public class SpringbootprojectpracticeApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringbootprojectpracticeApplication.class, args);
	UserRepository repository = context.getBean(UserRepository.class);
	
//	User user1 = new User();
//	
//	user1.setName("Pratik");
//	user1.setCity("Pune");
//	user1.setStatus("active");
//	
//	User user2 = new User();
//	
//	user2.setName("Amit");
//	user2.setCity("Shivane");
//	user2.setStatus("inactive");
//	
//	List<User> list = List.of(user1, user2);
//	
//	Iterable<User> all = repository.saveAll(list);
//
//	all.forEach(user->{
//		System.out.println(user);
//	});
//	
	
	
//	User savedUser= null;
//	try {
//		Optional<User> optional = repository.findById(4);
//		User user = optional.get();
//		user.setName("Rony");
//		user.setCity("Uttamnagar");
//		user.setStatus("active");
//		repository.save(user);
//	} catch (Exception e) {
//		System.out.println("User does not exists");
//	}
//	
	
//	Iterable<User> results = repository.findAll();
//	
//	results.forEach(user->{
//		System.out.println(user);
//	});
//	
	
	
//	repository.deleteById(2);
//	System.out.println("Deleted Suucccess");
//
	
//	Iterable<User> allUsers = repository.findAll();
//	System.out.println(allUsers);
//	
//	repository.deleteAll();
//	
//	System.out.println("Successfully deleted");
	
	
//	List<User> name = repository.findByName("pratik");
//	name.forEach(user->{
//		System.out.println(user);
//	});
//	
	
//	List<User> list = repository.findByNameAndCity("pratik", "pune");
//	list.forEach(user->{
//		System.out.println(user);
//	});
	
//	List<User> allUser = repository.getAllUser();
//	allUser.forEach(user->{
//		System.out.println(user);
//	});
	
//	List<User> usernames = repository.getUserByName("pratik", "pune");
//	
//	usernames.forEach(user->{
//		System.out.println(user);
//	});
	
	List<User> users = repository.getUsers();
	
	users.forEach(user->{
		System.out.println(user);
	});
	
  }
 	
}
