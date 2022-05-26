package structural.composite

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class TestComposite {
    val developer1 = Developer()
    val developer2 = Developer()
    val supervisor = Supervisor()
    val manager = Manager()

    val employeeDirectory = EmployeeDirectory()
    val supervisorDirectory = EmployeeDirectory()
    val managerDirectory = EmployeeDirectory()
    val companyDirectory = EmployeeDirectory()

    @Test
    fun testEmployeeDirectoryType001() {
        assertTrue(employeeDirectory is Employee)
    }

    @Test
    fun testEmployeeDirectoryType002() {
        assertFalse(employeeDirectory !is Employee)
    }

    @Test
    fun testSupervisorDirectoryType001() {
        assertTrue(supervisorDirectory is Employee)
    }

    @Test
    fun testSupervisorDirectoryType002() {
        assertFalse(supervisorDirectory !is Employee)
    }

    @Test
    fun testManagerDirectoryType001() {
        assertTrue(managerDirectory is Employee)
    }

    @Test
    fun testManagerDirectoryType002() {
        assertFalse(managerDirectory !is Employee)
    }

    @Test
    fun testEmployeeDirectoryCount001() {
        employeeDirectory.addEmployee(developer1)
        employeeDirectory.addEmployee(developer2)

        assertEquals(2, employeeDirectory.totalEmployee())
    }

    @Test
    fun testEmployeeDirectoryCount002() {
        employeeDirectory.addEmployee(developer1)
        employeeDirectory.addEmployee(developer2)

        assertNotEquals(0, employeeDirectory.totalEmployee())
    }

    @Test
    fun testSupervisorDirectoryCount001() {
        supervisorDirectory.addEmployee(supervisor)

        assertEquals(1, supervisorDirectory.totalEmployee())
    }

    @Test
    fun testSupervisorDirectoryCount002() {
        supervisorDirectory.addEmployee(supervisor)

        assertNotEquals(0, supervisorDirectory.totalEmployee())
    }

    @Test
    fun testManagerDirectoryCount001() {
        managerDirectory.addEmployee(manager)

        assertEquals(1, managerDirectory.totalEmployee())
    }

    @Test
    fun testManagerDirectoryCount002() {
        managerDirectory.addEmployee(manager)

        assertNotEquals(0, managerDirectory.totalEmployee())
    }

    @Test
    fun testCompanyDirectoryCount001() {
        companyDirectory.addEmployee(employeeDirectory)
        companyDirectory.addEmployee(supervisorDirectory)
        companyDirectory.addEmployee(managerDirectory)

        assertEquals(3, companyDirectory.totalEmployee())
    }

    @Test
    fun testCompanyDirectoryCount002() {
        companyDirectory.addEmployee(employeeDirectory)
        companyDirectory.addEmployee(supervisorDirectory)
        companyDirectory.addEmployee(managerDirectory)

        assertNotEquals(0, companyDirectory.totalEmployee())
    }
}