package com.zxxk.zyk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zxxk.zyk.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

	List<Subject> findByStatus(Byte b);

}
