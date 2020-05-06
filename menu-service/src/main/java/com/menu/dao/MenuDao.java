package com.menu.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.menu.model.Menu;

@Repository
@Transactional
public interface MenuDao extends CrudRepository<Menu, Integer>{

}
