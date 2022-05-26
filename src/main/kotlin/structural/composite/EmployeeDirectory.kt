package structural.composite

class EmployeeDirectory : Employee {
    private val employeeList: MutableList<Employee> = ArrayList()

    fun addEmployee(employee: Employee) {
        employeeList.add(employee)
        println("Employee added")
    }

    fun removeEmployee(employee: Employee) {
        employeeList.remove(employee)
    }

    fun totalEmployee() : Int {
        return employeeList.size
    }

    override fun printEmployee() {
        employeeList.forEach(Employee::printEmployee)
    }
}