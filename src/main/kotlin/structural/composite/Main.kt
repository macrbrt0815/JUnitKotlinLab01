package structural.composite

fun main(args: Array<String>) {
    val developer1 = Developer()
    val developer2 = Developer()
    val supervisor = Supervisor()
    val manager = Manager()
    val employeeDirectory = EmployeeDirectory()
    employeeDirectory.addEmployee(developer1)
    employeeDirectory.addEmployee(developer2)
    val supervisorDirectory = EmployeeDirectory()
    supervisorDirectory.addEmployee(supervisor)
    val managerDirectory = EmployeeDirectory()
    managerDirectory.addEmployee(manager)
    val companyDirectory = EmployeeDirectory()
    companyDirectory.addEmployee(employeeDirectory)
    companyDirectory.addEmployee(supervisorDirectory)
    companyDirectory.addEmployee(managerDirectory)
    companyDirectory.printEmployee()

}