package com.zxxk.zyglpt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zxxk.zyglpt.entity.BasicKnowledgePoint;
import com.zxxk.zyglpt.repository.BasicKnowledgePointRepository;
import com.zxxk.zyglpt.service.BasicKnowledgePointService;
import com.zxxk.zyglpt.util.ServerConfig;

@Service
public class BasicKnowledgePointServiceImpl implements BasicKnowledgePointService {
	
	@Autowired
	private ServerConfig serverConfig;
	
	@Autowired
	private BasicKnowledgePointRepository basicKnowledgePointRepository;

	
	public void updateBasicKnowledgePoint(Long subjectId){
		RestTemplate  template=new RestTemplate();
		BasicKnowledgePoint[] list=template.getForObject(serverConfig.getUrl()+"/subject/"+subjectId+"/basicknowledgepoints",BasicKnowledgePoint[].class);
		for(BasicKnowledgePoint b:list){
			basicKnowledgePointRepository.save(b);
		}
	}
}
