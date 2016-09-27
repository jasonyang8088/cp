package com.zxxk.zyglpt.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zxxk.zyglpt.entity.BasicKnowledgePoint;

public interface BasicKnowledgePointRepository extends JpaRepository<BasicKnowledgePoint, Long>,JpaSpecificationExecutor<BasicKnowledgePoint>{

	List<BasicKnowledgePoint> findByDepth(byte b);

	List<BasicKnowledgePoint> findBySubjectId(Long subjectId, Sort sort);

	List<BasicKnowledgePoint> findBySubjectIdAndDepth(Long subjectId, byte depth);

	List<BasicKnowledgePoint> findByParentId(Long bkpId1);

}
