package com.mackittipat.maccamel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class App {
    public static void main( String[] args ) throws Exception {

        CamelContext context = new DefaultCamelContext();

        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:/home/mac/Downloads/in?noop=true")
                        .convertBodyTo(String.class)
                        .process(exchange -> {
                            System.out.println(exchange.getIn().getBody());
                        })
                        .to("file:/home/mac/Downloads/out");
            }
        });

        context.start();
        Thread.sleep(3000);

    }
}
