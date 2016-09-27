package com.zxxk.zyglpt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zxxk.zyglpt.entity.QuestionSearchSpec;
import com.zxxk.zyglpt.repository.QuestionSearchSpecRepository;
import com.zxxk.zyglpt.service.QuestionSearchSpecService;
import com.zxxk.zyglpt.util.ServerConfig;

@Service
public class QuestionSearchSpecServiceImpl implements QuestionSearchSpecService {
	
	@Autowired
	private ServerConfig serverConfig;
	
	@Autowired
	private QuestionSearchSpecRepository questionSearchSpecRepository;

	@Override
	public Integer updateQuestionSerachSpec(Long id) {
		RestTemplate  template=new RestTemplate();
		QuestionSearchSpec[] list=template.getForObject(serverConfig.getUrl()+"/questionsearchspecs/maxid/"+id+"/size/100",QuestionSearchSpec[].class);
		for(QuestionSearchSpec o:list){
			System.out.println(o);
			try {
				questionSearchSpecRepository.save(o);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list.length;
	}

}
