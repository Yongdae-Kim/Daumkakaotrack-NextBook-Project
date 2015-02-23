package com.daumkakaotrack.nextbook.service;

import java.util.Map;

import javax.annotation.Resource;
import javax.xml.transform.stream.StreamSource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("restTemplateService")
public class RestTemplateServiceImpl implements RestTemplateService {
	@Resource(name = "restTemplate")
	private RestTemplate restTemplate;

	@Override
	public StreamSource getRestDataXml(String url,
			Class<StreamSource> responseType, Map<String, String> urlVariables) {
		StreamSource streamSourceResult = restTemplate.getForObject(url,
				responseType, urlVariables);
		return streamSourceResult;
	}
}
