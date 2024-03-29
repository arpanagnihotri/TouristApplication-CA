package com.tourist.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourist.model.Tourist;
import com.tourist.repository.TouristRepository;

@Service
public class TouristServiceImpl implements TouristService{

	@Autowired
	private TouristRepository tr;
	
	@Override
	public List<Tourist> getAllTourist() {
		List<Tourist> t=(List<Tourist>)tr.findAll();
		Collections.sort(t);
		return t;
	}

	@Override
	public Tourist addTourist(Tourist tourist) {
		return tr.save(tourist);
	}
	
	
}
