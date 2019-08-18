package te

import spock.lang.Specification
import spock.lang.Subject

class ServiceTwoIntegrationTest extends Specification {

    @Subject
    ServiceTwo serviceTwo = [new ServiceOne()]

    def "fetching random string works"() {
        expect:
            serviceTwo.randString()
    }
}
