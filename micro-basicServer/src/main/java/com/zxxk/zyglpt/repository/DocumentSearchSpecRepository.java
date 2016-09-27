package com.zxxk.zyglpt.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zxxk.zyglpt.entity.DocumentSearchSpec;

/**
 * DocumentSearchSpecRepository
 * 
 * @author yangqijie
 * @time 2016年9月9日 下午2:03:52
 */
public interface DocumentSearchSpecRepository extends JpaRepository<DocumentSearchSpec, Long>,JpaSpecificationExecutor<DocumentSearchSpec>{

	List<DocumentSearchSpec> findByIdGreaterThan(Long id, Pageable pageable);


}
