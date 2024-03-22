package com.ssga.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaMavenController {

	@GetMapping("/status")
    public String statusOfApplication() {
        return "The application is up and running !!!!!!!!!!!";
    }
}
