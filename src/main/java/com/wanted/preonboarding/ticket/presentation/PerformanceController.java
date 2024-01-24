package com.wanted.preonboarding.ticket.presentation;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanted.preonboarding.core.domain.response.ResponseHandler;
import com.wanted.preonboarding.ticket.application.TicketSeller;
import com.wanted.preonboarding.ticket.domain.dto.PerformanceInfo;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/query")
@RequiredArgsConstructor
public class QueryController {
	private final TicketSeller ticketSeller;

	@GetMapping("/all/performance")
	public ResponseEntity<ResponseHandler<List<PerformanceInfo>>> getAllPerformanceInfoList() {
		System.out.println("getAllPerformanceInfoList");
		return ResponseEntity
			.ok()
			.body(ResponseHandler.<List<PerformanceInfo>>builder()
				.statusCode(HttpStatus.OK)
				.message("Success")
				.data(ticketSeller.getAllPerformanceInfoList())
				.build()
			);
	}
}