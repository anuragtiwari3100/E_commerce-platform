package com.tiwari.repository;

import com.tiwari.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller,Long> {
   Seller findByEmail(String email);

}
