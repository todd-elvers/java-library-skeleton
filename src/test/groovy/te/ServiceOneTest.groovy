package te

import spock.lang.Specification
import spock.lang.Subject

class ServiceOneTest extends Specification {

    @Subject
    ServiceOne one = []

    def "can generate a random string"() {
        expect:
            one.randString()
    }

}
