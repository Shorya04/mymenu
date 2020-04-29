package controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.MenuDao;
import exception.ErrorMessage;
import model.Menu;
import service.MenuService;

@RestController
@RequestMapping("/api")
public class MenuController {
	
	private MenuService menuService;

	@Autowired
	public MenuController(MenuService menuService) {
		super();
		this.menuService = menuService;
	}
	
	/*@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError(Exception e){
    	ErrorMessage errorMessage=new ErrorMessage();
    	errorMessage.setMessage(e.getMessage());
    	errorMessage.setStatusCode(HttpStatus.BAD_REQUEST.value());
    	errorMessage.setTime(LocalDateTime.now());
    	return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.BAD_REQUEST);}*/
    
	
	@PostMapping("/menu")
	public Menu createMenu(@RequestBody Menu menu) {
		// TODO Auto-generated method stub
		return menuService.createMenu(menu);
	}

	@GetMapping("/menu/{id}")
	public Optional<Menu> getMenuItem(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return menuService.getMenuItem(id);
	}

	/*@GetMapping("/menu")
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return menuService.getAllMenu();}*/
	
	
	@PutMapping("/menu/{id}")
	public Menu updateMenuById(@RequestBody Menu menu, @PathVariable Integer id) {
		Menu updatedMenu = null;
		if(menuService.getMenuItem(id) != null) {
			updatedMenu = menuService.createMenu(menu);
		}
		return updatedMenu;
		
	}
}



