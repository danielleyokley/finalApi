package com.promineotech.finalProjectApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.finalProjectApi.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
