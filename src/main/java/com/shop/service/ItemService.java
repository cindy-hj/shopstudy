package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.model.ItemType;
import com.shop.model.Items;
import com.shop.repository.ItemTypeRepository;
import com.shop.repository.ItemsRepository;

@Service
public class ItemService {
	@Autowired
	private ItemTypeRepository itemTypeRepository;
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	public List<Items> getTop() {
		List<ItemType> itemtypes = itemTypeRepository.findByItemType("1");
		List<Integer> itemIds = itemtypes.stream().map(ItemType::getItemId).toList();
		List<Items> items = itemsRepository.findByIdIn(itemIds);
		return items;
	}
	
	public List<Items> getItemSecond() {
		List<ItemType> itemtypes = itemTypeRepository.findByItemType("2");
		List<Integer> itemIds = itemtypes.stream().map(ItemType::getItemId).toList();
		List<Items> items = itemsRepository.findByIdIn(itemIds);
		return items;
	}
	
	// 인기상품
	public List<Items> getItem3() {
		List<ItemType> itemtypes = itemTypeRepository.findByItemType("3");
		List<Integer> itemIds = itemtypes.stream().map(ItemType::getItemId).toList();
		List<Items> items = itemsRepository.findByIdIn(itemIds);
		return items;
	}
	
	// 특가상품
	public List<Items> getItem4() {
		List<ItemType> itemtypes = itemTypeRepository.findByItemType("4");
		List<Integer> itemIds = itemtypes.stream().map(ItemType::getItemId).toList();
		List<Items> items = itemsRepository.findByIdIn(itemIds);
		return items;
	}
	
	// 추천상품
	public List<Items> getItem5() {
		List<ItemType> itemtypes = itemTypeRepository.findByItemType("5");
		List<Integer> itemIds = itemtypes.stream().map(ItemType::getItemId).toList();
		List<Items> items = itemsRepository.findByIdIn(itemIds);
		return items;
	}
	
}
