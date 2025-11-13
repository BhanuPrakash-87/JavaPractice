package com.javapractice.mypractice;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javapractice.mypractice.immutable.ImmutableUser;

@SpringBootApplication
public class MypracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypracticeApplication.class, args);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "First");
		map.put("2", "Second");
		
		ImmutableUser user = new ImmutableUser("Bhanu Prakash", 27, map);
		System.out.println(user.getUserName());
		System.out.println(user.getAge());
		System.out.println(user.getMetadata());
		
		//user.userName = "Bhanu"; // Compilation error: The field ImmutableUser.userName is not visible
		
		map.put("3", "Third");
		System.out.println(user.getMetadata()); // Remains unchanged due to deep copy in constructor
		
		user.getMetadata().put("4", "Fourth");
		System.out.println(user.getMetadata()); // Remains unchanged due to deep copy in getter
		
		// Attempt to modify the private final variable directly using reflection
		/*
		try {
			Field nameField = ImmutableUser.class.getDeclaredField("userName");
			nameField.setAccessible(true);
			nameField.set(user, "Bhanu");
			System.out.println("user 02 : "+user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

}
