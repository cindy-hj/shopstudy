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
@Table(name = "item_type")
public class ItemType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int itemId;
	
	@Column(length = 10)
	private String itemType;
	
	private LocalDateTime date;
	
	private int eventId;
	
	private LocalDateTime addEvent = LocalDateTime.now();
	
	private LocalDateTime modifiedEvent;
}
