package com.zxxk.zyglpt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zxxk.zyglpt.entity.BookNode;
import com.zxxk.zyglpt.repository.BookNodeRepository;
import com.zxxk.zyglpt.service.BookNodeService;
import com.zxxk.zyglpt.util.ServerConfig;

@Service
public class BookNodeServiceImpl implements BookNodeService {
	
	@Autowired
	private ServerConfig serverConfig;
	
	@Autowired
	private BookNodeRepository bookNodeRepository;

	@Override
	public void updateBookNode(Long textbookId) {
		RestTemplate  template=new RestTemplate();
		BookNode[] booknodes=template.getForObject(serverConfig.getUrl()+"/textbook/"+textbookId+"/booknodes",BookNode[].class);
		for(BookNode b:booknodes){
			bookNodeRepository.save(b);
		}
		
	}

	
}
