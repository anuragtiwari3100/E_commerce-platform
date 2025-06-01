package com.tiwari.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiwari.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
