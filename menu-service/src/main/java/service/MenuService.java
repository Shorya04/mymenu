package service;

import java.util.List;
import java.util.Optional;

import model.Menu;

public interface MenuService  {
	
	public Menu createMenu(Menu menu);
	public Optional<Menu> getMenuItem(Integer id);
	//public List<Menu> getAllMenu();
	
 
}
