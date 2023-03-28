package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.model.Event;
import com.shop.repository.EventRepository;

@Service
public class EventService {
	@Autowired
	private EventRepository eventRepository;
	
	public List<Event> getEvents(String location) {
		List<Event> events = eventRepository.findByLocation(location);
		return events;
	}
}
