package com.karlsangabriel;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;

@SpringBootApplication
public class ThymeleafDemoApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(ThymeleafDemoApplication.class, args);

		SpringTemplateEngine engine = (SpringTemplateEngine)appContext.getBean("springTemplateEngine");

		Map<String, String> item = new HashMap<>();
		Context context = new Context();
		context.setVariable("item", item);
		item.put("name", "Waffle");

		String content = engine.process("breakfast-menu", context);

		System.out.println(content);
	}
}
