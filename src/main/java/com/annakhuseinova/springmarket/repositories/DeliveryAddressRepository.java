package com.annakhuseinova.springmarket.repositories;

import com.annakhuseinova.springmarket.entities.DeliveryAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DeliveryAddressRepository extends CrudRepository<DeliveryAddress, Long> {

    List<DeliveryAddress> findAllByUserId(Long userId);
}
