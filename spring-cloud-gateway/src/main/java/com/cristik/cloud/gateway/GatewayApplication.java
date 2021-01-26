package com.cristik.cloud.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.handler.predicate.CookieRoutePredicateFactory;
import org.springframework.cloud.gateway.support.NameUtils;

/**
 * @author zhenghua.ni
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {

//        System.out.println(NameUtils.normalizeRoutePredicateName(CookieRoutePredicateFactory.class));
        SpringApplicationBuilder builder = new SpringApplicationBuilder(GatewayApplication.class);
        builder.run(args);
    }
}
