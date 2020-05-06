package com.menu.dao;

import org.springframework.data.repository.CrudRepository;

import com.menu.model.Items;

public interface ItemsDao extends CrudRepository<Items, Integer> {

}
