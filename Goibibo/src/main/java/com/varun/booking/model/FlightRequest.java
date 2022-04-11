package com.varun.booking.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FlightRequest {
	
	private String source;
	
	private String destination;
	
	private LocalDateTime travelDate;
	
	private LocalDateTime returnDate;
	
	private SeatClass seatClass;
	
	
	
}
