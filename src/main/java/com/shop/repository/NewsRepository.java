package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.News;

public interface NewsRepository extends JpaRepository<News, Integer> {

}
