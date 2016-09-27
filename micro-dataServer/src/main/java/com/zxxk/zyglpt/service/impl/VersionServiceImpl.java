package com.zxxk.zyglpt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zxxk.zyglpt.entity.Version;
import com.zxxk.zyglpt.repository.VersionRepository;
import com.zxxk.zyglpt.service.VersionService;
import com.zxxk.zyglpt.util.ServerConfig;

@Service
public class VersionServiceImpl implements VersionService {
	
	@Autowired
	private ServerConfig serverConfig;
	
	@Autowired
	private VersionRepository versionRepository;

	@Override
	public void updateVersion(Long subjectId) {
		RestTemplate  template=new RestTemplate();
		Version[] versions=template.getForObject(serverConfig.getUrl()+"/subject/"+subjectId+"/versions",Version[].class);
		for(Version v:versions){
			versionRepository.save(v);
		}
	}

}
