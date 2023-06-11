package com.besttravel.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "ticket")
public class TicketEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	private BigDecimal price;
	private LocalDate departure_date;
	private LocalDate arrival_date;
	private LocalDate purchase_date;

	@ManyToOne
	@JoinColumn(name = "fly_id")
	@JsonIgnoreProperties({ "hibernateazyInitializer", "handler" }) // evita errores al lanzar la app
	private FlyEntity fly;

	@ManyToOne
	@JoinColumn(name = "tour_id")
	@JsonIgnoreProperties({ "hibernateazyInitializer", "handler" })
	private TourEntity tour;
//	customer_id
//	tour_id

	public TicketEntity() {
		super();
	}

	public TicketEntity(UUID id, BigDecimal price, LocalDate departure_date, LocalDate arrival_date,
			LocalDate purchase_date, FlyEntity fly, TourEntity tour) {
		super();
		this.id = id;
		this.price = price;
		this.departure_date = departure_date;
		this.arrival_date = arrival_date;
		this.purchase_date = purchase_date;
		this.fly = fly;
		this.tour = tour;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDate getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(LocalDate departure_date) {
		this.departure_date = departure_date;
	}

	public LocalDate getArrival_date() {
		return arrival_date;
	}

	public void setArrival_date(LocalDate arrival_date) {
		this.arrival_date = arrival_date;
	}

	public LocalDate getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(LocalDate purchase_date) {
		this.purchase_date = purchase_date;
	}

	public FlyEntity getFly() {
		return fly;
	}

	public void setFly(FlyEntity fly) {
		this.fly = fly;
	}

	public TourEntity getTour() {
		return tour;
	}

	public void setTour(TourEntity tour) {
		this.tour = tour;
	}

}
