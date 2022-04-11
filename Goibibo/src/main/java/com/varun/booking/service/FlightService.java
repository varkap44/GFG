package com.varun.booking.service;

import java.util.List;

import com.varun.booking.model.BookingSummary;
import com.varun.booking.model.Flight;
import com.varun.booking.model.FlightRequest;

public interface FlightService {
	
	public List<Flight> getFlights(FlightRequest flightReq);
	
	public BookingSummary getBookingSummary(List<Flight> flightBooked);
}
