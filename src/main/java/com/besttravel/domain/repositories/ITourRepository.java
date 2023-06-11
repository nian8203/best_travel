package com.besttravel.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.besttravel.domain.entities.TourEntity;

public interface ITourRepository extends JpaRepository<TourEntity, Long> {

}
