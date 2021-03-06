package ru.homecredit.springstart.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author dima
 */
@Getter
@Setter
@RestController
public class HelloWorldController implements InitializingBean {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello world";
    }

    @GetMapping(value = "/helloMan")
    public String helloMen(@RequestParam String name) {
        return "Hello " + name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" ********* HelloWorldController.afterPropertiesSet");
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println(" ********* PostConstruct");
    }
}
