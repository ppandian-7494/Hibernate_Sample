package com.iptech.hibernate.hibernateapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iptech.hibernate.hibernateapp.domain.Address;
import com.iptech.hibernate.hibernateapp.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepo;
	
	public Address save (Address address) {
		return addressRepo.save(address);
	}
}