package com.zxxk.zykinit.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zxxk.zykinit.entity.Subject;

@FeignClient("zykserver")
public interface FeignSubjectService {
	
	@RequestMapping(value = "/api/subjects", method = RequestMethod.GET)
	public List<Subject> findAll();

}
