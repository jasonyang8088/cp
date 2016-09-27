package com.zxxk.zyglpt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zxxk.zyglpt.entity.TextBook;
import com.zxxk.zyglpt.repository.TextBookRepository;
import com.zxxk.zyglpt.service.TextBookService;
import com.zxxk.zyglpt.util.ServerConfig;

@Service
public class TextBookServiceImpl implements TextBookService{
	
	@Autowired
	private ServerConfig serverConfig;
	
	@Autowired
	private TextBookRepository textBookRepository;

	@Override
	public void updateTextBook(Long versionId) {
		RestTemplate  template=new RestTemplate();
		TextBook[] textbooks=template.getForObject(serverConfig.getUrl()+"/version/"+versionId+"/textbooks", TextBook[].class);
		for(TextBook book:textbooks){
			textBookRepository.save(book);
		}
	}

}
