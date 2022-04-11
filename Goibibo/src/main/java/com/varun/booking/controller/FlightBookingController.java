package com.varun.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varun.booking.model.BookingSummary;
import com.varun.booking.model.Flight;
import com.varun.booking.model.FlightRequest;
import com.varun.booking.service.FlightService;
/**
 * 
 * @author kapoorvarun
 *
 *APIs -->
 *      GetFlights(Source, Destination, OneWay/TwoWay, 
 *      			Economy/First Class, Duration, startTime,
 *      			endTime, Price, Cost) 
 *      BookFlight(Json returning a list flights booked)
 *      
 *
 */
@RestController
@RequestMapping("/Goibibo")
public class FlightBookingController {
	
	@Autowired
	private FlightService flightServ; 
	
	@PostMapping("/flights")
	public List<Flight> getFlights(@RequestBody FlightRequest flightReq) {
		return flightServ.getFlights(flightReq);
	}
	
	@PostMapping("/book")
	public BookingSummary getBookingSummary(@RequestBody List<Flight> flightsBooked) {
		return flightServ.getBookingSummary(flightsBooked);
	}
	
}
