package com.annakhuseinova.springmarket.repositories;

import com.annakhuseinova.springmarket.entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
