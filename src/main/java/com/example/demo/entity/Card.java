package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Card {
	
	
	
	@Id
	private String cardId;
	
	@Column
	private String Bankname;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Person person;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getBankname() {
		return Bankname;
	}

	public void setBankname(String bankname) {
		Bankname = bankname;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	

}
