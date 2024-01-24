package com.wanted.preonboarding.ticket.infrastructure.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanted.preonboarding.ticket.domain.entity.Performance;
import com.wanted.preonboarding.ticket.domain.repository.PerformanceRepository;

public interface JpaPerformanceRepository extends JpaRepository<Performance, UUID>, PerformanceRepository {

	List<Performance> findByIsReserve(String isReserve);

	Performance findByName(String name);
}
