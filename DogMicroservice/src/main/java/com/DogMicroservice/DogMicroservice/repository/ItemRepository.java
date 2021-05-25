package com.DogMicroservice.DogMicroservice.repository;


import com.DogMicroservice.DogMicroservice.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}

