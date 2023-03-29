package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shop.model.Items;
import com.shop.service.ItemService;

@RestController
@CrossOrigin("*")
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@GetMapping("/api/items/list")
	public ResponseEntity itemsList() {
		List<Items> items = itemService.findAll();
	
		return new ResponseEntity<>(items, HttpStatus.OK);
	}
	
	@GetMapping("/api/items/{id}")
	public ResponseEntity getItem(@PathVariable Integer id) {
		Items item = itemService.findById(id);
		
		return new ResponseEntity<>(item, HttpStatus.OK);
	}
}
