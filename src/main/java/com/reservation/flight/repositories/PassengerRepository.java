package com.reservation.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.flight.models.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}