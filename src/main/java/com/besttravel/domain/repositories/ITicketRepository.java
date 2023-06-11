package com.besttravel.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.besttravel.domain.entities.TicketEntity;

public interface ITicketRepository extends JpaRepository<TicketEntity, UUID> {

}
