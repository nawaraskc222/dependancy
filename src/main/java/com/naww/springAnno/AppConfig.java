package com.naww.springAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration

@ComponentScan(basePackages="com.naww.springAnno")


public class AppConfig {
	
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//
//		@Bean
//	
//		public MobileProcessor getProcessor() {
//			return new Snapdragon();
//			
//		}
}
