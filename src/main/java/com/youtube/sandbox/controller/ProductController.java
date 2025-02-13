package com.youtube.sandbox.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ProductController {
    

    @GetMapping("/task/{name}")
    public String performTask(@PathVariable String name) {
        System.out.println("Performing task: " + name);
        return "Task " + name + " completed.";
    }

    @GetMapping("/error")
    public void generateError() {
        throw new RuntimeException("An intentional error occurred.");
    }
}
