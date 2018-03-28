package com.springboot.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="water_usage")
public class UseWater {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
	@Column(name="water_container")
private String container;
	@Column(name="water_quantity")
private Integer quantity;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getContainer() {
	return container;
}
public void setContainer(String container) {
	this.container = container;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

}
