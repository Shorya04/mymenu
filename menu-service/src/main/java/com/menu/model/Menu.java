package com.menu.model;


import java.util.List;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany(targetEntity = Items.class, cascade= CascadeType.ALL)
	@JoinColumn(name="mi_fk", referencedColumnName = "id")
	private List<Items> items;

	public Menu(Integer id, List<Items> items) {
		super();
		this.id = id;
		this.items = items;
	}

	public Menu() {
		super();
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", items=" + items + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	
}
	

	

