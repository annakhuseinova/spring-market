package com.annakhuseinova.springmarket.repositories;

import com.annakhuseinova.springmarket.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByUserName(String userName);
}
