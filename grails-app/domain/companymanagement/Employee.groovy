package companymanagement

class Employee {
    static belongsTo = [company:Company]
    static hasOne = [manager:Manager]

    String name
    String phone
    BigDecimal wagePerHour
    Manager manager
    Company company

    static constraints = {
        name(nullable: false, blank: false)
        phone(nullable: true, blank: true)
        wagePerHour(nullable: false, blank: false)
        manager(nullable: true, blank: true)
        company(nullable: false)

    }
}
