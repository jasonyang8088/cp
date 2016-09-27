package com.zxxk.zyglpt.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.entity.BasicKnowledgePoint;
import com.zxxk.zyglpt.repository.BasicKnowledgePointRepository;

@RestController
public class RestBasicKnowledgePointController {
	
	@Autowired
	private BasicKnowledgePointRepository basicKnowledgePointRepository;
	
	@RequestMapping(value="/subject/{subjectId}/basicknowledgepoints")
	public List<BasicKnowledgePoint> findBySubjectId(@PathVariable("subjectId")Long subjectId){
		return basicKnowledgePointRepository.findBySubjectId(subjectId);
		
	}

}
