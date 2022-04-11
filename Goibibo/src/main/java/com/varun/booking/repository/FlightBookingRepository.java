package com.varun.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.varun.booking.model.Flight;

@Repository
@Transactional
public interface FlightBookingRepository extends JpaRepository<Flight, Long> {

}
