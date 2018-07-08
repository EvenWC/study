package com.evan.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: Administrator
 * @Date: 2018/6/11 22:46
 * @Description:
 */
@SpringBootApplication
public class HelloApplication {

    @Bean
    public Runnable createRunnable(){
        return ()->{
            System.out.println("springboot is run");
        };
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HelloApplication.class);
        context.getBean(Runnable.class).run();
    }
}
