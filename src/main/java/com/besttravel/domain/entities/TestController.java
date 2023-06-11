package com.besttravel.domain.entities;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.besttravel.domain.repositories.ICustomerRepository;
import com.besttravel.domain.repositories.IFlyRepository;
import com.besttravel.domain.repositories.IHotelRepository;
import com.besttravel.domain.repositories.IReservationRepository;
import com.besttravel.domain.repositories.ITicketRepository;
import com.besttravel.domain.repositories.ITourRepository;

@RestController
@RequestMapping("/api")
public class TestController {
	
	private final IFlyRepository flyRepository;
	private final ITicketRepository ticketRepository;
	private final IHotelRepository hotelRepository;
	private final IReservationRepository reservationRepository;
	private final ITourRepository tourRepository;
	private final ICustomerRepository customerRepository;
	
	public TestController(IFlyRepository flyRepository, 
			ITicketRepository ticketRepository, 
			IHotelRepository hotelRepository,
			IReservationRepository reservationRepository,
			ITourRepository tourRepository,
			ICustomerRepository customerRepository) {
		this.flyRepository = flyRepository;
		this.ticketRepository = ticketRepository;
		this.hotelRepository = hotelRepository;
		this.reservationRepository = reservationRepository;
		this.tourRepository = tourRepository;
		this.customerRepository = customerRepository;
		
	}

	@GetMapping("/fly")
	public ResponseEntity<List<FlyEntity>> getFlies(){
		return ResponseEntity.ok(flyRepository.findAll());
	}
	
	
	@GetMapping("/hotel")
	public ResponseEntity<List<HotelEntity>> getHotels(){
		return ResponseEntity.ok(hotelRepository.findAll());
	}
	
	@GetMapping("/ticket")
	public ResponseEntity<List<TicketEntity>> getTickets(){
		return ResponseEntity.ok(ticketRepository.findAll());
	}
	
	@GetMapping("/reservation")
	public ResponseEntity<List<ReservationEntity>> getReservations(){
		return ResponseEntity.ok(reservationRepository.findAll());
	}
	
	@GetMapping("/tour")
	public ResponseEntity<List<TourEntity>> getTours(){
		return ResponseEntity.ok(tourRepository.findAll());
	}
	
	@GetMapping("/customer")
	public ResponseEntity<List<CustomerEntity>> getCustomer(){
		return ResponseEntity.ok(customerRepository.findAll());
	}
	
	@GetMapping("/less/{price}")
	public ResponseEntity<Set<FlyEntity>> getLessPrice(@PathVariable Integer price){
		return ResponseEntity.ok(flyRepository.selectLessPrice(Integer.valueOf(price)));
	}
	
}
