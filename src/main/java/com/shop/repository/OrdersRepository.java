package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
