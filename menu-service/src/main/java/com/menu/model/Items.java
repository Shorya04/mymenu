package com.menu.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemId;
	private String itemName;
	private String desc;
	private float rating;
	@OneToOne(targetEntity = Price.class, cascade = CascadeType.ALL)
	@JoinColumn(name= "p_fk", referencedColumnName = "pId")
	private Price price;
	public Items() {
		super();
	}
	
	public Items(Integer itemId, String itemName, String desc, float rating, Price price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.desc = desc;
		this.rating = rating;
		this.price = price;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", desc=" + desc + ", rating=" + rating
				+ ", price=" + price + "]";
	}
	
	
	
	
	
}