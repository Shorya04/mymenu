package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MenuList")
public class Menu {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	@Column(name = "Menu Items")
	private String itemName;
	@Column(name = "Price")
	private double price;
	@Column (name = "Cuisine")
	private String desc;
	private float rating;
	
	
}
