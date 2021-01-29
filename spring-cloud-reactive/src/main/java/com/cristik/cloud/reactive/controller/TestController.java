package com.cristik.cloud.reactive.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author zhenghua.ni
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public Mono<String> test(ServerWebExchange serverWebExchange) {
        serverWebExchange.getRequest();
        return Mono.just("111");
    }

    @GetMapping("/get2")
    public Flux<String> test2(ServerWebExchange serverWebExchange) {
        serverWebExchange.getRequest();
        return Flux.just("1", "2", "3");
    }

}
