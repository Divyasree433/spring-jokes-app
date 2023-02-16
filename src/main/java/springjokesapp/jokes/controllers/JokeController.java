package springjokesapp.jokes.controllers;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springjokesapp.jokes.services.JokeService;

@Controller
public class JokeController {
    private final JokeService jokeservice;
    public JokeController(JokeService jokeservice) {
        this.jokeservice = jokeservice;
    }
    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeservice.getJoke());

        return "index";
    }

}
