package com.zxxk.zyglpt.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zxxk.zyglpt.entity.QuestionSearchSpec;

public interface QuestionSearchSpecRepository extends JpaRepository<QuestionSearchSpec, Long>,JpaSpecificationExecutor<QuestionSearchSpec>{

	Slice<QuestionSearchSpec> findByIdGreaterThan(Long id, Pageable pageable);

}
