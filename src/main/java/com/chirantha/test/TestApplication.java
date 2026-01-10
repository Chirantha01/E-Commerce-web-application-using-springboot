package com.chirantha.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class TestApplication {

	@ResponseBody
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);

		// dev developer = new dev();
		// developer.build();
	}

}
