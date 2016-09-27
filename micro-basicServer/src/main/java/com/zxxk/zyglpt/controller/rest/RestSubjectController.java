package com.zxxk.zyglpt.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.entity.Subject;
import com.zxxk.zyglpt.repository.SubjectRepository;

@RestController
public class RestSubjectController {
	
	@Autowired
	private SubjectRepository subjectRepository;

	@RequestMapping("/subjects")
	public List<Subject> findAll(){
		return subjectRepository.findByStatus((byte)1);
	}
	
	@RequestMapping(value="/stage/{stage}/subjects")
	public List<Subject> findByStage(@PathVariable("stage")byte stage){
		return subjectRepository.findByStageAndStatus(stage,(byte)1);
	}
	
	@RequestMapping(value="/subject/{id}")
	public Subject findOne(@PathVariable("id")Long id){
		return subjectRepository.findOne(id);
	}
}
