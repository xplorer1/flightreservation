package com.reservation.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.flight.models.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
