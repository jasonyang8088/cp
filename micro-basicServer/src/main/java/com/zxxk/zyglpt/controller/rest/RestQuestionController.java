package com.zxxk.zyglpt.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.controller.rest.form.QuestionSearchForm;
import com.zxxk.zyglpt.service.QuestionService;

@RestController
public class RestQuestionController {
	
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

}
