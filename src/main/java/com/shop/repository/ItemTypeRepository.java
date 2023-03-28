package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.ItemType;

public interface ItemTypeRepository extends JpaRepository<ItemType, Integer> {

	List<ItemType> findByItemType(String string);

}
