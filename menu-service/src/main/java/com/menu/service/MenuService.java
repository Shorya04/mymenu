package com.menu.service;


import java.util.Optional;

import com.menu.model.Menu;

public interface MenuService {
	
	public Menu createMenu(Menu menu);
	public Iterable<Menu> getall();
	public void deleteMenu();
	public Optional<Menu> findById(String id);
	void deleteById(String id);
;
}
