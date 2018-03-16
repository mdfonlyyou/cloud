package com.midutek.charger.config;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by z1ven on 2018/3/14.
 */
@Configuration
public class FeginConfiguration {
    @Bean
    Request.Options feignOptions() {
        return new Request.Options(100 * 1000, 100 * 1000);
    }
    @Bean
    Retryer feignRetryer() {
        return Retryer.NEVER_RETRY;
    }
}
