package com.besttravel;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.besttravel.domain.repositories.IFlyRepository;
import com.besttravel.domain.repositories.IHotelRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class BestTravelApplication implements CommandLineRunner{
	 
	private static Logger log = LoggerFactory.getLogger(BestTravelApplication.class);
	
	@Autowired
	private IFlyRepository flyRepository;
	
	@Autowired
	private IHotelRepository hotelRepository;

	public static void main(String[] args) {
		SpringApplication.run(BestTravelApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	var fly = flyRepository.findById(15L).get();
	var hotel = hotelRepository.findById(5L).get();
	
	log.info(String.valueOf(fly.getAero_line()));
	log.info(String.valueOf(hotel.getName()));
	
}

	

}
