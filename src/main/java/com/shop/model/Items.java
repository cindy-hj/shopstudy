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
@Table(name = "items")
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 50)
	private String prodName;
	
	private int prodPrice;

	@Column(length = 255)
	private String prodComp;
	
	private int prodDiscountPer;

	@Column(length = 100)
	private String prodKind;

	@Column(length = 4000)
	private String prodContent;

	@Column(length = 255)
	private String prodVolume;
	
	private LocalDateTime prodUseDate;

	@Column(length = 100)
	private String prodIngredient;
	
	private LocalDateTime prodAddDate;
}
