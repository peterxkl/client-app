package com.dillon.clientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientAppApplication.class, args);
    }

    /*
    注意：如果这里不初始化这个bean而直接注入就会出现restTemplate无法注入的情况
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
