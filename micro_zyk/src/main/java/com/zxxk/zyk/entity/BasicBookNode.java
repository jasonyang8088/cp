package com.zxxk.zyk.entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//@Entity(name="b_basic_book_node")
public class BasicBookNode {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private Byte status;
	
	private Byte depth;
	
	@ManyToOne
	private Subject subject;

	@ManyToOne
	private BasicBookNode parent;
	
	@OneToMany(mappedBy="parent")
	private List<BasicBookNode> childrens;
	

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

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public BasicBookNode getParent() {
		return parent;
	}

	public void setParent(BasicBookNode parent) {
		this.parent = parent;
	}

	public List<BasicBookNode> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<BasicBookNode> childrens) {
		this.childrens = childrens;
	}


	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Byte getDepth() {
		return depth;
	}

	public void setDepth(Byte depth) {
		this.depth = depth;
	}
}
