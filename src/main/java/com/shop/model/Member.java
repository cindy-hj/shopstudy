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
@Table(name = "member")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 100, unique = true)
	private String idName;

	@Column(length = 100)	
	private String password;
	
	@Column(length = 13)
	private String tel;
	
	@Column(length = 255)
	private String address1;
	
	@Column(length = 255)
	private String address2;
	
	@Column(length = 10)
	private String type;
	
	@Column(length = 1000)
	private String imgPath;
}
