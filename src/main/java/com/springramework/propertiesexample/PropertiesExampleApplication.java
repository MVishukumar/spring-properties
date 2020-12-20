package com.springramework.propertiesexample;

import com.springramework.propertiesexample.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PropertiesExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PropertiesExampleApplication.class, args);

		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean("fakeDataSource");
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getDburl());
	}

}
