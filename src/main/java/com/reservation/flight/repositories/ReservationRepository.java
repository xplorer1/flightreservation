package com.reservation.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.flight.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}