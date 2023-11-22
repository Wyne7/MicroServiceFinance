package com.mit.transcation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TranscationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TranscationApplication.class, args);
	}

}
