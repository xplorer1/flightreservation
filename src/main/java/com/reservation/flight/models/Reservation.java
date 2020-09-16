package com.reservation.flight.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractFields {
	private Boolean checkedIn;
	private Integer numberOfBags;
	private Timestamp created;
	
	@OneToOne
	private Flight flight;
	@OneToOne
	private Passenger passenger;
	
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public Integer getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(Integer numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

}
