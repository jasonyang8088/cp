package com.zxxk.zyglpt.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zxxk.zyglpt.repository.QuestionRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorBiologyRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorChemistryRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorChineseRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorEnglishRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorGeographyRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorHistoryRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorInformationRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorMathRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorPhysicsRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorPoliticsRepository;
import com.zxxk.zyglpt.repository.question.QuestionJuniorScienceRepository;
import com.zxxk.zyglpt.repository.question.QuestionSeniorBiologyRepository;
import com.zxxk.zyglpt.repository.question.QuestionSeniorChemistryRepository;
import com.zxxk.zyglpt.repository.question.QuestionSeniorChineseRepository;
import com.zxxk.zyglpt.repository.question.QuestionSeniorEnglishRepository;
import com.zxxk.zyglpt.repository.question.QuestionSeniorGeographyRepository;
import com.zxxk.zyglpt.repository.question.QuestionSeniorHistoryRepository;
import com.zxxk.zyglpt.repository.question.QuestionSeniorInformationRepository;
import com.zxxk.zyglpt.repository.question.QuestionSeniorMathRepository;
import com.zxxk.zyglpt.repository.question.QuestionSeniorPhysicsRepository;
import com.zxxk.zyglpt.repository.question.QuestionSeniorPoliticsRepository;

@Repository
public class QuestionFactory {

	@Autowired
	private QuestionJuniorChineseRepository questionJuniorChineseRepository;
	
	@Autowired
	private QuestionJuniorMathRepository questionJuniorMathRepository;
	
	@Autowired
	private QuestionJuniorBiologyRepository questionJuniorBiologyRepository;
	
	@Autowired
	private QuestionJuniorEnglishRepository questionJuniorEnglishRepository;
	
	@Autowired
	private QuestionJuniorPhysicsRepository questionJuniorPhysicsRepository;
	
	@Autowired
	private QuestionJuniorChemistryRepository questionJuniorChemistryRepository;
	
	@Autowired
	private QuestionJuniorPoliticsRepository questionJuniorPoliticsRepository;
	
	@Autowired
	private QuestionJuniorHistoryRepository questionJuniorHistoryRepository;
	
	@Autowired
	private QuestionJuniorGeographyRepository questionJuniorGeographyRepository;
	
	@Autowired
	private QuestionJuniorScienceRepository questionJuniorScienceRepository;
	
	@Autowired
	private QuestionJuniorInformationRepository questionJuniorInformationRepository;
	
	
	@Autowired
	private QuestionSeniorChineseRepository questionSeniorChineseRepository;
	
	@Autowired
	private QuestionSeniorMathRepository questionSeniorMathRepository;
	
	@Autowired
	private QuestionSeniorBiologyRepository questionSeniorBiologyRepository;
	
	@Autowired
	private QuestionSeniorEnglishRepository questionSeniorEnglishRepository;
	
	@Autowired
	private QuestionSeniorPhysicsRepository questionSeniorPhysicsRepository;
	
	@Autowired
	private QuestionSeniorChemistryRepository questionSeniorChemistryRepository;
	
	@Autowired
	private QuestionSeniorPoliticsRepository questionSeniorPoliticsRepository;
	
	@Autowired
	private QuestionSeniorHistoryRepository questionSeniorHistoryRepository;
	
	@Autowired
	private QuestionSeniorGeographyRepository questionSeniorGeographyRepository;
	
	@Autowired
	private QuestionSeniorInformationRepository questionSeniorInformationRepository;
	
	@SuppressWarnings("rawtypes")
	private QuestionRepository qr;
	
	@SuppressWarnings("rawtypes")
	public QuestionRepository create(Long subjectId){
		switch(subjectId.intValue()){
		case 201:
			qr=questionJuniorChineseRepository;
			break;
		case 202:
			qr=questionJuniorMathRepository;
			break;
		case 203:
			qr=questionJuniorEnglishRepository;
			break;
		case 204:
			qr=questionJuniorPhysicsRepository;
			break;
		case 205:
			qr=questionJuniorChemistryRepository;
			break;
		case 206:
			qr=questionJuniorBiologyRepository;
			break;
		case 207:
			qr=questionJuniorPoliticsRepository;
			break;
		case 208:
			qr=questionJuniorHistoryRepository;
			break;
		case 209:
			qr=questionJuniorGeographyRepository;
			break;
		case 210:
			qr=questionJuniorScienceRepository;
			break;
		case 211:
			qr=questionJuniorInformationRepository;
			break;
		case 301:
			qr=questionSeniorChineseRepository;
			break;
		case 302:
			qr=questionSeniorMathRepository;
			break;
		case 303:
			qr=questionSeniorEnglishRepository;
			break;
		case 304:
			qr=questionSeniorPhysicsRepository;
			break;
		case 305:
			qr=questionSeniorChemistryRepository;
			break;
		case 306:
			qr=questionSeniorBiologyRepository;
			break;
		case 307:
			qr=questionSeniorPoliticsRepository;
			break;
		case 308:
			qr=questionSeniorHistoryRepository;
			break;
		case 309:
			qr=questionSeniorGeographyRepository;
			break;
		case 311:
			qr=questionSeniorInformationRepository;
			break;
		default:
			qr=questionJuniorChineseRepository;
		}
		return qr;
	}
}
