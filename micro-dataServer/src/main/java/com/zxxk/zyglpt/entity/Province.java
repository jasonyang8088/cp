package com.zxxk.zyglpt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="b_province")
public class Province {
	
	@Id
	private Long Id;

	private String name;
	
	private Integer zjId;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getZjId() {
		return zjId;
	}

	public void setZjId(Integer zjId) {
		this.zjId = zjId;
	}
	
}
