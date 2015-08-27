package companymanagement

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Manager)
class ManagerSpec extends Specification {
    def company = Mock(Company)

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        when:
        Manager manager = new Manager(name: "Aaron",
                phone: "5555555555",
                wagePerHour: new BigDecimal(25),
                manager: null,
                company: company,
                department: "Electronics",
                employee: null)

        then:
        manager.validate()
    }
}
