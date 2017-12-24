package com.bellinfo.cricket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.bellinfo.cricket")
public class PlayersApplication {
	public static void main(String[] args) {
		SpringApplication.run(PlayersApplication.class, args);
		System.out.println("Hello World!");
	}
}
