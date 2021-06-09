package pl.flyingoctopus.website.member.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.flyingoctopus.website.member.model.Member;

public interface MemberRepository extends MongoRepository<Member, String> {
    public Member findByName(String name);
}
