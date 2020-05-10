package com.menu.model;


import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="menu")
public class Menu {

	@Id
	private final String id="3AB";
	
	@OneToMany(targetEntity = Items.class, cascade= CascadeType.ALL)
	@JoinColumn(name="mi_fk", referencedColumnName = "id")
	private List<Items> items;

	

	public Menu() {
		super();
	}


	public Menu(List<Items> items) {
		super();
		this.items = items;
	}


	@Override
	public String toString() {
		return "Menu [id=" + id + ", items=" + items + "]";
	}


	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}
	
}
	

	

