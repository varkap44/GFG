package com.varun.booking.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
	
	@NonNull
	private String source;
	
	@NonNull
	private String destination;
	
	@NonNull
	private LocalDateTime startDateTime;
	
	@NonNull
	private LocalDateTime endDateTime;
	
	@JsonIgnore
	@NonNull
	private Integer totalNumberOfSeats;
	
	@NonNull
	@JsonIgnore
	private Integer seatsBooked;
	
	@NonNull
	private Integer seatsAvailable;
	
	@NonNull
	private String airline;
	
	private Boolean isOnWord;
	
	@NonNull
	private Double cost;

}
