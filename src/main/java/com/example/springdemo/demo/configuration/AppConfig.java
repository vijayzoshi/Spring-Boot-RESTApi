package com.example.springdemo.demo.configuration;

import com.example.springdemo.demo.DB;
import com.example.springdemo.demo.DevDb;
import com.example.springdemo.demo.ProdDb;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
   /* @Bean
    @ConditionalOnProperty(name= "project.mode", value ="production")
    public DB getdbBeanone(){
        return new ProdDb();
    }
    @Bean
    @ConditionalOnProperty(name= "project.mode", value ="development")
    public DB getdbBeantwo(){
        return new DevDb();
    }
     */
}
