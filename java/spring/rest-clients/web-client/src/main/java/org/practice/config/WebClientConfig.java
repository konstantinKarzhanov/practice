package org.practice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean("paymentWebClient")
    public WebClient webClient(@Value("${service.payment.url:http://localhost:8081/}") String baseUrl) {
        return WebClient.create(baseUrl);
    }
}
