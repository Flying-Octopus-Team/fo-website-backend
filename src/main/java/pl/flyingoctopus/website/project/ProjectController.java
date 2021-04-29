package pl.flyingoctopus.website.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {


    @GetMapping
    public String hello() {
        return "hello";
    }

    @PostMapping
    public String hello(String name) {
        return "hello, " + name;
    }

}