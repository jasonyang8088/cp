package com.zxxk.zyglpt.service;

import com.zxxk.zyglpt.controller.rest.form.QuestionSearchForm;

public interface QuestionService {

	Long count(Long subjectId);

	Long countByForm(QuestionSearchForm form, Long subjectId);

}
