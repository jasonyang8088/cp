package com.zxxk.zyk.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Lob
	private String stem;
	
	@Lob
	private String options;
	
	@Lob
	private String answer;
	
	@Lob
	private String questionAnalyze;
	
	private Date updateTime;
	
	private Byte difficult;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Document document;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private QuestionType questionType;
	
	private Integer zjId;
	
	/**
	 * 组卷次数
	 */
	private Integer useCount;
	
	@ManyToOne
	private QuestionSearchSpec questionSearchSpec;
	
	@ManyToMany
	private List<QuestionSearchSpec> questionSearchSpecs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStem() {
		return stem;
	}

	public void setStem(String stem) {
		this.stem = stem;
	}

	public String getOptions() {
		return options;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuestionAnalyze() {
		return questionAnalyze;
	}

	public void setQuestionAnalyze(String questionAnalyze) {
		this.questionAnalyze = questionAnalyze;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Byte getDifficult() {
		return difficult;
	}

	public void setDifficult(Byte difficult) {
		this.difficult = difficult;
	}

	public QuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}

	public Integer getZjId() {
		return zjId;
	}

	public void setZjId(Integer zjId) {
		this.zjId = zjId;
	}

	public Integer getUseCount() {
		return useCount;
	}

	public void setUseCount(Integer useCount) {
		this.useCount = useCount;
	}

	public List<QuestionSearchSpec> getQuestionSearchSpecs() {
		return questionSearchSpecs;
	}

	public void setQuestionSearchSpecs(List<QuestionSearchSpec> questionSearchSpecs) {
		this.questionSearchSpecs = questionSearchSpecs;
	}

	public QuestionSearchSpec getQuestionSearchSpec() {
		return questionSearchSpec;
	}

	public void setQuestionSearchSpec(QuestionSearchSpec questionSearchSpec) {
		this.questionSearchSpec = questionSearchSpec;
	}

}
