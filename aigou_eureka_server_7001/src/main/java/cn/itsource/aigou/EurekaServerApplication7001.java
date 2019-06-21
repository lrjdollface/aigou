package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication//springboot应用
@EnableEurekaServer//注册中心
public class EurekaServerApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7001.class, args);
    }
}
