package com.zxxk.zykinit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="b_paper_type")
public class PaperType {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String zxxkName;
	
	private Integer zjId;

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

	public String getZxxkName() {
		return zxxkName;
	}

	public void setZxxkName(String zxxkName) {
		this.zxxkName = zxxkName;
	}

	public Integer getZjId() {
		return zjId;
	}

	public void setZjId(Integer zjId) {
		this.zjId = zjId;
	}
	
}
