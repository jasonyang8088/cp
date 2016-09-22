package com.zxxk.zyk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyk.entity.Subject;
import com.zxxk.zyk.repository.SubjectRepository;


@RestController
@RequestMapping("/api")
public class RestSubjectController {
	
	@Autowired
	private SubjectRepository subjectRepository;

	@RequestMapping(value="/subjects",method=RequestMethod.GET)
	public List<Subject> findAll(){
		return subjectRepository.findByStatus((byte)1);
	}
}
