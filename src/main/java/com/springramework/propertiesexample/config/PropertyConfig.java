package com.springramework.propertiesexample.config;

import com.springramework.propertiesexample.examplebeans.FakeDataSource;
import com.springramework.propertiesexample.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties"),
})
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${spring.username}")
    String username;

    @Value("${spring.password}")
    String password;

    @Value("${spring.dburl}")
    String dburl;

    @Value("${spring.jms.username}")
    String jmsUsername;

    @Value("${spring.jms.password}")
    String jmsPassword;

    @Value("${spring.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(environment.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setDburl(dburl);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);

        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer
                = new PropertySourcesPlaceholderConfigurer();

        return configurer;
    }
}
