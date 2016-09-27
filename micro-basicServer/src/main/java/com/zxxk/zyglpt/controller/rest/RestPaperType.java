package com.zxxk.zyglpt.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.entity.PaperType;
import com.zxxk.zyglpt.repository.PaperTypeRepository;

@RestController
public class RestPaperType {

	@Autowired
	private PaperTypeRepository paperTypeRepository;
	
	@RequestMapping(value="/papertypes",method=RequestMethod.GET)
	public List<PaperType> findAll(){
		return paperTypeRepository.findAll();
	}
}
