package com.example.demo.Constroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hi_hxm {
// hello-world

    @RequestMapping("/hello")
    public String hello() {
        return "hello.html";
    }
}
