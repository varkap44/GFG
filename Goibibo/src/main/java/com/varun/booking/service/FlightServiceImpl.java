package com.varun.booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.varun.booking.model.BookingSummary;
import com.varun.booking.model.Flight;
import com.varun.booking.model.FlightRequest;

@Service
public class FlightServiceImpl implements FlightService{
	
	public List<Flight> getFlights(FlightRequest flightReq) {
		
		List<Flight> fl = getFlightsFromStore(flightReq);
		
		return fl;
		
	}
	
	private List<Flight> getFlightsFromStore(FlightRequest flightReq) {
		List<Flight> fl = new ArrayList<>();
		Flight f = new Flight();
		f.setSource(flightReq.getSource());
		f.setDestination(flightReq.getDestination());
		f.setStartDateTime(flightReq.getTravelDate().plusHours(7));
		f.setEndDateTime(flightReq.getTravelDate().plusHours(5));
		f.setTotalNumberOfSeats(200);
		f.setSeatsBooked(150);
		f.setSeatsAvailable(f.getTotalNumberOfSeats() - f.getSeatsBooked());
		f.setAirline("Air India");
		f.setIsOnWord(true);
		f.setCost(2500.00);
		fl.add(f);
		
		if (flightReq.getReturnDate() != null) {
			Flight fr = new Flight();
			fr.setSource(flightReq.getDestination());
			fr.setDestination(flightReq.getSource());
			fr.setStartDateTime(flightReq.getReturnDate().plusHours(6));
			fr.setEndDateTime(flightReq.getReturnDate().plusHours(9));
			fr.setTotalNumberOfSeats(200);
			fr.setSeatsBooked(150);
			fr.setSeatsAvailable(f.getTotalNumberOfSeats() - f.getSeatsBooked());
			fr.setAirline("Air India");
			fr.setIsOnWord(false);
			fr.setCost(2700.00);
			fl.add(fr);
		}
		
		
		Flight f1 = new Flight();
		f1.setSource(flightReq.getSource());
		f1.setDestination(flightReq.getDestination());
		f1.setStartDateTime(flightReq.getTravelDate().plusHours(7));
		f1.setEndDateTime(flightReq.getTravelDate().plusHours(12));
		f1.setTotalNumberOfSeats(200);
		f1.setSeatsBooked(150);
		f1.setSeatsAvailable(f.getTotalNumberOfSeats() - f.getSeatsBooked());
		f1.setAirline("Air India");
		f1.setIsOnWord(true);
		f1.setCost(2500.00);
		fl.add(f1);
		
		if (flightReq.getReturnDate() != null) {
			Flight fr1 = new Flight();
			fr1.setSource(flightReq.getDestination());
			fr1.setDestination(flightReq.getSource());
			fr1.setStartDateTime(flightReq.getReturnDate().plusHours(6));
			fr1.setEndDateTime(flightReq.getReturnDate().plusHours(9));
			fr1.setTotalNumberOfSeats(200);
			fr1.setSeatsBooked(150);
			fr1.setSeatsAvailable(f.getTotalNumberOfSeats() - f.getSeatsBooked());
			fr1.setAirline("Air India");
			fr1.setIsOnWord(false);
			fr1.setCost(3500.00);
			fl.add(fr1);
		}
		return fl;
	}

	public BookingSummary getBookingSummary(List<Flight> flightsBooked) {
		
		Double total = flightsBooked
									.stream()
									.map(f -> f.getCost())
									.reduce(0.0, Double::sum);
		BookingSummary bs = new BookingSummary(flightsBooked, total);
		
		return bs;
		
	}
}
