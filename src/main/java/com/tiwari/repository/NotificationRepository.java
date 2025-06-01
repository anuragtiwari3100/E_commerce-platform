package com.tiwari.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiwari.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
