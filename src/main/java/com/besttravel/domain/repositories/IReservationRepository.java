package com.besttravel.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.besttravel.domain.entities.ReservationEntity;

public interface IReservationRepository extends JpaRepository<ReservationEntity, UUID> {

}
