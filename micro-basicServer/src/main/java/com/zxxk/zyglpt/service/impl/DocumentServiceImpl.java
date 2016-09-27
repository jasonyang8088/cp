package com.zxxk.zyglpt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.ListJoin;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.zxxk.zyglpt.controller.rest.form.DocumentSearchForm;
import com.zxxk.zyglpt.entity.Document;
import com.zxxk.zyglpt.entity.DocumentSearchSpec;
import com.zxxk.zyglpt.repository.DocumentRepository;
import com.zxxk.zyglpt.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService{
	
	@Autowired
	private DocumentRepository documentRepository;
	
	public Specification<Document> createSpecification(DocumentSearchForm form) {
		Specification<Document> spec = new Specification<Document>() {
			public Predicate toPredicate(Root<Document> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				ListJoin<Document, DocumentSearchSpec> depJoin = root.join(
						root.getModel().getList("documentSearchSpecs", DocumentSearchSpec.class), JoinType.INNER);
				if(form.getSubjectid()!=null&&form.getSubjectid()!=0){
					list.add(cb.equal(depJoin.get("subjectId").as(Long.class), form.getSubjectid()));
				}
				if(form.getVersionid()!=null&&form.getVersionid()!=0){
					list.add(cb.equal(depJoin.get("versionId").as(Long.class), form.getVersionid()));
				}
				if(form.getTextbookid()!=null&&form.getTextbookid()!=0){
					list.add(cb.equal(depJoin.get("textBookId").as(Long.class), form.getTextbookid()));
				}
				if(form.getBooknode1id()!=null&&form.getBooknode1id()!=0){
					list.add(cb.equal(depJoin.get("booknode1Id").as(Long.class), form.getBooknode1id()));
				}
				if(form.getBooknode2id()!=null&&form.getBooknode2id()!=0){
					list.add(cb.equal(depJoin.get("booknode2Id").as(Long.class), form.getBooknode2id()));
				}
				if(form.getBooknode3id()!=null&&form.getBooknode3id()!=0){
					list.add(cb.equal(depJoin.get("booknode3Id").as(Long.class), form.getBooknode3id()));
				}
				if(form.getOrderby()!=null){
					query.orderBy(cb.desc(root.get(form.getOrderby())));
				}else{
					query.orderBy(cb.asc(root.get("id")));
				}
				Predicate[] p = new Predicate[list.size()];
				
				
				return cb.and(list.toArray(p));
			}
		};
		return spec;
	}

	@Override
	public Long count(DocumentSearchForm form) {
		return documentRepository.count(this.createSpecification(form));
	}

	@Override
	public List<Document> findAll(DocumentSearchForm form, Pageable pageRequest) {
		return documentRepository.findAll(this.createSpecification(form),pageRequest).getContent();
	}

	@Override
	public List<Document> findByMaxId(Long maxid,DocumentSearchForm form, Pageable pageRequest) {
		return documentRepository.findByIdGreaterThanAndTextbookid(maxid,form.getTextbookid(),pageRequest);
	}
}
