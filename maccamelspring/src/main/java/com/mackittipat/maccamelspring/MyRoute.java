package com.mackittipat.maccamelspring;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:start").process(exchange -> {
            System.out.println(exchange.getIn().getBody(String.class));
        });
    }
}
