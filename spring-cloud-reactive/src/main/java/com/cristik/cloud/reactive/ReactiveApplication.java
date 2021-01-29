package com.cristik.cloud.reactive;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zhenghua.ni
 */
@SpringBootApplication
public class ReactiveApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ReactiveApplication.class);
        builder.run(args);
    }

}
