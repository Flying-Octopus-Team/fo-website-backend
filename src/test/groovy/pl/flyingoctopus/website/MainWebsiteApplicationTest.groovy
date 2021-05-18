package pl.flyingoctopus.website

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.testcontainers.spock.Testcontainers
import pl.flyingoctopus.website.member.repository.MemberRepository
import spock.lang.Specification


@Testcontainers
@SpringBootTest
@ContextConfiguration(initializers = EnvironmentInitializer.Initializer.class)
class MainWebsiteApplicationTest extends Specification {

    @Autowired
    MemberRepository memberRepository

    def "context should load"() {
        expect:
            memberRepository != null
    }

}
