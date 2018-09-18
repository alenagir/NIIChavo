package test.modelTest;

import model.people.Education;
import model.people.Employee;
import model.people.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee = new Employee("Имя", 1900, "000000", "Null", Education.HIGH, Position.RESEARCHASSIST, 8, 1.0 );
    Employee employee1 = new Employee("Имя", 1900, "000000", "Null", Education.HIGH, Position.RESEARCHASSIST, 8, 1.0);
    Employee employee2 = new Employee("Имя", 1901, "000000", "Null", Education.NO,  Position.RESEARCHASSIST, 8, 1.0);



    @Test
    void PositiveEqualsSalary() {
        assertEquals(8, employee.Salary());
    }

    @Test
    void NegativeEqualsSalary() {
        assertNotEquals(9, employee.Salary() );
    }

    @Test
    void PositiveSameSalary() {
        Employee employee1 = employee;
        assertNotSame(employee.Salary(), employee1.Salary() );
    }

    @Test
    void NegativeSameSalary() {
        assertNotSame(employee.Salary(), employee1.Salary() );
    }


    @Test
    void PositiveBonusSalaryEqualsSalaryWithBonus_0() {
        int bonus = 0;
        assertEquals(8, employee.bonusSalary(bonus));
    }

    @Test
    void PositiveEqualsBonusSalaryWithBonus() {
        int bonus = 5;
        assertEquals(8.4, employee.bonusSalary(bonus));
    }

    @Test
    void NegativeEqualsBonusSalaryWithBonus() {
        int bonus = 5;
        assertNotEquals(8, employee.bonusSalary(bonus));
    }


    @Test
    void PositiveEquals() {
        assertTrue(employee.equals(employee1));
    }

    @Test
    void NegativeEquals() {
        assertFalse(employee.equals(employee2));
    }
}