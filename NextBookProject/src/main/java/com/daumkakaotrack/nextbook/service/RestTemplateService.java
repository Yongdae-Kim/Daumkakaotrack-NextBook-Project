package com.daumkakaotrack.nextbook.service;

import java.util.Map;

import javax.xml.transform.stream.StreamSource;

public interface RestTemplateService {

	public StreamSource getRestDataXml(String url, Class<StreamSource> responseType, Map<String, String> urlVariables);
}
