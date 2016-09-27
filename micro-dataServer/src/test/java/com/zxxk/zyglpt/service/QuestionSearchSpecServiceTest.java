package com.zxxk.zyglpt.service;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zxxk.zyglpt.Application;
import com.zxxk.zyglpt.entity.QuestionSearchSpec;
import com.zxxk.zyglpt.repository.QuestionSearchSpecRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class QuestionSearchSpecServiceTest {

	@Autowired
	private QuestionSearchSpecService questionSearchSpecService;

	@Autowired
	private QuestionSearchSpecRepository questionSearchSpecRepository;

	@Test
	public void updateQuestionSearchSpec() {
		boolean b=true;
		while(b){
			QuestionSearchSpec q=questionSearchSpecRepository.findTopByOrderByIdDesc();
			Long maxId=0l;
			if(q!=null){
				System.out.println(q.getId());
				maxId=q.getId();
			}
			Integer count=this.updateQuestionSearchSpec(maxId);
			if(count<100){
				b=false;
			}
		}
	}
	
	@Transactional
	@Rollback(false)
	public Integer updateQuestionSearchSpec(Long maxId){
		return questionSearchSpecService.updateQuestionSerachSpec(maxId);
	}

}
