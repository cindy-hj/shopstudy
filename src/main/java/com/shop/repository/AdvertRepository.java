package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.Advert;

public interface AdvertRepository extends JpaRepository<Advert, Integer> {

	List<Advert> findByLocation(String location);

}
