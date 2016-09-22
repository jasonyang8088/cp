package com.zxxk.zykinit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.zxxk.zykinit.entity.Subject;
import com.zxxk.zykinit.service.FeignSubjectService;

@Controller
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private FeignSubjectService feignSubjectService;
//    @Autowired
//    private RestTemplate restTemplate;
    
//	@RequestMapping(value="/findZykSubject",method=RequestMethod.GET)
//	@ResponseBody
//	public List<Subject> findZykSubject(){
//		RestTemplate restTemplate = new RestTemplate();
//		Subject[] subjects =restTemplate.getForObject("http://localhost:9002/api/subjects", Subject[].class);
//		List<Subject> list=Arrays.asList(subjects);
//		return list;
//	}
	
	@RequestMapping(value="/findZykSubject",method=RequestMethod.GET)
	@ResponseBody
	public List<Subject> findZykSubject(){
		List<Subject> list=feignSubjectService.findAll();
		return list;
	}
}
