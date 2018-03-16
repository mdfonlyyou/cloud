package com.midutek.charger;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ChargerApplication {

	private static Logger logger = Logger.getLogger(ChargerApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ChargerApplication.class, args);
		logger.info("============= SpringBoot Start Success =============");
	}
}
