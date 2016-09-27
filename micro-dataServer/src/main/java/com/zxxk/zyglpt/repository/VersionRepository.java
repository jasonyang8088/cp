package com.zxxk.zyglpt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.zxxk.zyglpt.entity.Version;

public interface VersionRepository extends JpaRepository<Version, Long>,JpaSpecificationExecutor<Version>{

	List<Version> findBySubjectId(Long subjectId);

	@Modifying
	@Query("update #{#entityName} t set t.status=?2 where t.id=?1")
	public void changeStatus(Long id,byte status);

	List<Version> findBySubjectIdAndStatus(Long subjectId, byte b);


}
