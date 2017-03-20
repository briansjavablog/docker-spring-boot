package com.blog.samples.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@Configuration*/
@SpringBootApplication
/*@ComponentScan(basePackages = "com.blog.samples")
@EnableJpaRepositories(basePackages = "com.blog.samples.boot.rest.repository")
@EntityScan(basePackages = "com.blog.samples.boot.rest.model")*/
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
   
}