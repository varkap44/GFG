package com.varun.booking.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "Flight")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String Id;
	
	@NonNull
	@Column(name = "source")
	private String source;
	
	@NonNull
	@Column(name = "destination")
	private String destination;
	
	@NonNull
	@Column(name = "startDateTime")
	private LocalDateTime startDateTime;
	
	@Column(name = "endDateTime")
	private LocalDateTime endDateTime;
	
	@NonNull
	@Column(name = "isOnWard")
	private Boolean isOnWard;
	
	@NonNull
	@Column(name = "totalNumberOfSeats")
	private Double cost;
	
	@NonNull
	@JsonIgnore
	@Column(name = "totalNumberOfSeats")
	private Integer totalNumberOfSeats;
	
	@NonNull
	@JsonIgnore
	@Column(name = "seatsBooked")
	private Integer seatsBooked;
	
	@NonNull
	@Column(name = "seatsAvailable")
	private Integer seatsAvailable;
	
	@NonNull
	@Column(name = "airline")
	private String airline;

}
