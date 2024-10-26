package com.example.kubespring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {
	
	private Logger logger = LoggerFactory.getLogger(ReadyEventListener.class);
	
	@Value("${custom.property.value:none}")
	String value;
	
	@Autowired
	Environment env;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		logger.info("profile = " + Arrays.stream(env.getActiveProfiles()).toList());
		logger.info("custom property value = " + value);
	}
}
