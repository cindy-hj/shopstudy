package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

	List<Items> findByIdIn(List<Integer> itemIds);

}
