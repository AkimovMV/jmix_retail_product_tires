package com.makimov.retail.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;

@Configuration
public class GraphQlClientConfig {
    @Bean
    HttpGraphQlClient httpGraphQlClient() {
        return HttpGraphQlClient.builder()
                .url("http://localhost:5001/")
                .build();
    }
}
