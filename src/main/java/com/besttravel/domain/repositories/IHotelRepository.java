package com.besttravel.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.besttravel.domain.entities.HotelEntity;

public interface IHotelRepository extends JpaRepository<HotelEntity, Long> {

}
