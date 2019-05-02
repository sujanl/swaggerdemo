package com.sujandemo.swaggerdemo;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class ServletInitalizer {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SwaggerdemoApplication.class);
	}
}
