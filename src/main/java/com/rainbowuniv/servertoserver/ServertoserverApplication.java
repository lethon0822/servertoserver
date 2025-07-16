package com.rainbowuniv.servertoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServertoserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServertoserverApplication.class, args);
    }

}
