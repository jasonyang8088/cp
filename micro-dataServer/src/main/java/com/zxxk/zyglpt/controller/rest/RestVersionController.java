package com.zxxk.zyglpt.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zxxk.zyglpt.entity.Version;
import com.zxxk.zyglpt.repository.VersionRepository;

@RestController
public class RestVersionController {
	
	@Autowired
	private VersionRepository versionRepository;
	
	@RequestMapping(value="subject/{subjectId}/versions")
	public List<Version> findBySubjectId(@PathVariable("subjectId")Long subjectId){
		return versionRepository.findBySubjectIdAndStatus(subjectId, (byte)1);
	}
	
	@RequestMapping(value="version/{versionId}")
	public Version findByVersionId(@PathVariable("versionId")Long versionId){
		return versionRepository.findOne(versionId);
	}
}
