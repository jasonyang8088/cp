package com.zxxk.zyglpt.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.controller.rest.form.QuestionSearchForm;
import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.service.QuestionService;

@RestController
public class RestQuestionController {
	
	private Logger logger =LoggerFactory.getLogger(RestQuestionController.class);
	
	@Autowired
	private QuestionService questionService;
	
	@RequestMapping(value="/subject/{subjectId}/questions/count",method=RequestMethod.GET)
	public Long countBySubject(@PathVariable("subjectId")Long subjectId){
		return questionService.count(subjectId);
	}
	
	@RequestMapping(value="/subject/{subjectId}/questions/searchcount",method=RequestMethod.GET)
	public Long count(QuestionSearchForm form,@PathVariable("subjectId")Long subjectId){
		return questionService.countByForm(form,subjectId);
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/subject/{subjectId}/questions/maxid/{maxid}/size/{size}",method=RequestMethod.GET)
	public List<Question> findByMaxId(@PathVariable("subjectId")Long subjectId,@PathVariable("maxid")Long maxid,@PathVariable("size")int size){
		logger.info("查找试题");
		Pageable pageRequest=new PageRequest(0, size);
		return questionService.findByMaxId(subjectId,maxid,pageRequest);
	}

}
