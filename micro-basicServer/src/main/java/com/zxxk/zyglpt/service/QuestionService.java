package com.zxxk.zyglpt.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.zxxk.zyglpt.controller.rest.form.QuestionSearchForm;
import com.zxxk.zyglpt.entity.Question;

public interface QuestionService {

	Long count(Long subjectId);

	Long countByForm(QuestionSearchForm form, Long subjectId);

	@SuppressWarnings("rawtypes")
	List<Question> findByMaxId(Long subjectId, Long maxid, Pageable pageRequest);

}
