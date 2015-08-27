package companymanagement

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Company)
class CompanySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test valid"() {
        when:
        Company company = new Company ( name: "test 1",
                phone: "5555555555",
                address: "123 Main St, Anytown, USA 01776")
        company.save()

        then:
        company.validate()
    }

    void "test name blank validation"() {
        when:
        Company company = new Company ( name: "",
                                        phone: "5555555555",
                                        address: "123 Main St, Anytown, USA 01776")

        then:
        !company.validate()
    }
    void "test name null validation"() {
        when:
        Company company = new Company ( name: null,
                phone: "5555555555",
                address: "123 Main St, Anytown, USA 01776")
        company.save()

        then:
        !company.validate()
    }

    void "test phone blank validation"() {
        when:
        Company company = new Company ( name: "",
                phone: "",
                address: "123 Main St, Anytown, USA 01776")
        company.save()

        then:
        !company.validate()
    }

    void "test phone null validation"() {
        when:
        Company company = new Company ( name: "",
                phone: null,
                address: "123 Main St, Anytown, USA 01776")
        company.save()

        then:
        !company.validate()
    }

    void "test address blank validation"() {
        when:
        Company company = new Company ( name: "",
                phone: "5555555555",
                address: "")
        company.save()

        then:
        !company.validate()
    }

    void "test address null validation"() {
        when:
        Company company = new Company ( name: "",
                phone: "5555555555",
                address: null)
        company.save()

        then:
        !company.validate()
    }
}
