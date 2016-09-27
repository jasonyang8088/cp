package com.zxxk.zyglpt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zxxk.zyglpt.entity.PaperType;
import com.zxxk.zyglpt.repository.PaperTypeRepository;
import com.zxxk.zyglpt.service.PaperTypeService;
import com.zxxk.zyglpt.util.ServerConfig;

@Service
public class PaperTypeServiceImpl implements PaperTypeService {

	@Autowired
	private ServerConfig serverConfig;
	
	@Autowired
	private PaperTypeRepository paperTypeRepository;
	
	@Override
	public void updatePaperType() {
		RestTemplate  template=new RestTemplate();
		PaperType[] paperTypes=template.getForObject(serverConfig.getUrl()+"/papertypes", PaperType[].class);
		for(PaperType p:paperTypes){
			paperTypeRepository.save(p);
		}
	}
}
