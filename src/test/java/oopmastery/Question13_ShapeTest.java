package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question13_ShapeTest {

    @Test
    void circleShouldCalculateArea() {

        Question13_Shape shape =
                new Question13_Circle(2);

        assertEquals(
                Math.PI * 4,
                shape.area(),
                0.001
        );
    }

    @Test
    void rectangleShouldCalculateArea() {

        Question13_Shape shape =
                new Question13_Rectangle(
                        4,
                        5
                );

        assertEquals(
                20,
                shape.area()
        );
    }

    @Test
    void shouldSupportPolymorphism() {

        Question13_Shape shape;

        shape =
                new Question13_Circle(1);

        assertEquals(
                Math.PI,
                shape.area(),
                0.001
        );

        shape =
                new Question13_Rectangle(
                        2,
                        3
                );

        assertEquals(
                6,
                shape.area()
        );
    }

    @Test
    void zeroRectangleShouldHaveZeroArea() {

        Question13_Shape shape =
                new Question13_Rectangle(
                        0,
                        10
                );

        assertEquals(
                0,
                shape.area()
        );
    }
}