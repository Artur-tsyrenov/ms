package ru.ms.eurekaclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("hello-world/{name}")
    public String getHelloWorld(@PathVariable String name){
        return "Hello world" + name;
    }
}
