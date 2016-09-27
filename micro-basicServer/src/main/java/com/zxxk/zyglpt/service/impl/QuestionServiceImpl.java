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
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.zxxk.zyglpt.controller.rest.form.QuestionSearchForm;
import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.QuestionSearchSpec;
import com.zxxk.zyglpt.service.QuestionService;
import com.zxxk.zyglpt.util.QuestionFactory;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionFactory questionFactory;
	
	@SuppressWarnings("rawtypes")
	public Specification<Question> createSpecification(QuestionSearchForm form) {
		Specification<Question> spec = new Specification<Question>() {
			public Predicate toPredicate(Root<Question> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				ListJoin<Question, QuestionSearchSpec> depJoin = root.join(
						root.getModel().getList("questionSearchSpecs", QuestionSearchSpec.class), JoinType.INNER);
				if(form.getSubjectid()!=null&&form.getSubjectid()!=0){
					list.add(cb.equal(depJoin.get("subjectId").as(Long.class), form.getSubjectid()));
				}
				if(form.getVersionid()!=null&&form.getVersionid()!=0){
					list.add(cb.equal(depJoin.get("versionId").as(Long.class), form.getVersionid()));
				}
				if(form.getTextbookid()!=null&&form.getTextbookid()!=0){
					list.add(cb.equal(depJoin.get("textbookId").as(Long.class), form.getTextbookid()));
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
				if(form.getBkp1id()!=null&&form.getBkp1id()!=0){
					list.add(cb.equal(depJoin.get("bkp1Id").as(Long.class), form.getBkp1id()));
				}
				if(form.getBkp2id()!=null&&form.getBkp2id()!=0){
					list.add(cb.equal(depJoin.get("bkp2Id").as(Long.class), form.getBkp2id()));
				}
				if(form.getBkp3id()!=null&&form.getBkp3id()!=0){
					list.add(cb.equal(depJoin.get("bkp3Id").as(Long.class), form.getBkp3id()));
				}
//				if(form.getOrderby()!=null){
//					query.orderBy(cb.desc(root.get(form.getOrderby())));
//				}else{
//					query.orderBy(cb.asc(root.get("id")));
//				}
				Predicate[] p = new Predicate[list.size()];
				
				
				return cb.and(list.toArray(p));
			}
		};
		return spec;
	}
	
	@Override
	public Long count(Long subjectId) {
		return questionFactory.create(subjectId).count();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Long countByForm(QuestionSearchForm form, Long subjectId) {
		return questionFactory.create(subjectId).count(this.createSpecification(form));
	}

}
