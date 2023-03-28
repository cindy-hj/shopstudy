package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.Cash;

public interface CashRepository extends JpaRepository<Cash, Integer> {

}
