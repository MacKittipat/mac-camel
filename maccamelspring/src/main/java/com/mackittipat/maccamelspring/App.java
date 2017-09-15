package com.mackittipat.maccamelspring;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private CamelContext camelContext;

    public static void main( String[] args ) throws InterruptedException {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        ProducerTemplate producerTemplate = camelContext.createProducerTemplate();
        producerTemplate.sendBody("direct:start", "Hello");
    }
}
