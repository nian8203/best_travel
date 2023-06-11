package com.besttravel.domain.entities;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "hotel")
public class HotelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;
	private Integer rating;
	private BigDecimal price;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "hotel")
	private Set<ReservationEntity> reservations;

	public HotelEntity() {
		super();
	}

	public HotelEntity(Long id, String name, String address, Integer rating, BigDecimal price,
			Set<ReservationEntity> reservations) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.rating = rating;
		this.price = price;
		this.reservations = reservations;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Set<ReservationEntity> getReservations() {
		return reservations;
	}

	public void setReservations(Set<ReservationEntity> reservations) {
		this.reservations = reservations;
	}

}
