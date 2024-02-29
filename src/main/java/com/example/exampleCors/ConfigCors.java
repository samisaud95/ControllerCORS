package com.example.exampleCors;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class ConfigCors {
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/user").allowedOrigins("http://localhost:8080")
                        .allowedMethods("GET","POST","DELETE","PUT")
                        .maxAge(3600);

            }
        };
    }
}
