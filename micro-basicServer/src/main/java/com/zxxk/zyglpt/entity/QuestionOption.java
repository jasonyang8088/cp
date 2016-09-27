package com.zxxk.zyglpt.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * 试题选项
 * 
 * @author yangqijie
 * @time 2016年9月19日 上午8:42:27
 */
@SuppressWarnings("rawtypes")
@MappedSuperclass
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class QuestionOption<T extends Question>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String sign;
	
	@Lob
	private String text;
	
	@ManyToOne
	private T question;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public T getQuestion() {
		return question;
	}

	public void setQuestion(T question) {
		this.question = question;
	}
}
