package structural.composite

class Manager : Employee {
    private var name: String? = null
    private var empID: Long = 0
    private var position: String? = "Manager"

    override fun printEmployee() {
        println(position)
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getEmpID(): Long {
        return empID
    }

    fun setEmpID(empID: Long) {
        this.empID = empID
    }

    fun getPosition(): String? {
        return position
    }

    fun setPosition(position: String?) {
        this.position = position
    }
}