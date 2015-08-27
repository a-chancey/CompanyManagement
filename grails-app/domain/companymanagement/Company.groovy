package companymanagement

class Company {
    String name
    String phone
    String address
    Employee employees

    static hasMany = [employees:Employee]

    static constraints = {
        name(nullable: false, blank: false)
        phone(nullable: false, blank: false)
        address(nullable: false, blank: false)
        employees(nullable: true)
    }
}
