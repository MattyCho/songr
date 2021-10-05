package com.springLab.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class helloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        System.out.println("Hello, World!");
        return "helloWorld.html";
    }

    @GetMapping("/capitalize/{word}")
    public String capitalize(Model m, @PathVariable String word) {
        String wordCapitalized = word.toUpperCase();
        m.addAttribute("wordToCapitalize", wordCapitalized);
        return "capitalize.html";
    }
}
