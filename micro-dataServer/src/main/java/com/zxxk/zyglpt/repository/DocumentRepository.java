package com.zxxk.zyglpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zxxk.zyglpt.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>,JpaSpecificationExecutor<Document> {


	Document findTopByTextbookidOrderByIdDesc(Long id);

}
