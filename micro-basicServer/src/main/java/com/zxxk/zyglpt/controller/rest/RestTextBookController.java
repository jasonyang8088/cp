package com.zxxk.zyglpt.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.entity.TextBook;
import com.zxxk.zyglpt.repository.TextBookRepository;

@RestController
public class RestTextBookController {

	@Autowired
	private TextBookRepository textBookRepository;
	
	@RequestMapping(value="/version/{versionId}/textbooks",method=RequestMethod.GET)
	public List<TextBook> findByVersionId(@PathVariable("versionId")Long versionId){
		return textBookRepository.findByVersionIdOrderByOrderId(versionId);
	}
	
	@RequestMapping(value="/textbook/{textbookId}",method=RequestMethod.GET)
	public TextBook findOne(@PathVariable("textbookId")Long textbookId){
		return textBookRepository.findOne(textbookId);
	}
}
