package com.metlife.arogyasutra.util;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class RestTemplateConfig {

    @Bean(name = "AIMLRestTemplate")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    // Optional: if you want to customize the request factory, e.g. for HTTP client pooling
    @Bean
    public ClientHttpRequestFactory clientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(5000);  // in milliseconds
        factory.setReadTimeout(10000);
        return factory;
    }
}
