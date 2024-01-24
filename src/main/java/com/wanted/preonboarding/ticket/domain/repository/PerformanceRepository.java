package com.wanted.preonboarding.ticket.domain.entity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PerformanceRepository {

	Optional<Performance> findById(UUID UUID);

	List<Performance> findByIsReserve(String isReserve);

	Performance findByName(String name);
}
