package com.zxxk.zyglpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zxxk.zyglpt.entity.QuestionSearchSpec;

public interface QuestionSearchSpecRepository extends JpaRepository<QuestionSearchSpec, Long>,JpaSpecificationExecutor<QuestionSearchSpec>{


	QuestionSearchSpec findTopByOrderByIdDesc();

}
