package com.cybersoft.demospringboot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Anotation Định nghĩa đường dẫn
 * @Controller: Định nghĩa đường dẫn được dùng để trả ra nội dung html
 * @ResponseBody: Giúp trả nội dung kiểu String khi sử dụng với @Controller
 *
 * @RestController: Định nghĩa đường dẫn, nội dung trả về String (chuyên dùng để viết API)
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello() {
        return "Hello Spring Boot";
    }

    @GetMapping("/cybersoft")
    public String cybersoft() {
        return "Hello Cybersoft";
    }
}
