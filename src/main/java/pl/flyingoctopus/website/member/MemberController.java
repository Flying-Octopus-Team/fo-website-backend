package pl.flyingoctopus.website.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Mock controller to test if tests are working. To be removed when we have a proper ut
@RestController
@RequiredArgsConstructor
public class MemberController {

    @GetMapping
    public String helloMember() {
        return "Hello";
    }

}
