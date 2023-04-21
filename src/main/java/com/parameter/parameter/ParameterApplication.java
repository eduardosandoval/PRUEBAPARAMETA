package com.parameter.parameter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
/*
 * @EnableJpaRepositories(basePackages = {"com.gym.repository"})
 */@EntityScan(basePackages = {"com.parameter.entity"})
@ComponentScan(basePackages = {"com.parameter.controller,com.parameter.service,com.parameter.Impl,com.parameter.repository"})
@SpringBootApplication
public class ParameterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParameterApplication.class, args);
	}

}
