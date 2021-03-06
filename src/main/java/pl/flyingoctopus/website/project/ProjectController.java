package pl.flyingoctopus.website.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("projects")
public class ProjectController {

    @GetMapping
    public String hello() {
        return "hello";
    }

    @PostMapping
    public String hello(@RequestBody HelloDTO hello) {
        return "hello, " + hello.name;
    }

}
