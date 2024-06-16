package com.github.katohk.sample.doma2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp implements CommandLineRunner{
	
	@Autowired
	DBService service;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MainApp.class);
		app.run(args);
	}

	public void run(String... args) {

		service.dbaccess001();
		service.dbaccess002();
	}

}
