package com.chrisgode.techtest.tests;

import com.chrisgode.techtest.SpringScanConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SpringScanConfiguration.class})
@ComponentScan
public class AcceptanceTestsConfiguration {
}
