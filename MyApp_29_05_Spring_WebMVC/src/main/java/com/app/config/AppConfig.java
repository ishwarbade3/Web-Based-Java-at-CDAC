package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.app")
@EnableWebMvc
public class AppConfig {
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolve = new InternalResourceViewResolver();

		resolve.setPrefix("/WEB-INF/views/");
		resolve.setSuffix(".jsp");
		return resolve;
	}

}
