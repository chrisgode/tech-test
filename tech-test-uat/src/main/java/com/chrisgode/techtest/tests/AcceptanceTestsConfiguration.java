package com.chrisgode.techtest.tests;

import com.chrisgode.techtest.SpringScanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Import({SpringScanConfiguration.class})
@ComponentScan
@PropertySource("classpath:tests.properties")
public class AcceptanceTestsConfiguration {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
