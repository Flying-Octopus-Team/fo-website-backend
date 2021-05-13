package pl.flyingoctopus.website.member.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
public class Member {
    @Id
    public String id;

    public String name;

    public Member() {}

    public Member(String name) {
        this.name = name;
    }
}
