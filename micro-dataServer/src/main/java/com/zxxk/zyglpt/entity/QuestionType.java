package com.zxxk.zyglpt.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 试题题型
 * 
 * @author yangqijie
 * @time 2016年9月12日 上午9:35:29
 */
@Entity(name="b_question_type")
public class QuestionType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Integer zjTypeId;
	
	@ManyToMany
	private List<Subject> subjects;
	
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

	public Integer getZjTypeId() {
		return zjTypeId;
	}
 
	
	public void setZjTypeId(Integer zjTypeId) {
		this.zjTypeId = zjTypeId;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
}
