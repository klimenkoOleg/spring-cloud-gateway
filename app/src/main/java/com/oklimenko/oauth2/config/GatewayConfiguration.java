package com.oklimenko.oauth2.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class GatewayConfiguration {

    /*@Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http.authorizeExchange().anyExchange().authenticated()
                .and().oauth2Login().and().csrf().disable().build();
    }*/

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.
                routes()
                .route(spec -> spec.path("/asd")
                        .uri("http://localhost:8081/oauth/token"))
                .build();
    }

}