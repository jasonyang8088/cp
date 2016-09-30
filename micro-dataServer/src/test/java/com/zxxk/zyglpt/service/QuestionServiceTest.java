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
import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.Subject;
import com.zxxk.zyglpt.repository.SubjectRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class QuestionServiceTest {

	
	@Autowired
	private QuestionService  questionService;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@SuppressWarnings("rawtypes")
	@Test
	public void updateQuestion(){
		List<Subject> subjects=subjectRepository.findAll();
		for(Subject sub:subjects){
			if(sub.getId()!=201){
				continue;
			}
			Long maxId=0L;
			boolean b=true;
			while(b){
				Question q=questionService.findQuestionMaxId(sub.getId());
				if(q!=null){
					maxId=q.getId();
				}
				int i=this.updateQuestion(sub.getId(), maxId);
				if(i<10){
					b=false;
				}
			}
		}
	}

	@Transactional
	@Rollback(false)
	private Integer updateQuestion(Long subjectId, Long maxId) {
		return questionService.updateQuestion(subjectId, maxId);
	}
	
}
