package com.rocketmq.cloud.youxia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MasterUpdateOnConsumer {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(MasterUpdateOnConsumer.class);
        springApplication.run();
    }
}
