package com.jpa.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.user;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository =context.getBean(UserRepository.class);
		user uuser = new user();
		uuser.setName("Sanika hanmant kolekar");
		uuser.setCity("Sangli");
		uuser.setStatus("I am java progrmmer");
		user user1=userRepository.save(uuser);
		System.out.println(user1);
//		user user1=new user();
//		
//		user1.setName("Sejal");
//		user1.setCity("JAt");
//		user1.setStatus("Chatgpt progrrammer");
//		user user2=new user();
//		user2.setName("Rutuja");
//		user2.setCity("Kholapur");
//		user2.setStatus("ppt presenter");
//		
//		List<user> users= List.of(user1,user2);
//		Iterable<user> result=userRepository.saveAll(users);
//		result.forEach(uuser->{
//			System.out.println(uuser);
//		});
		
//		java.util.Optional<user> optional=userRepository.findById(1);
//		user user4=optional.get();
//		 user4.setName("Sanika Kolekar");
//		 user result=userRepository.save(user4);
//		System.out.println(result);
		
//		Iterable<user>itr=userRepository.findAll();
//		Iterator<user> iterator =itr.iterator();
//		while(iterator.hasNext())
//		{
//			user user5=iterator.next();
//			System.out.println(user5);
//		}
//		itr.forEach(user->{System.out.println(user);});
		
//		userRepository.deleteById(52);
//		System.out.println("Dlete succesffuly");
		
//		Iterable<user> alluser=userRepository.findAll();
//		alluser.forEach(user->System.out.println(user));
//	      userRepository.deleteAll(alluser);
		 
		
		
	}

}
