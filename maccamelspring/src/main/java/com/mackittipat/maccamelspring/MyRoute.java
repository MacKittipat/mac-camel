package com.mackittipat.maccamelspring;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("file:/home/mac/Downloads/in?noop=true")
                .convertBodyTo(String.class)
                .process(exchange -> {
                    System.out.println(exchange.getIn().getBody());
                })
                .to("file:/home/mac/Downloads/out");

    }
}
