package com.zxxk.zyglpt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zxxk.zyglpt.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>,JpaSpecificationExecutor<Subject>{

	List<Subject> findByStage(Byte stage);

	List<Subject> findByStageAndStatus(Byte stage, byte b);

	List<Subject> findByStatus(Byte b);

}
