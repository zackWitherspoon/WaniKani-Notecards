package com.wanikani.notecards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotecardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotecardsApplication.class, args);

		System.out.println("Hello? Can you read me?");
	}
}
