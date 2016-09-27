package com.zxxk.zyglpt.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zxxk.zyglpt.entity.QuestionType;

public interface QuestionTypeRepository extends JpaRepository<QuestionType, Long>,JpaSpecificationExecutor<QuestionType> {

	List<QuestionType> findAll(Specification<QuestionType> createSpecification);

}
