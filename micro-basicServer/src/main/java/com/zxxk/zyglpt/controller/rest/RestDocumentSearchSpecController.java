package com.zxxk.zyglpt.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.entity.DocumentSearchSpec;
import com.zxxk.zyglpt.repository.DocumentSearchSpecRepository;

@RestController
public class RestDocumentSearchSpecController {

	@Autowired
	private DocumentSearchSpecRepository documentSearchSpecRepository;
	
	@RequestMapping(value="/documentsearchspecs",method=RequestMethod.GET)
	public List<DocumentSearchSpec> findAll(){
		return documentSearchSpecRepository.findAll();
	}
	
	@RequestMapping(value="/documentsearchspecs/count",method=RequestMethod.GET)
	public Long findPage(){
		return documentSearchSpecRepository.count();
	}
	
	@RequestMapping(value="/documentsearchspecs/page/{page}/size/{size}",method=RequestMethod.GET)
	public List<DocumentSearchSpec> findByPage(@PathVariable("page")int page,@PathVariable("size")int size){
		Pageable pageable = new PageRequest(page-1,size);
		return documentSearchSpecRepository.findAll(pageable).getContent();
	}
	
	@RequestMapping(value="/documentsearchspecs/maxid/{id}/size/{size}",method=RequestMethod.GET)
	public List<DocumentSearchSpec> findByMax(@PathVariable("id")Long id,@PathVariable("size")int size){
		Pageable pageable = new PageRequest(0,size);
		return documentSearchSpecRepository.findByIdGreaterThan(id,pageable);
	}
}
