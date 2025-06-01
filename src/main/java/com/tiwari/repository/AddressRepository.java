package com.tiwari.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiwari.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
