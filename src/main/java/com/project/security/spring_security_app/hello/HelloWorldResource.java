package com.project.security.spring_security_app.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldResource {

        @GetMapping("/hello-world")
        public String helloWorld() {
            return "Hello World";
        }
    }