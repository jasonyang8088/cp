package com.zxxk.zyglpt.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zxxk.zyglpt.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>,JpaSpecificationExecutor<Document> {


	List<Document> findByIdGreaterThanAndTextbookid(Long maxid, Long textbookid, Pageable pageRequest);

}
