package com.promineotech.finalProjectApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.finalProjectApi.entity.Address;

	public interface AddressRepository extends CrudRepository<Address, Long> {
		
		
	}
