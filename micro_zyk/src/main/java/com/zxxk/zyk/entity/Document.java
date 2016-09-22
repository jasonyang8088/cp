package com.zxxk.zyk.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name="b_document")
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@ManyToOne
	private TextBook textbook;
	
	@ManyToOne
	private DocumentSearchSpec documentSearchSpec;
	
	@ManyToMany
	private List<DocumentSearchSpec> documentSearchSpecs;
	
	private String docSuffix;
	
	private Integer sourceId;
	
	private String prefixion;
	
	private String keyword;
	
	private Integer areaId;
	
	private String author;
	
	private String softType;
	
	private String softLanguage;
	
	private String copyrightType;
	
	private Integer softSize;
	
	private Double softPoint;
	
	private Double softMoney;
	
	private Date createTime;
	
	private Date updateTime;
	
	private Integer isAnalyze;
	
	private Byte status;
	
	/**
	 * 来源
	 * 1:学科网，2：组卷网，3：其它
	 */
	private Byte source; //1:学科网，2：组卷网，3：其它
	
	/**
	 * 文档品级
	 * 1：普通;2:高级;3:精品;4:名校;5:特供
	 */
	private Byte docLevel;
	
	/**
	 * 试卷类型
	 */
	@ManyToOne
	private PaperType paperType;
	/**
	 * 是否拆分成试题
	 */
	@Column
	private Byte isSplit=0;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getDocLevel() {
		return docLevel;
	}

	public void setDocLevel(Byte docLevel) {
		this.docLevel = docLevel;
	}

	public PaperType getPaperType() {
		return paperType;
	}

	public void setPaperType(PaperType paperType) {
		this.paperType = paperType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TextBook getTextbook() {
		return textbook;
	}

	public void setTextbook(TextBook textbook) {
		this.textbook = textbook;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public String getPrefixion() {
		return prefixion;
	}

	public void setPrefixion(String prefixion) {
		this.prefixion = prefixion;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAuthor() {
		return author;
	}

	public Byte getSource() {
		return source;
	}

	public void setSource(Byte source) {
		this.source = source;
	}

	public Byte getIsSplit() {
		return isSplit;
	}

	public void setIsSplit(Byte isSplit) {
		this.isSplit = isSplit;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSoftType() {
		return softType;
	}

	public void setSoftType(String softType) {
		this.softType = softType;
	}

	public String getSoftLanguage() {
		return softLanguage;
	}

	public void setSoftLanguage(String softLanguage) {
		this.softLanguage = softLanguage;
	}

	public String getCopyrightType() {
		return copyrightType;
	}

	public void setCopyrightType(String copyrightType) {
		this.copyrightType = copyrightType;
	}

	public Integer getSoftSize() {
		return softSize;
	}

	public void setSoftSize(Integer softSize) {
		this.softSize = softSize;
	}

	public Double getSoftPoint() {
		return softPoint;
	}

	public void setSoftPoint(Double softPoint) {
		this.softPoint = softPoint;
	}

	public Double getSoftMoney() {
		return softMoney;
	}

	public void setSoftMoney(Double softMoney) {
		this.softMoney = softMoney;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsAnalyze() {
		return isAnalyze;
	}

	public void setIsAnalyze(Integer isAnalyze) {
		this.isAnalyze = isAnalyze;
	}

	public List<DocumentSearchSpec> getDocumentSearchSpecs() {
		return documentSearchSpecs;
	}

	public void setDocumentSearchSpecs(List<DocumentSearchSpec> documentSearchSpecs) {
		this.documentSearchSpecs = documentSearchSpecs;
	}

	public DocumentSearchSpec getDocumentSearchSpec() {
		return documentSearchSpec;
	}

	public void setDocumentSearchSpec(DocumentSearchSpec documentSearchSpec) {
		this.documentSearchSpec = documentSearchSpec;
	}

	public String getDocSuffix() {
		return docSuffix;
	}

	public void setDocSuffix(String docSuffix) {
		this.docSuffix = docSuffix;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}
}
