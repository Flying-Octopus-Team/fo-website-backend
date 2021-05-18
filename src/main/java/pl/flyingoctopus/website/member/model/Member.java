package pl.flyingoctopus.website.member.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Member {
    @Id
    public String id;

    public String name;

    public Member(String name) {
        this.name = name;
    }
}
