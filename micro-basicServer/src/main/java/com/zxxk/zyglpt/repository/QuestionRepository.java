package com.zxxk.zyglpt.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import com.zxxk.zyglpt.entity.Question;

@SuppressWarnings("rawtypes")
@NoRepositoryBean
public interface QuestionRepository<T extends Question> extends JpaRepository<T, Long>,JpaSpecificationExecutor<T> {

	List<Question> findByQuestionTypeIdAndSplitStatus(long l, byte b);

	List<Question> findTop1000ByQuestionTypeIdAndSplitStatus(long l, byte b);

	List<Question> findByIdGreaterThan(Long maxid, Pageable pageRequest);
	
	

}
