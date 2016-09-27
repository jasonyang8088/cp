package com.zxxk.zyglpt.repository;

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


}
