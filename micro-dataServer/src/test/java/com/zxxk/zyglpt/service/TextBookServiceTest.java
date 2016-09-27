package com.zxxk.zyglpt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zxxk.zyglpt.Application;
import com.zxxk.zyglpt.entity.Version;
import com.zxxk.zyglpt.repository.VersionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)

public class TextBookServiceTest {

	@Autowired
	private TextBookService textBookService;

	@Autowired
	private VersionRepository versionRepository;

	@Test
	public void updateTextBook() {
		List<Version> versions = versionRepository.findAll();
		for (Version v : versions) {
			this.updateTextBook(v.getId());
		}
	}

	@Transactional
	@Rollback(false)
	public void updateTextBook(Long versionId) {
		textBookService.updateTextBook(versionId);
	}
}
