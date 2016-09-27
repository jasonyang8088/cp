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
import com.zxxk.zyglpt.entity.TextBook;
import com.zxxk.zyglpt.repository.TextBookRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class BookNodeServiceTest {

	@Autowired
	private BookNodeService bookNodeService;

	@Autowired
	private TextBookRepository textBookRepository;

	@Test
	public void updateBookNode() {
		List<TextBook> books = textBookRepository.findAll();
		for (TextBook b : books) {
			this.updateBookNode(b.getId());
		}
	}

	@Transactional
	@Rollback(false)
	public void updateBookNode(Long bookId) {
		bookNodeService.updateBookNode(bookId);
	}
}
