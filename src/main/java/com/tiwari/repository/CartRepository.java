package com.tiwari.repository;

import com.tiwari.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository  extends JpaRepository<Cart ,Long> {


}
