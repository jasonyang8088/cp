package com.zxxk.zyglpt.service;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zxxk.zyglpt.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@Transactional
public class PaperTypeServiceTest {
	
	@Autowired
	private PaperTypeService paperTypeService;

	@Test
	@Rollback(false)
	public void updatePaperType(){
		paperTypeService.updatePaperType();
	}
}
