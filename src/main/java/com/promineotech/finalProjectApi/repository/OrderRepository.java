package com.promineotech.finalProjectApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.finalProjectApi.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
