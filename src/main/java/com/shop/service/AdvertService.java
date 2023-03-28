package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.model.Advert;
import com.shop.repository.AdvertRepository;

@Service
public class AdvertService {
	
	@Autowired
	private AdvertRepository advertRepository;
	
	// 메인 광고 읽어오기
	public List<Advert> getAdvertMain(String location) {
		List<Advert> adverts = advertRepository.findByLocation(location);
		return adverts;
	}



}
