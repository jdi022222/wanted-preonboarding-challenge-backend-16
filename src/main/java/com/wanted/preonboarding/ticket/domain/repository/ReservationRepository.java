package com.wanted.preonboarding.ticket.domain.entity;

import org.springframework.data.repository.Repository;

public interface ReservationRepository extends Repository<Reservation, Integer> {
	Reservation findByNameAndPhoneNumber(String name, String phoneNumber);

	Reservation save(Reservation reservation);
}
