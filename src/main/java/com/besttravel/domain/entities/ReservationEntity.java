package com.besttravel.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "reservation")
public class ReservationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	private LocalDateTime date_reservation;
	private LocalDate date_start;
	private LocalDate date_end;
	private Integer total_days;
	private BigDecimal price;
//	private  tour_id;
//	hotel_id
//	customer_id

	@ManyToOne
	@JoinColumn(name = "hotel_id")
	private HotelEntity hotel;

	@ManyToOne
	@JoinColumn(name = "tour_id", nullable = true)
	private TourEntity tour;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;

	public ReservationEntity() {
		super();
	}

	public ReservationEntity(UUID id, LocalDateTime date_reservation, LocalDate date_start, LocalDate date_end,
			Integer total_days, BigDecimal price, HotelEntity hotel, TourEntity tour, CustomerEntity customer) {
		super();
		this.id = id;
		this.date_reservation = date_reservation;
		this.date_start = date_start;
		this.date_end = date_end;
		this.total_days = total_days;
		this.price = price;
		this.hotel = hotel;
		this.tour = tour;
		this.customer = customer;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDateTime getDate_reservation() {
		return date_reservation;
	}

	public void setDate_reservation(LocalDateTime date_reservation) {
		this.date_reservation = date_reservation;
	}

	public LocalDate getDate_start() {
		return date_start;
	}

	public void setDate_start(LocalDate date_start) {
		this.date_start = date_start;
	}

	public LocalDate getDate_end() {
		return date_end;
	}

	public void setDate_end(LocalDate date_end) {
		this.date_end = date_end;
	}

	public Integer getTotal_days() {
		return total_days;
	}

	public void setTotal_days(Integer total_days) {
		this.total_days = total_days;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public HotelEntity getHotel() {
		return hotel;
	}

	public void setHotel(HotelEntity hotel) {
		this.hotel = hotel;
	}

	public TourEntity getTour() {
		return tour;
	}

	public void setTour(TourEntity tour) {
		this.tour = tour;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

}
