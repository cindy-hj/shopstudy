package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.model.Advert;
import com.shop.model.Event;
import com.shop.model.Items;
import com.shop.service.AdvertService;
import com.shop.service.EventService;
import com.shop.service.ItemService;

@RestController
@CrossOrigin("*")
public class MainPageController {
	@Autowired
	private ItemService itemService;
	@Autowired
	private AdvertService advertService;
	@Autowired
	private EventService eventService;
	
	@GetMapping("/api/items/gettop")
	public ResponseEntity getTop() {
		List<Items> items = itemService.getTop();
		return new ResponseEntity<>(items, HttpStatus.OK);
	}
	
	@GetMapping("/api/items/getsecond") 
	public ResponseEntity getSecond() {
		List<Items> items = itemService.getItemSecond();
		return new ResponseEntity<>(items, HttpStatus.OK);
	}
	
	// 인기상품
	@GetMapping("/api/items/getitem3")
	public ResponseEntity getItem3() {
		List<Items> items = itemService.getItem3();
		return new ResponseEntity<>(items, HttpStatus.OK);
	}
	
	// 특가상품
	@GetMapping("/api/items/getitem4")
	public ResponseEntity getItem4() {
		List<Items> items = itemService.getItem4();
		return new ResponseEntity<>(items, HttpStatus.OK);
	}
	
	// 추천상품
	@GetMapping("/api/items/getitem5")
	public ResponseEntity getItem5() {
		List<Items> items = itemService.getItem5();
		return new ResponseEntity<>(items, HttpStatus.OK);
	}
	
	// 광고상품
	@GetMapping("/api/items/adverts") 
	public ResponseEntity getMainAdverts() {
		List<Advert> adverts = advertService.getAdvertMain("1");
		return new ResponseEntity<>(adverts, HttpStatus.OK);
	}
	
	@GetMapping("/api/main/events")
	public ResponseEntity getMainEvents() {
		List<Event> events = eventService.getEvents("1");
		return new ResponseEntity<>(events, HttpStatus.OK);
	}
}
