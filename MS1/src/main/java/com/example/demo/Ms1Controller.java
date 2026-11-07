package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ms1")
public class Ms1Controller {

    @GetMapping("/add")
    public String add(@RequestParam int a,
                      @RequestParam int b) {

        int sum = a + b;

        return "MS 1.1 - Additon = " + sum;
    }
}