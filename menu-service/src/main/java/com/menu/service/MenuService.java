package com.menu.service;

import java.util.List;
import java.util.Optional;

import com.menu.model.Menu;

public interface MenuService {
	
	public Menu createMenu(Menu menu);
	public Optional<Menu> findById(Integer id);
	public Iterable<Menu> getall();
	public void deleteMenu();
	public void deleteById(Integer id);
;
}
