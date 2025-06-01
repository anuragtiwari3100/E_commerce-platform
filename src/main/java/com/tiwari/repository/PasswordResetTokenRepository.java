package com.tiwari.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiwari.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
