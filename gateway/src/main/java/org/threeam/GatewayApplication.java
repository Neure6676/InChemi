package org.threeam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator inchemiRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p
                        .path("/inchemi/account/**")
                        .filters( f -> f.rewritePath("/inchemi/account/(?<segment>.*)","/${segment}")
                                .addResponseHeader("InChemi-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://ACCOUNT"))
                .route(p -> p
                        .path("/inchemi/molecule/**")
                        .filters( f -> f.rewritePath("/inchemi/molecule/(?<segment>.*)","/${segment}")
                                .addResponseHeader("InChemi-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://MOLECULE")).build();
    }

}
