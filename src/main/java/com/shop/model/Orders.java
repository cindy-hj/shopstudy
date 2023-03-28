package com.shop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int memberId;
	
	@Column(length = 50)
	private String name;

	@Column(length = 500)
	private String address;
	
	@Column(length = 10)
	private String payment;
	
	@Column(length = 16)
	private String cardNumber;
	
	@Column(length = 500)
	private String items;
}
