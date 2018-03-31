package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by lenovo on 2018/3/29.
 */
@SpringBootApplication
@EnableZuulProxy      //zuul服务
@EnableDiscoveryClient  //从注册中心发现服务
@EnableRedisHttpSession //启动httpsession
public class Zuul_Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_Application.class,args);
    }
}
