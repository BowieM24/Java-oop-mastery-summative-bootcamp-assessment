package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question09_EmployeeTest {

    @Test
    void managerShouldReceiveBonus() {

        Question09_Employee employee =
                new Question09_Manager(
                        "Sarah"
                );

        assertEquals(
                5000,
                employee.calculateBonus()
        );
    }

    @Test
    void developerShouldReceiveBonus() {

        Question09_Employee employee =
                new Question09_Developer(
                        "John"
                );

        assertEquals(
                2000,
                employee.calculateBonus()
        );
    }

    @Test
    void shouldSupportPolymorphism() {

        Question09_Employee employee;

        employee =
                new Question09_Manager(
                        "Manager"
                );

        assertEquals(
                5000,
                employee.calculateBonus()
        );

        employee =
                new Question09_Developer(
                        "Developer"
                );

        assertEquals(
                2000,
                employee.calculateBonus()
        );
    }

    @Test
    void shouldReturnEmployeeName() {

        Question09_Employee employee =
                new Question09_Manager(
                        "Sarah"
                );

        assertEquals(
                "Sarah",
                employee.getName()
        );
    }
}