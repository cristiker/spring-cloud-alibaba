package com.cristik.cloud.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractNameValueGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

/**
 * @author zhenghua.ni
 */
@Component
public class LogGatewayFilterFactory extends AbstractNameValueGatewayFilterFactory {
    
    private static final Logger logger = LoggerFactory.getLogger(LogGatewayFilterFactory.class);

    @Override
    public GatewayFilter apply(final NameValueConfig config) {
        return ((exchange, chain) -> {
            logger.info("request coming {},{}", config.getName(), config.getValue());
            ServerHttpRequest request = exchange.getRequest().mutate().build();
            ServerWebExchange serverWebExchange = exchange.mutate().request(request).build();
            return chain.filter(serverWebExchange);
        });
    }
}
