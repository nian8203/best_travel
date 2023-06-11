package com.besttravel.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.besttravel.domain.entities.CustomerEntity;

public interface ICustomerRepository extends JpaRepository<CustomerEntity, String> {

}
