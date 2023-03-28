package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.CashHistory;

public interface CashHistoryRepository extends JpaRepository<CashHistory, Integer> {

}
