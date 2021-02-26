package com.edumotter.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edumotter.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
