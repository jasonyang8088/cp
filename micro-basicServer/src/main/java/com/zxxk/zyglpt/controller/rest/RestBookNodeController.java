package com.zxxk.zyglpt.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.entity.BookNode;
import com.zxxk.zyglpt.repository.BookNodeRepository;

@RestController
public class RestBookNodeController {

	@Autowired
	private BookNodeRepository bookNodeRepository;
	
	@RequestMapping(value="/textbook/{id}/booknodes",method=RequestMethod.GET)
	public List<BookNode> findByTextBookId(@PathVariable("id")Long id){
		return bookNodeRepository.findByTextbookIdAndStatus(id, (byte)1);
	}
	
	@RequestMapping(value="/booknode/{id}",method=RequestMethod.GET)
	public BookNode findOne(@PathVariable("id")Long id){
		return bookNodeRepository.findOne(id);
	}
	
	@RequestMapping(value="/booknode/{id}/parent",method=RequestMethod.GET)
	public BookNode findParent(@PathVariable("id")Long id){
		return bookNodeRepository.findOne(id).getParent();
	}
	
	@RequestMapping(value="/booknode/{id}/childrens",method=RequestMethod.GET)
	public List<BookNode> findChildren(@PathVariable("id")Long id){
		return bookNodeRepository.findOne(id).getChildrens();
	}
}
