package com.h2.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.h2.domain.Subscriber;
import com.h2.domain.SubscriberRepository;

@SpringBootApplication
public class H2demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(H2demo1Application.class, args);
	}
	
	CommandLineRunner runner(SubscriberRepository repository) {
		return args -> {
			repository.save(new Subscriber("Hemraj", "Sharma", "test@test.com"));
		};
	}

}
