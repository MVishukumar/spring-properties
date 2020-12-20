package com.springramework.propertiesexample;

import com.springramework.propertiesexample.examplebeans.FakeDataSource;
import com.springramework.propertiesexample.examplebeans.FakeJmsBroker;
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


		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) context.getBean("fakeJmsBroker");
		System.out.println(fakeJmsBroker.getUsername());
		System.out.println(fakeJmsBroker.getPassword());
		System.out.println(fakeJmsBroker.getUrl());
	}

}
