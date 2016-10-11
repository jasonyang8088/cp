package com.edu.entity;

import java.util.List;

public class KnowledgePoint {

	
	private Long id;
	
	private KnowledgePoint parent;
	
	private List<KnowledgePoint> knowledgePointList;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public KnowledgePoint getParent() {
		return parent;
	}

	public void setParent(KnowledgePoint parent) {
		this.parent = parent;
	}

	public List<KnowledgePoint> getKnowledgePointList() {
		return knowledgePointList;
	}

	public void setKnowledgePointList(List<KnowledgePoint> knowledgePointList) {
		this.knowledgePointList = knowledgePointList;
	}
	
}
