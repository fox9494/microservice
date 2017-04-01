package org.chenll.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by chenlile on 17-3-28.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
