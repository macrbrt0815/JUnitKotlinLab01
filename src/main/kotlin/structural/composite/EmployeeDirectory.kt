package structural.composite

class EmployeeDirectory : Employee {
    private val employeeList: MutableList<Employee> = ArrayList()

    fun addEmployee(employee: Employee) {
        employeeList.add(employee)
    }

    fun removeEmployee(employee: Employee) {
        employeeList.remove(employee)
    }

    override fun printEmployee() {}
}