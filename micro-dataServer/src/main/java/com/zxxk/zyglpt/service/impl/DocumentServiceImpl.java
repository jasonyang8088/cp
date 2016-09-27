package com.zxxk.zyglpt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zxxk.zyglpt.entity.Document;
import com.zxxk.zyglpt.repository.DocumentRepository;
import com.zxxk.zyglpt.service.DocumentService;
import com.zxxk.zyglpt.util.ServerConfig;

@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private ServerConfig serverConfig;

	@Autowired
	private DocumentRepository documentRepository;

	@Override
	public Integer updateDocumentByTextBookId(Long textbookId, Long maxId) {
		RestTemplate template = new RestTemplate();
		Document[] documents = template.getForObject(
				serverConfig.getUrl() + "/documents/maxid/" + maxId + "/size/10?textbookid=+" + textbookId,
				Document[].class);
		for (Document doc : documents) {
			documentRepository.save(doc);
		}
		
		return documents.length;
	}

}
