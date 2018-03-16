package com.midutek.eureka;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.Filter;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

	private static Logger logger = Logger.getLogger(EurekaApplication.class);

	@Bean
	public Filter webRequestLoggingFilter() {
		return new CommonsRequestLoggingFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
		logger.info("============= CloudEureka Start Success =============");
	}
}
