package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.BNews;

public interface BNewsRepository extends JpaRepository<BNews, Integer> {

}
