package com.zxxk.zyglpt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zxxk.zyglpt.entity.TextBook;

public interface TextBookRepository extends JpaRepository<TextBook, Long>,JpaSpecificationExecutor<TextBook> {

	List<TextBook> findByVersionId(Long versionId);

	List<TextBook> findByVersionIdOrderByOrderId(Long versionId);

}
