package com.example.gatewaykeyvault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class GatewayKeyvaultApplication implements CommandLineRunner {

    @Autowired
    private Environment environment;
    @Value("${Test}")
    private String hello;

    public static void main(String[] args) {
        SpringApplication.run(GatewayKeyvaultApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.hello);
        System.out.println(this.environment.getProperty("Test"));
    }
}
