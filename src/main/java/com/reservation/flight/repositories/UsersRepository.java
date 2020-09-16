package com.reservation.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.flight.models.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	Users findByEmail(String email);
}
