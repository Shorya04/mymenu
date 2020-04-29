package service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import dao.MenuDao;
import model.Menu;

@Service
public class MenuServiceImpl implements MenuService{
	 
	private MenuDao dao;
	
	@Autowired
	public MenuServiceImpl(MenuDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	@Transactional
	public Menu createMenu(Menu menu) {
		// TODO Auto-generated method stub
		return dao.save(menu);
	}

	@Override
	@Transactional
	public Optional<Menu> getMenuItem(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	/*@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return dao.getAllMenu();
	}*/

	}

	




