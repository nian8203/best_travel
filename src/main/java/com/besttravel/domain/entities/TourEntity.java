package com.besttravel.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tour")
public class TourEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public TourEntity() {
		super();
	}

	public TourEntity(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
//	private Set<ReservationEntity> reservations;
//	private Set<TicketEntity> tickets;
//	private CustomerEntity customer;	
	
	

}
