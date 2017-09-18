package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @ClassName HelloWorldController
 * @Description: TODO  
 * @author: liubb  
 * @since: 2017年8月30日 下午6:32:30
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
