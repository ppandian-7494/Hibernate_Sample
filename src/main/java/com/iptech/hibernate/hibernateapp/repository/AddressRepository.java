package com.iptech.hibernate.hibernateapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iptech.hibernate.hibernateapp.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
