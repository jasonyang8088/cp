package com.zxxk.zyglpt.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.zxxk.zyglpt.controller.rest.form.DocumentSearchForm;
import com.zxxk.zyglpt.entity.Document;

public interface DocumentService {

	Long count(DocumentSearchForm form);

	List<Document> findAll(DocumentSearchForm form, Pageable pageRequest);

	List<Document> findByMaxId(Long maxid,DocumentSearchForm form, Pageable pageRequest);

}
