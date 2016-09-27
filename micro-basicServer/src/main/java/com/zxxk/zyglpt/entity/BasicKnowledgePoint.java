package com.zxxk.zyglpt.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * 基础知识点
 * 
 * @author yangqijie
 * @time 2016年9月19日 上午11:07:28
 */
@Entity(name="b_basic_knowledge_point")
public class BasicKnowledgePoint {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	/**
	 * 基础知识点内容
	 */
	private String name;

	/**
	 * 科目
	 */
	@ManyToOne
	private Subject subject;

	/**
	 * 深度（树形结构中的层数）
	 */
	private byte depth;

	/**
	 * 排序No
	 */
	private String orderNo;
	
	/**
	 * 状态
	 */
	private byte status;   //-1 已失效;0、未审核;1、审核通过
	
	
	@ManyToOne
	private BasicKnowledgePoint parent;
	
	@OneToMany(mappedBy="parent")
	@JsonIgnore
	private List<BasicKnowledgePoint> childrens;

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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public byte getDepth() {
		return depth;
	}

	public void setDepth(byte depth) {
		this.depth = depth;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public BasicKnowledgePoint getParent() {
		return parent;
	}

	public void setParent(BasicKnowledgePoint parent) {
		this.parent = parent;
	}

	public List<BasicKnowledgePoint> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<BasicKnowledgePoint> childrens) {
		this.childrens = childrens;
	}

}
