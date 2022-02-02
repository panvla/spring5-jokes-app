package com.vladimirpandurov.spring5jokesapp.controllers;

import com.vladimirpandurov.spring5jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }
    @RequestMapping({"/","","index","index.html"})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }

}
