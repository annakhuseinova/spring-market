package com.annakhuseinova.springmarket.repositories;

import com.annakhuseinova.springmarket.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
