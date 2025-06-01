package com.tiwari.repository;

import com.tiwari.model.Cart;
import com.tiwari.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tiwari.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
