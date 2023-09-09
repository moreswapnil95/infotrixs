package com.example.infotrixys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"repository"})
@EntityScan(basePackages = {"entity"})
@ComponentScan(basePackages = {"service","controller"})
public class InfotrixysApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfotrixysApplication.class, args);
	}

}
