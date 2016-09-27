package com.zxxk.zyglpt.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity(name="b_version")
public class Version{
	
	@Id
	private Long id;
	
	@ManyToOne
	@JsonDeserialize
	private  Subject subject;
	
	@Column(length=20)
	private String versionName;
	
	@JsonDeserialize
	private Byte status;
	
	@JsonDeserialize
	private Integer orderId;
	
	@OneToMany(mappedBy="version",cascade= CascadeType.REMOVE)
	@JsonIgnore
	private List<TextBook> textbooks;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public List<TextBook> getTextbooks() {
		return textbooks;
	}

	public void setTextbooks(List<TextBook> textbooks) {
		this.textbooks = textbooks;
	}
	
}
 