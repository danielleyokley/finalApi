package com.promineotech.finalProjectApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.finalProjectApi.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

