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
import com.zxxk.zyglpt.entity.Document;
import com.zxxk.zyglpt.entity.TextBook;
import com.zxxk.zyglpt.repository.DocumentRepository;
import com.zxxk.zyglpt.repository.TextBookRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class DocumentServiceTest {

	@Autowired
	private TextBookRepository textBookRepository;
	
	@Autowired
	private DocumentRepository documentRepository;
	
	@Autowired
	private DocumentService  documentService;
	
	@Test
	public void updateDocument(){
		List<TextBook> books=textBookRepository.findAll();
		for(TextBook book:books){
			boolean b=true;
			while(b){
				Long maxId=0l;
				Document document=documentRepository.findTopByTextbookidOrderByIdDesc(book.getId());
				if (document!=null) {
					maxId = document.getId();
				}
				Integer count=this.updateDocument(book.getId(),maxId);
				if(count<10){
					b=false;
				}
				
			}
		}
	}

	@Transactional
	@Rollback(false)
	private Integer updateDocument(Long id, Long maxId) {
		return documentService.updateDocumentByTextBookId(id, maxId);
	}
	
}
