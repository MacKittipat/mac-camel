package com.mackittipat.maccamelspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main( String[] args ) throws InterruptedException {
        SpringApplication.run(App.class, args);
        Thread.sleep(3000);
    }
}
