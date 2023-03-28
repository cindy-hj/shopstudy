package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

	List<Event> findByLocation(String location);

}
