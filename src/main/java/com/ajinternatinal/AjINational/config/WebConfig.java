package com.ajinternatinal.AjINational.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	
	  @Override public void addViewControllers(ViewControllerRegistry registry) {
	  // TODO Auto-generated method stub
	  registry.addViewController("/courses").setViewName("courses.html"); 
	  registry.addViewController("/about").setViewName("about.html"); 
//	  registry.addViewController("/contact").setViewName("contact.html"); 
	  }
	 

}
