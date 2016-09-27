package com.zxxk.zyglpt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zxxk.zyglpt.entity.BookNode;

public interface BookNodeRepository extends JpaRepository<BookNode, Long>,JpaSpecificationExecutor<BookNode>{

	public List<BookNode> findByDepth(Byte b);

	public List<BookNode> findByTextbookVersionId(long l);
	
	public List<BookNode> findByTextbookIdAndDepth(Long textbookId, byte depth);

	public List<BookNode> findByParentId(Long booknodeId);

	public List<BookNode> findByTextbookIdAndStatus(Long id, byte b);
	
}
