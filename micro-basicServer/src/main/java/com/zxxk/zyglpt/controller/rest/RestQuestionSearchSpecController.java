package com.zxxk.zyglpt.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.entity.QuestionSearchSpec;
import com.zxxk.zyglpt.repository.QuestionSearchSpecRepository;

@RestController
public class RestQuestionSearchSpecController {
	
	@Autowired
	private QuestionSearchSpecRepository questionSearchSpecRepository;
	

	@RequestMapping(value="/questionsearchspecs/count",method=RequestMethod.GET)
	public Long findPage(){
		return questionSearchSpecRepository.count();
	}
	
	@RequestMapping(value="/questionsearchspecs/page/{page}/size/{size}",method=RequestMethod.GET)
	public List<QuestionSearchSpec> findByPage(@PathVariable("page")int page,@PathVariable("size")int size){
		Pageable pageable = new PageRequest(page-1,size);
		return questionSearchSpecRepository.findAll(pageable).getContent();
	}
	
	@RequestMapping(value="/questionsearchspecs/maxid/{id}/size/{size}",method=RequestMethod.GET)
	public List<QuestionSearchSpec> findByMax(@PathVariable("id")Long id,@PathVariable("size")int size){
		Pageable pageable = new PageRequest(0,size);
		return questionSearchSpecRepository.findByIdGreaterThan(id,pageable).getContent();
	}
}
