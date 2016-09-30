package com.zxxk.zyglpt.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zxxk.zyglpt.entity.Question;
import com.zxxk.zyglpt.entity.QuestionOption;
import com.zxxk.zyglpt.entity.QuestionSearchSpec;
import com.zxxk.zyglpt.entity.question.QuestionJuniorBiology;
import com.zxxk.zyglpt.entity.question.QuestionJuniorChemistry;
import com.zxxk.zyglpt.entity.question.QuestionJuniorChinese;
import com.zxxk.zyglpt.entity.question.QuestionJuniorEnglish;
import com.zxxk.zyglpt.entity.question.QuestionJuniorGeography;
import com.zxxk.zyglpt.entity.question.QuestionJuniorHistory;
import com.zxxk.zyglpt.entity.question.QuestionJuniorInformation;
import com.zxxk.zyglpt.entity.question.QuestionJuniorMath;
import com.zxxk.zyglpt.entity.question.QuestionJuniorPhysics;
import com.zxxk.zyglpt.entity.question.QuestionJuniorPolitics;
import com.zxxk.zyglpt.entity.question.QuestionJuniorScience;
import com.zxxk.zyglpt.entity.question.QuestionSeniorBiology;
import com.zxxk.zyglpt.entity.question.QuestionSeniorChemistry;
import com.zxxk.zyglpt.entity.question.QuestionSeniorChinese;
import com.zxxk.zyglpt.entity.question.QuestionSeniorEnglish;
import com.zxxk.zyglpt.entity.question.QuestionSeniorGeography;
import com.zxxk.zyglpt.entity.question.QuestionSeniorHistory;
import com.zxxk.zyglpt.entity.question.QuestionSeniorInformation;
import com.zxxk.zyglpt.entity.question.QuestionSeniorMath;
import com.zxxk.zyglpt.entity.question.QuestionSeniorPhysics;
import com.zxxk.zyglpt.entity.question.QuestionSeniorPolitics;
import com.zxxk.zyglpt.repository.QuestionSearchSpecRepository;
import com.zxxk.zyglpt.service.QuestionService;
import com.zxxk.zyglpt.util.QuestionFactory;
import com.zxxk.zyglpt.util.ServerConfig;

@Service
public class QuestionServiceImpl implements QuestionService {

	Logger logger = LoggerFactory.getLogger(QuestionServiceImpl.class);

	@Autowired
	private ServerConfig serverConfig;

	@Autowired
	private QuestionFactory questionFactory;
	
	@Autowired
	private QuestionSearchSpecRepository questionSearchSpecRepository;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Integer updateQuestion(Long subjectId, Long maxId) {
		RestTemplate template = new RestTemplate();
		Question[] questions;
		switch (subjectId.intValue()) {
		case 201:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorChinese[].class);
			break;
		case 202:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorMath[].class);
			break;
		case 203:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorEnglish[].class);
			break;
		case 204:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorPhysics[].class);
			break;
		case 205:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorChemistry[].class);
			break;
		case 206:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorBiology[].class);
			break;
		case 207:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorPolitics[].class);
			break;
		case 208:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorHistory[].class);
			break;
		case 209:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorGeography[].class);
			break;
		case 210:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorScience[].class);
			break;
		case 211:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionJuniorInformation[].class);
			break;
		case 301:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionSeniorChinese[].class);
			break;
		case 302:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionSeniorMath[].class);
			break;
		case 303:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionSeniorEnglish[].class);
			break;
		case 304:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionSeniorPhysics[].class);
			break;
		case 305:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionSeniorChemistry[].class);
			break;
		case 306:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionSeniorBiology[].class);
			break;
		case 307:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionSeniorPolitics[].class);
			break;
		case 308:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionSeniorHistory[].class);
			break;
		case 309:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionSeniorGeography[].class);
			break;
		case 311:
			questions = template.getForObject(
					serverConfig.getUrl() + "/subject/" + subjectId + "/questions/maxid/" + maxId + "/size/10",
					QuestionSeniorInformation[].class);
			break;
		default:
			questions=null;
			return 0;
		}
		if (questions != null) {
			for (Question q : questions) {
				if (!q.getOptionlist().isEmpty()) {
					for (QuestionOption o : (List<QuestionOption>) q.getOptionlist()) {
						o.setQuestion(q);
					}
				}
				if (!q.getChildrens().isEmpty()) {
					for (Question o : (List<Question>) q.getChildrens()) {
						o.setParent(q);
					}
				}
				if (!q.getQuestionSearchSpecs().isEmpty()) {
					List<QuestionSearchSpec> qs= (List<QuestionSearchSpec>) q.getQuestionSearchSpecs();
					for (int i=qs.size()-1;i>=0;i--) {
						QuestionSearchSpec qss=qs.get(i);
						try {
							if(!questionSearchSpecRepository.exists(qss.getId())){
								questionSearchSpecRepository.save(qss);
							}
						} catch (Exception e) {
							qs.remove(qss);
						}
					}
				}
				logger.info("保存试题:" + q.getId());
				try {
					questionFactory.create(subjectId).save(q);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return questions.length;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Question findQuestionMaxId(Long subjectId) {
		// TODO Auto-generated method stub
		return questionFactory.create(subjectId).findTopByParentIsNullOrderByIdDesc();
	}

}
