package com.tourist.service;

import java.util.List;

import com.tourist.model.Tourist;

public interface TouristService {

	List<Tourist> getAllTourist();

	Tourist addTourist(Tourist tourist);

}
