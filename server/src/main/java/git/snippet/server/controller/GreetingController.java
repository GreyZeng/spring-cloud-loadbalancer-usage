package git.snippet.server.controller;

import git.snippet.server.ServerApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class GreetingController {
    private static Logger log = LoggerFactory.getLogger(ServerApplication.class);
    private static final Random rand = new Random();
    private static final List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");

    @GetMapping("/greeting")
    public String greet() {
        log.info("Access /greeting");
        int randomNum = rand.nextInt(greetings.size());
        return greetings.get(randomNum);
    }

    @GetMapping("/")
    public String home() {
        log.info("Access /");
        return "Hi!";
    }
}
