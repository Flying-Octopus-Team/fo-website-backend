package pl.flyingoctopus.website.member

import spock.lang.Specification

class MemberControllerTest extends Specification {


    def "should return hello"() {
        given:
            def memberController = new MemberController()
        when:
            def response = memberController.helloMember()
        then:
            response == "Hello"
    }
}
