package com.talkingtan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 * <p>
 * author：Created by ttan on 2017/12/26 0026.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld() {
        return "hello world";
    }
}
