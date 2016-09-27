package com.zxxk.zyglpt.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.controller.rest.form.DocumentSearchForm;
import com.zxxk.zyglpt.entity.Document;
import com.zxxk.zyglpt.service.DocumentService;

@RestController
public class RestDocumentController {

	@Autowired
	private DocumentService documentService;
	
	private Logger logger =LoggerFactory.getLogger(RestDocumentController.class);
	
	@RequestMapping(value="/documents/count",method=RequestMethod.GET)
	public Long count(DocumentSearchForm form){
		return documentService.count(form);
	}
	
	@RequestMapping(value="/documents/page/{page}/size/{size}",method=RequestMethod.GET)
	public List<Document> findAll(@PathVariable("page")int page,@PathVariable("size")int size,DocumentSearchForm form){
		Pageable pageRequest=new PageRequest(page-1, size);
		return documentService.findAll(form,pageRequest);
	}
	
	@RequestMapping(value="/documents/maxid/{maxid}/size/{size}",method=RequestMethod.GET)
	public List<Document> findByMaxId(@PathVariable("maxid")Long maxid,@PathVariable("size")int size,DocumentSearchForm form){
		logger.info("查找文档");
		Pageable pageRequest=new PageRequest(0, size);
		return documentService.findByMaxId(maxid,form,pageRequest);
	}
	
}
