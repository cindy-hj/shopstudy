package com.shop.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="advert")
public class Advert {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 255)
	private String title;
	
	@Column(length = 4000)	
	private String content;
	
	private LocalDateTime addDate = LocalDateTime.now();
	
	private LocalDateTime modifiedDate;
	
	@Column(length = 1000)
	private String imgPath;
	
	@Column(length = 10)
	private String location;
}
