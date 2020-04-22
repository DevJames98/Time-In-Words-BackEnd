package com.revature.time.time.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    // TODO Auto-generated method stub
    registry.addMapping("/**") // all endpoints in the api (TO BE CHANGED)
        .allowedOrigins("http://localhost:3000", "http://localhost:2020") // allow this origin
        .allowedMethods("PUT", "DELETE", "GET", "OPTIONS", "POST", "PATCH")
        .allowedHeaders("header1", "Content-Type", "Authorization")
        // .exposedHeaders("header1", "header2")
        .allowCredentials(true);
  }

}