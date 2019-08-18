package te

import org.apache.commons.lang3.RandomStringUtils
import spock.lang.Specification
import spock.lang.Subject

class ServiceTwoTest extends Specification {

    @Subject
    ServiceTwo serviceTwo = [Mock(ServiceOne)]

    def "delegates to ServiceOne for random string generation"() {
        given:
            String ourRandomString = RandomStringUtils.randomAlphabetic(10)

        and:
            serviceTwo.one.randString() >> ourRandomString

        expect:
            serviceTwo.randString() == ourRandomString
    }

}
