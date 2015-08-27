package companymanagement

class Manager extends Employee {
    static belongsTo = [company:Company]
    static hasMany = [employee:Employee]

    String department
    Employee employee
    Company company
    static constraints = {
        company(nullable: false, blank: false)
        employee(nullable: true)
        department(nullable: true)
    }
}
