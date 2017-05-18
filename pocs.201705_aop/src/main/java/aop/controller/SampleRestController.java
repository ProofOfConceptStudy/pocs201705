package aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aop.service.SampleService;

@RestController
public class SampleRestController {
    @Autowired
    SampleService sampleService;

    @RequestMapping("/")
    public String home() {
        sampleService.execute();
        return "AOP Log Sample";
    }
}