package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question04_CourseTest {

    @Test
    void shouldEnrollStudents() {

        Question04_Course course =
                new Question04_Course(
                        "Java"
                );

        course.enroll(
                new Question04_Student("John")
        );

        course.enroll(
                new Question04_Student("Mary")
        );

        assertEquals(
                2,
                course.studentCount()
        );
    }

    @Test
    void newCourseShouldStartEmpty() {

        Question04_Course course =
                new Question04_Course(
                        "Java"
                );

        assertEquals(
                0,
                course.studentCount()
        );
    }

    @Test
    void shouldReturnCourseName() {

        Question04_Course course =
                new Question04_Course(
                        "Java"
                );

        assertEquals(
                "Java",
                course.getCourseName()
        );
    }
}