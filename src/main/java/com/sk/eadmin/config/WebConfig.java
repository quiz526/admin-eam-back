package com.sk.eadmin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry registry) {
	registry.addMapping("/**")
	    .allowedOrigins("*")
	    .allowedMethods(
	      HttpMethod.GET.name(),
	      HttpMethod.HEAD.name(),
	      HttpMethod.POST.name(),
	      HttpMethod.PUT.name(),
	      HttpMethod.DELETE.name(),
	      HttpMethod.PATCH.name(),
	      HttpMethod.OPTIONS.name()
	);
  }
}