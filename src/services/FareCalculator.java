package services;

import java.time.temporal.ChronoUnit;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code
public class FareCalculator extends Booking{
	Booking b= new Booking();
	
	public double book(Hotel hotel) {
		double totalfare;
		int person= hotel.getNoOfPersons();
		int rates= hotel.getRates();
		long days= ChronoUnit.DAYS.between(hotel.getFromdate(),hotel.getTodate());
		int to =hotel.getFromdate() < hotel.getTodate();
		totalfare= rates* days;
		return totalfare;
		
	}
	public double book(Flight flight) {
		double totalfare;
		totalfare= super.booking(flight.getNoOfPersons(), flight.getRates());
		return totalfare;
	}
	public double book(Train train) {
		double totalfare;
		totalfare=super.booking(train.getNoOfPersons(),train.getRates());
		return totalfare;
	}
	public double book(Bus bus) {
		double totalfare;
		totalfare=super.booking(bus.getNoOfPersons(), bus.getRates());
		return totalfare;
		
	}
	
}