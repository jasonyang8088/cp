package com.zxxk.zyglpt.service;

import com.zxxk.zyglpt.entity.Question;

public interface QuestionService {
	
	public Integer updateQuestion(Long subjectId,Long maxId);

	@SuppressWarnings("rawtypes")
	public Question findQuestionMaxId(Long id);

}
