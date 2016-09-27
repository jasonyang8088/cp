package com.zxxk.zyglpt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zxxk.zyglpt.Application;
import com.zxxk.zyglpt.entity.Subject;
import com.zxxk.zyglpt.repository.SubjectRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)

public class VersionServiceTest {
	
	@Autowired
	private VersionService versionService;
	
	@Autowired
	private SubjectRepository subjectRepository;

	@Test
	public void updateVersion(){
		List<Subject> subjects=subjectRepository.findAll();
		for(Subject sub:subjects){
			this.updateVersion(sub.getId());
		}
	}
	
	@Transactional
	@Rollback(false)
	public void updateVersion(Long subjectId){
		versionService.updateVersion(subjectId);
	}
}
