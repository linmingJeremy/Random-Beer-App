package com.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beer implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private String description;
	private float abv;
	private String location;

	public Beer() {
		
	}
	
	public Beer(Long id, String name, String description, float abv, String location) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.abv = abv;
		this.location = location;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column
	public float getAbv() {
		return abv;
	}

	public void setAbv(float abv) {
		this.abv = abv;
	}
	
	@Column
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	

}
