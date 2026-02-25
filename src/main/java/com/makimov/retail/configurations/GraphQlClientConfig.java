package com.makimov.retail.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;

@Configuration
public class GraphQlClientConfig {

    @Value("${spring.graphql.client.url}")
    private String graphqlUrl;

    @Bean
    HttpGraphQlClient httpGraphQlClient() {
        return HttpGraphQlClient.builder()
                .url(this.graphqlUrl)
                .codecConfigurer(configurer -> configurer.defaultCodecs().maxInMemorySize(32 * 1024 * 1024)) // 32 MB
                .build();
    }
}
