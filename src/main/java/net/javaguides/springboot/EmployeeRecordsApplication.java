package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmployeeRecordsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeRecordsApplication.class, args);
    }
}
