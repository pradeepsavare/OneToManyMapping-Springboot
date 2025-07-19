package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Card;
import com.example.demo.entity.Person;
import com.example.demo.repositiry.PersonRepo;

@SpringBootApplication
public class OneToManyMappingApplication implements CommandLineRunner {
	
	@Autowired
	private PersonRepo repository;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingApplication.class, args);
	}

	@Override
	public void run(String... args) {
		
		Person p1 = new Person();
		p1.setName("deep");
		
		Card c1 = new Card();
		c1.setCardId("SBI00112");
		c1.setBankname("SBI");
		c1.setPerson(p1);
		
		Card c2 = new Card();
		c2.setCardId("CAN0001");
		c2.setBankname("Canera");
		c2.setPerson(p1);
		
		List<Card> card = new ArrayList<>();
		card.add(c1);
		card.add(c2);
		p1.setCards(card);
		
		Person result = repository.save(p1);
		System.out.println("Added" + result);
		System.out.println("Name" + result.getName());
		
	}

}
