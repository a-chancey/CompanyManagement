package companymanagement

import companymanagement.Company
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Employee)
class EmployeeSpec extends Specification {
    def company = Mock(Company)

    def setup() {
    }

    def cleanup() {
    }

    void "test valid employee"() {
        when:
        Employee employee = new Employee (name: "Aaron",
                                phone: "5555555555",
                                wagePerHour: new BigDecimal(25),
                                manager: null,
                                company: company)
        employee.save()

        then:
        employee.validate()
    }

    void "test blank name constraint"() {
        when:
        Employee employee = new Employee (name: "",
                phone: "5555555555",
                wagePerHour: new BigDecimal(25),
                manager: null,
                company: company)
        employee.save()

        then:
        !employee.validate()
    }
    void "test null name constraint"() {
        when:
        Employee employee = new Employee (name: null,
                phone: "5555555555",
                wagePerHour: new BigDecimal(25),
                manager: null,
                company: company)
        employee.save()

        then:
        !employee.validate()
    }

    void "test null wage constraint"() {
        when:
        Employee employee = new Employee (name: "Aaron",
                wagePerHour: null,
                manager: null,
                company: company)
        employee.save()

        then:
        !employee.validate()
    }

    void "test null company constraint"() {
        when:
        Employee employee = new Employee (name: "Aaron",
                wagePerHour: new BigDecimal(25),
                manager: null,
                company: null)
        employee.save()

        then:
        !employee.validate()
    }

}
