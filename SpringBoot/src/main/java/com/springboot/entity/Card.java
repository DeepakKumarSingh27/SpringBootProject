package com.springboot.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Card {
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

	private int cardId;
	@ManyToMany
	List<Product> products;

	@OneToOne(mappedBy = "card")
	 User user;
	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

}