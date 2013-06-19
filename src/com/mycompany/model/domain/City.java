package com.mycompany.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class City {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column(columnDefinition="Astana")
private String name;
private int id_country;
public int getId_country() {
	return id_country;
}
public void setId_country(int id_country) {
	this.id_country = id_country;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
