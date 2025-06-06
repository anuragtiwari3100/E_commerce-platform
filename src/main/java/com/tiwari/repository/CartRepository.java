package com.tiwari.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiwari.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Cart findByUserId(Long userId);
}
