package com.luv2code.demo.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    // add code for the /hello endpoint
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/dobadthing")
    public String doBadThing() {
        long time = System.currentTimeMillis();
        if(time % 2 == 0) {
            throw new RuntimeException("Current time is even");
        }
        return "Current time is odd " + time;
    }

}
