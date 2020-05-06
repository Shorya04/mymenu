package com.menu.dao;

import org.springframework.data.repository.CrudRepository;

import com.menu.model.Price;

public interface PriceDao extends CrudRepository<Price, Integer> {

}
