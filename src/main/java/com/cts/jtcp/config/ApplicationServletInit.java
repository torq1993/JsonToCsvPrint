package com.cts.jtcp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cts")
@SpringBootApplication
public class ApplicationServletInit extends SpringBootServletInitializer{

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
//	{
//		return application.sources(ApplicationServletInit.class);
//	}
	
	public static void main(String args[])
	{
		SpringApplication.run(ApplicationServletInit.class,args);
	}
}
