package com.chirantha.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dev {

    @RequestMapping("/")
    // @ResponseBody
    public String build() {
        System.out.println("First attempt to build");
        return "Build successful";
    }
}
