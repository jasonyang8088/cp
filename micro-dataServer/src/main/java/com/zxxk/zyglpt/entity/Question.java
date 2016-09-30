package com.zxxk.zyglpt.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("rawtypes")
@MappedSuperclass
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Question<T extends QuestionOption,O extends QuestionAnswer,Q extends Question> {
	
	@Id
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
	
	@Column(name="document_id")
	private Long documentId;
	
	@Column(name="question_type_id")
	private Long questionTypeId;
	
	private Integer zjId;
	
	/**
	 * 组卷次数
	 */
	private Integer useCount;
	
	@ManyToMany
	private List<QuestionSearchSpec> questionSearchSpecs;
	
	@OneToMany(mappedBy="question",cascade=CascadeType.ALL)
	private List<T> optionlist;
	
	@OneToMany(mappedBy="question")
	private List<O> answerlist;
	
	/**
	 * 试题拆分状态，0 未拆分，1、已拆分未审核、2、已拆分已审核
	 */
	private Byte splitStatus=0;
	
	@ManyToOne
	@JsonIgnore
	private Q parent;
	
	@OneToMany(mappedBy="parent",cascade=CascadeType.ALL)
	private List<Q> childrens;
	
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

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public Long getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(Long questionTypeId) {
		this.questionTypeId = questionTypeId;
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

	public List<T> getOptionlist() {
		return optionlist;
	}

	public void setOptionlist(List<T> optionlist) {
		this.optionlist = optionlist;
	}

	public List<O> getAnswerlist() {
		return answerlist;
	}

	public void setAnswerlist(List<O> answerlist) {
		this.answerlist = answerlist;
	}

	public Byte getSplitStatus() {
		return splitStatus;
	}

	public void setSplitStatus(Byte splitStatus) {
		this.splitStatus = splitStatus;
	}

	public Q getParent() {
		return parent;
	}

	public void setParent(Q parent) {
		this.parent = parent;
	}

	public List<Q> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<Q> childrens) {
		this.childrens = childrens;
	}
}
