package com.menu.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menu.dao.MenuDao;
import com.menu.dao.PriceDao;
import com.menu.dao.ItemsDao;
import com.menu.model.Menu;

@Service
public class MenuServiceImpl implements MenuService {
	
	private MenuDao menuDao;
	private ItemsDao menuItemsDao;
	private PriceDao priceDao;
	
	@Autowired
	public MenuServiceImpl(MenuDao menuDao, ItemsDao menuItemsDao, PriceDao priceDao) {
		super();
		this.menuDao = menuDao;
		this.menuItemsDao=menuItemsDao;
		this.priceDao=priceDao;
		
	}

	@Override
	public Menu createMenu(Menu menu) {
		// TODO Auto-generated method stub
		return menuDao.save(menu);
	}

	@Override
	public Optional<Menu> findById(Integer id) {
		// TODO Auto-generated method stub
		return menuDao.findById(id);
	}

	@Override
	public void deleteMenu() {
		// TODO Auto-generated method stub
		menuDao.deleteAll();
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		menuDao.deleteById(id);
		
	}

	@Override
	public Iterable<Menu> getall() {
		// TODO Auto-generated method stub
		return menuDao.findAll();
	}

	

}
