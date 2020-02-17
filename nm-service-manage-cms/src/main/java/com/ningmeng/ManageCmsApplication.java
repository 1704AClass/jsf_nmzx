package com.ningmeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by asus on 2020/2/11.
 */
@SpringBootApplication
@EntityScan("com.ningmeng.framework.domain.cms")
@ComponentScan(basePackages = {"com.ningmeng.api"})
@ComponentScan(basePackages = {"com.ningmeng.manage_cms"})
@ComponentScan(basePackages = {"com.ningmeng.framework"})
public class ManageCmsApplication {
    public static void main(String[] args){
        SpringApplication.run(ManageCmsApplication.class,args);
    }



}
