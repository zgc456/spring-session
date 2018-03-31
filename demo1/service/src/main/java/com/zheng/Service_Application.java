package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import javax.xml.ws.Service;

/**
 * Created by lenovo on 2018/3/29.
 */
@SpringBootApplication
@EnableRedisHttpSession //启动httpsession
@EnableDiscoveryClient //发现服务方,用于给eureka服务 并且通过ribbon调用
public class Service_Application {
    public static void main(String[] args) {
        SpringApplication.run(Service_Application.class,args);
    }
}
