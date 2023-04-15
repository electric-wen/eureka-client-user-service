package com.pingan.eurekaclientuserservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @GetMapping("/user/hello")
    public String hello() {
        log.info("日志打印成功：");
        return "hello,eureka";
    }
}
