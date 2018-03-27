package fun.glyn.joke.controllers;

import fun.glyn.joke.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJokes(Model model) {
        model.addAttribute("joke", this.jokeService.getJoke());

        return "chucknorris";
    }
}
