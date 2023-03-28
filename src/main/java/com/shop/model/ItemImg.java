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
@Table(name="item_img")
public class ItemImg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int itemId;
	
	@Column(length = 1000)
	private String itemImgPath; // item_img_path
	
	private LocalDateTime addDate=LocalDateTime.now();
	
	private LocalDateTime modifiedDate;
}
