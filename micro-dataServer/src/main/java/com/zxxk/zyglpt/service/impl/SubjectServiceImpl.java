package com.zxxk.zyglpt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zxxk.zyglpt.entity.Subject;
import com.zxxk.zyglpt.repository.SubjectRepository;
import com.zxxk.zyglpt.service.SubjectService;
import com.zxxk.zyglpt.util.ServerConfig;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	private ServerConfig serverConfig;
	
	@Autowired
	private SubjectRepository subjectRepository;

	@Override
	public void updateSubject() {
		RestTemplate  template=new RestTemplate();
		Subject[] subjects=template.getForObject(serverConfig.getUrl()+"/subjects", Subject[].class);
		for(Subject sub:subjects){
			subjectRepository.save(sub);
		}
		
	}
	

}
