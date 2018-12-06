package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sherman
 * created in 2018/12/3
 */
@RestController
public class IndexController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
