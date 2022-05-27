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
    fun testEmployeeDirectoryCorrectInstance() {
        assertTrue(employeeDirectory is Employee)
    }

    @Test
    fun testEmployeeDirectoryIncorrectInstance() {
        assertFalse(employeeDirectory !is Employee)
    }

    @Test
    fun testSupervisorDirectoryCorrectInstance() {
        assertTrue(supervisorDirectory is Employee)
    }

    @Test
    fun testSupervisorDirectoryIncorrectInstance() {
        assertFalse(supervisorDirectory !is Employee)
    }

    @Test
    fun testManagerDirectoryCorrectInstance() {
        assertTrue(managerDirectory is Employee)
    }

    @Test
    fun testManagerDirectoryIncorrectInstance() {
        assertFalse(managerDirectory !is Employee)
    }

    @Test
    fun testEmployeeDirectoryExpectedCount() {
        employeeDirectory.addEmployee(developer1)
        employeeDirectory.addEmployee(developer2)

        assertEquals(2, employeeDirectory.totalEmployee())
    }

    @Test
    fun testEmployeeDirectoryUnexpectedCount() {
        employeeDirectory.addEmployee(developer1)
        employeeDirectory.addEmployee(developer2)

        assertNotEquals(0, employeeDirectory.totalEmployee())
    }

    @Test
    fun testSupervisorDirectoryExpectedCount() {
        supervisorDirectory.addEmployee(supervisor)

        assertEquals(1, supervisorDirectory.totalEmployee())
    }

    @Test
    fun testSupervisorDirectoryUnexpectedCount() {
        supervisorDirectory.addEmployee(supervisor)

        assertNotEquals(0, supervisorDirectory.totalEmployee())
    }

    @Test
    fun testManagerDirectoryExpectedCount() {
        managerDirectory.addEmployee(manager)

        assertEquals(1, managerDirectory.totalEmployee())
    }

    @Test
    fun testManagerDirectoryUnexpectedCount() {
        managerDirectory.addEmployee(manager)

        assertNotEquals(0, managerDirectory.totalEmployee())
    }

    @Test
    fun testCompanyDirectoryExpectedCount() {
        companyDirectory.addEmployee(employeeDirectory)
        companyDirectory.addEmployee(supervisorDirectory)
        companyDirectory.addEmployee(managerDirectory)

        assertEquals(3, companyDirectory.totalEmployee())
    }

    @Test
    fun testCompanyDirectoryUnexpectedCount() {
        companyDirectory.addEmployee(employeeDirectory)
        companyDirectory.addEmployee(supervisorDirectory)
        companyDirectory.addEmployee(managerDirectory)

        assertNotEquals(0, companyDirectory.totalEmployee())
    }
}