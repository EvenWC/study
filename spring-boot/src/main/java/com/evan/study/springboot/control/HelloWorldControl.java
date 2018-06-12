package com.evan.study.springboot.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2018/6/11 22:47
 * @Description:
 */
@RestController
public class HelloWorldControl {


    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }


}
