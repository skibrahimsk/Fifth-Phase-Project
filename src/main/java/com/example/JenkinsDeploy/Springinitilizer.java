package com.example.JenkinsDeploy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class Springinitilizer extends SpringBootServletInitializer
{
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JenkinsDeployApplication.class);
	}
 

}
