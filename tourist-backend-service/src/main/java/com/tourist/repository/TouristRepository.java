package com.tourist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tourist.model.Tourist;

@Repository
public interface TouristRepository extends CrudRepository<Tourist,Long> {

}
