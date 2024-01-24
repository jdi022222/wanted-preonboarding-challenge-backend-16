package com.wanted.preonboarding.ticket.infrastructure.repository;

import com.wanted.preonboarding.ticket.domain.entity.Reservation;
import com.wanted.preonboarding.ticket.domain.repository.ReservationRepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaReservationRepository extends JpaRepository<Reservation, Integer>, ReservationRepository {

    Reservation findByNameAndPhoneNumber(String name, String phoneNumber);
}
